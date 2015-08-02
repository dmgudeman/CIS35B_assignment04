
import java.io.*;

/**
 * @author Nagesh Chauhan
 */

public class ReadCsv
{
    public void readCsv()
    {
        String csvFileToRead = Gui.TF_inputFilename.getText();
        //  String csvFileToRead = "/Users/davidgudeman/Documents/workspace/CIS35B_assignment04/CTStest.csv";
        String xmlFileWrittenTo = "/Users/davidgudeman/Documents/workspace/CIS35B_assignment04/CTStest-down-xml.csv";
        BufferedReader br = null;
        String line = "";
        String splitBy = ",";

        try
        {
            PrintWriter writer = new PrintWriter(xmlFileWrittenTo);

            br = new BufferedReader(new FileReader(csvFileToRead));
            while ((line = br.readLine()) != null)
            {

                String[] cars = line.split(splitBy);
                System.out.println("<car>" + "\n\t<year>" + cars[0] + "</year>\n\t<make>"
                        + cars[1] + "</make>\n\t<model>" + cars[2] + "</model>\n\t<description>"
                        + cars[3] + "</description>\n\t<price>" + cars[4] + "</price>\n</car>");
                writer.println("<car>" + "\n\t<year>" + cars[0] + "</year>\n\t<make>"
                        + cars[1] + "</make>\n\t<model>" + cars[2] + "</model>\n\t<description>"
                        + cars[3] + "</description>\n\t<price>" + cars[4] + "</price>\n</car>");
                Gui.TA_outputContent.append("<car>" + "\n\t<year>" + cars[0] + "</year>\n\t<make>"
                        + cars[1] + "</make>\n\t<model>" + cars[2] + "</model>\n\t<description>"
                        + cars[3] + "</description>\n\t<price>" + cars[4] + "</price>\n</car>");


            }


            writer.close();
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        } finally
        {
            if (br != null)
            {
                try
                {
                    br.close();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("Done with reading CSV");
    }
}
