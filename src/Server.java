
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

// server
public class Server
{
    ServerSocket servsock = null;
    Socket socket = null;

    public void Transfer(int port,String sfile) throws IOException
    {
        servsock = new ServerSocket(port);
        File myFile = new File(sfile);
        while (true)
        {
            socket = servsock.accept();
            byte[] mybytearray = new byte[(int) myFile.length()];
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(myFile));
            bis.read(mybytearray, 0, mybytearray.length);
            OutputStream os = socket.getOutputStream();
            os.write(mybytearray, 0, mybytearray.length);
            os.flush();
            socket.close();
        }
    }

    public static void main(String[] args) throws IOException
    {
        Server xfer = new Server();
        xfer.Transfer(1234, "/Users/davidgudeman/Documents/workspace/CIS35B_assignment04/test.csv");
    }
}