import java.io.File;
import java.io.IOException;

/**
 * Created by davidgudeman on 7/31/15.
 */
public class Main
{
    public  static String FILE_TO_SEND = "/Users/davidgudeman/Documents/workspace/CIS35B_assignment04/CTStest.csv";
    public static void main(String[] args) throws IOException, Exception
    {


        new CTSServer().start();
        new CTSClient().start();
        Server xferS = new Server();
        xferS.Transfer(1234, "/Users/davidgudeman/Documents/workspace/CIS35B_assignment04/test.csv");

        Client xferC = new Client();
        xferC.transfer("127.0.0.1", 1234, "/Users/davidgudeman/Documents/workspace/CIS35B_assignment04/test-download.csv");


    }
}
