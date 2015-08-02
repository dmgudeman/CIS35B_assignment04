
/*import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.Socket;

// client
public class Client
{
    Socket socket = null;

    public void transfer(String host, int port, String outfile ) throws Exception
    {
        System.out.println("top of transfer method in Client");
        socket = new Socket(host, port);
        byte[] bytearray = new byte[1024];
        InputStream is = socket.getInputStream();
        FileOutputStream fos = new FileOutputStream(outfile);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int bytesRead = 0;
        int count = 0;
        while ((bytesRead = is.read(bytearray, 0, bytearray.length)) != -1)
        {
            bos.write(bytearray, 0, bytesRead);
            bos.flush();
            System.out.println(++count);
        }
        bos.close();
        socket.close();
    }
    public static void main(String[] argv) throws Exception
    {
        Client xfer = new Client();
        xfer.transfer("127.0.0.1", 1234, "/Users/davidgudeman/Documents/workspace/CIS35B_assignment04/test-download.csv");
        System.out.println("in main of Client");
    }
}
	*/