
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Nagesh Chauhan
 *
 */
public class ReadCsv {
    public void readCsv() {
        String csvFileToRead = "/Users/davidgudeman/Documents/workspace/CIS35B_assignment04/CTStest-down.csv";
        BufferedReader br = null;
        String line = "";
        String splitBy = ",";

        try {

            br = new BufferedReader(new FileReader(csvFileToRead));
            while ((line = br.readLine()) != null) {

                String[] cars = line.split(splitBy);
                System.out.println("<car>" +"\n\t<year>" + cars[0] + "</year>\n\t<make>"
                        + cars[1] + "</make>\n\t<model>" + cars[2] + "</model>\n\t<description>"
                        + cars[3] + "</description>\n\t<price>" + cars[4] + "</price>\n</car>");

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("Done with reading CSV");
    }
}
