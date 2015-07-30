import java.lang.*;
import java.io.*;
import java.net.*;

class Server
{
    // server
    ServerSocket server = null;
    // client
    Socket socket = null;

    // method to send a message
    public void sendMessage(String smsg)
    {
        try
        {
            // Creates a server socket, bound to the specified port
            server = new ServerSocket(1234);  // port 1234
            // Listens for a connection to be made to this socket and accepts it.
            // The method blocks until a connection is made.
            socket = server.accept();
            // <debug>
            System.out.print("Server has connected!\n");
            // The PrintWriter class enables you to write formatted data
            // to an underlying Writer
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
            // <debug>
            System.out.print("Sending string: " + smsg + "\n");
            // write message to port
            pw.print(smsg);
            // close the ports
            pw.close();
            socket.close();
            server.close();
        }
        catch(Exception e)
        {
            System.out.print("Connection failed\n");
        }
    }
    public static void main(String args[])
    {
        Server server = new Server();
        server.sendMessage("Hello from Server");
    }
}
