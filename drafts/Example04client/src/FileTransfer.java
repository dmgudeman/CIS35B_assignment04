
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.Socket;

// client
public class FileTransfer
{
    Socket socket = null;

    public void transfer(String host, int port, String outfile ) throws Exception
    {
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
        FileTransfer xfer = new FileTransfer();
        xfer.transfer("127.0.0.1", 1234, "/Users/davidgudeman/Documents/workspace/Example04client/src/source-download.pdf");
    }
}
	