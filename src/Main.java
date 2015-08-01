import java.io.File;
import java.io.IOException;

/**
 * Created by davidgudeman on 7/31/15.
 */
public class Main
{
    public  static String FILE_TO_SEND = "/Users/davidgudeman/Documents/workspace/CIS35B_assignment04/CTStest.csv";
    public static File file = new File ("/Users/davidgudeman/Documents/workspace/CIS35B_assignment04/CTStest-down.csv");
    public static void main(String[] args) throws IOException, Exception
    {
        Gui gui = new Gui();

       /* new CTSServer().start();
        new CTSClient().start();
        ReadCsv r = new ReadCsv();
        r.readCsv();
        new STCServer().start();
        new STCClient().start();

*/

    }
}
