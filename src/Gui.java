
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by davidgudeman on 8/1/15.
 */
public class Gui
{
    public static JFrame MainWindow;
    private static JPanel panel;

    public static JLabel JL_TITLE = null;
    public static JLabel JL_subTitle = null;
    public static JLabel JL_subTitle2 = null;

    public static JLabel JL_input = null;
    public static JTextField TF_inputFilename = null;
    public static JTextArea TA_inputContent = null;

    public static JLabel JL_output = null;
    public static JTextField TF_outputFileName = null;
    public static JTextArea TA_outputContent = null;

    public static JLabel JL_port = null;
    public static JTextField TF_port = null;

    public static JLabel JL_convertButton = null;
    public static JButton JB_convertButton = null;

    public Gui() throws Exception {
        BuildGui();
    }

    public void BuildGui()
    {
        MainWindow = new JFrame();
        MainWindow.setSize(600, 1200);
        MainWindow.setTitle("CSV to XML CONVERTER");
        MainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel  = new JPanel(new GridBagLayout());

        // creates panel DG
        panel = new JPanel(new GridBagLayout());
        panel.setSize(700, 300);
        Color purpleMedium = new Color(93, 119, 178, 150);
        Color purpleDark = new Color(50, 50, 50, 150);
        panel.setBackground(purpleMedium);

        // declares the elements in the frame DG
        JL_TITLE = new JLabel("CSV to XML CONVERTER");
        JL_TITLE.setFont(new Font("Geneva", Font.ROMAN_BASELINE, 30));

        JL_subTitle = new JLabel("FILE TO BE CONVERTED");
        JL_subTitle.setFont(new Font("Geneva", Font.ROMAN_BASELINE, 15));
        JL_subTitle.setBackground(purpleDark);

        JL_input = new JLabel("INPUT FILENAME: ");
        TF_inputFilename = new JTextField(15);
        TA_inputContent = new JTextArea(25, 50);

        JL_port = new JLabel("PORT: ");
        TF_port = new JTextField(25);

        JL_convertButton = new JLabel("CONVERT:");
        JB_convertButton = new JButton("convert");

        JL_subTitle2 = new JLabel("CONVERTED FILE");
        JL_subTitle2.setFont(new Font("Geneva", Font.ROMAN_BASELINE, 15));
        JL_subTitle2.setBackground(purpleDark);

        JL_output = new JLabel("OUTPUT FILENAME: ");
        TF_outputFileName = new JTextField(15);
        TA_outputContent = new JTextArea(25, 50);

        /**
         * Uses Layout tool to position the elements in the panel Gudeman
         */
        // creates an object to hold the gridBaglayout constraints DG
        GridBagConstraints c = new GridBagConstraints();

        // sets the distance between elements DG
        c.insets = new Insets(5, 15, 5, 15);

        // use GridBagLayout specifications to position the components DG

        c.anchor = GridBagConstraints.CENTER;
        c.weightx = 1;
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 4;
        panel.add(JL_TITLE, c);

        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 4;
        panel.add(JL_subTitle, c);

        c.anchor = GridBagConstraints.EAST;
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 1;
        panel.add(JL_input, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 2;
        c.gridwidth = 3;
        panel.add(TF_inputFilename, c);

        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 4;
        c.ipady = 200;
        c.fill = GridBagConstraints.HORIZONTAL;
        panel.add(TA_inputContent, c);

        c.anchor = GridBagConstraints.EAST;
        c.gridx = 0;
        c.gridy = 5;
        c.ipady = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        panel.add(JL_port, c);

        c.anchor = GridBagConstraints.WEST;
        c.gridx = 1;
        c.gridy = 5;
        panel.add(TF_port, c);

        c.gridx = 2;
        c.gridy = 5;
        panel.add(JL_convertButton, c);

        c.gridx = 3;
        c.gridy = 5;
        panel.add(JB_convertButton, c);

        c.gridx = 0;
        c.gridy = 6;
        c.gridwidth = 4;
        panel.add(JL_subTitle2, c);

        c.gridx = 0;
        c.gridy = 7;
        c.gridwidth = 1;
        panel.add(JL_output, c);

        c.gridx = 1;
        c.gridy = 7;
        c.gridwidth = 3;
        panel.add(TF_outputFileName, c);

        c.gridwidth = 4;
        c.gridx = 0;
        c.gridy = 8;
        c.ipady = 200;
        panel.add(TA_outputContent, c);

        MainWindow.add(panel, BorderLayout.CENTER);

        MainWindow.setVisible(true);


    }

    public static void main (String[] args) throws Exception
    {
        Gui gui = new Gui();
    }

}
