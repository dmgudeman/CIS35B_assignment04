import javax.swing.*;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.lang.*;
import java.util.Scanner;


public class CTSClient implements Runnable {
    public static final int PORT = 3335;
    public static final int BUFFER_SIZE = 100;
    public static String FILE_TO_SEND = Gui.TF_inputFilename.getText();

    @Override

    public void run()
    {
        try
        {
            Thread thread = Thread.currentThread();
            Socket socket = new Socket("localhost", PORT);
            File file = new File(FILE_TO_SEND);
            System.out.println("CTSClient SwingUtilities.isEventDispatchThread(): " + SwingUtilities.isEventDispatchThread());
            System.out.println("CTSClient is being run by " + thread.getName() + " (" + thread.getId() + ")");
            work(socket, file);
        }
        catch (UnknownHostException e)
        {
            e.printStackTrace();
        }
        catch (IOException f)
        {
            f.printStackTrace();
        }
    }

    private void work(Socket socket, File file) throws IOException
    {
        ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());

        oos.writeObject(file.getName());

        FileInputStream fis = new FileInputStream(file);
        byte[] buffer = new byte[BUFFER_SIZE];
        Integer bytesRead = 0;

        while ((bytesRead = fis.read(buffer)) > 0)
        {
            oos.writeObject(bytesRead);
            oos.writeObject(Arrays.copyOf(buffer, buffer.length));
        }

        oos.close();
        ois.close();
        System.exit(0);
    }

}
