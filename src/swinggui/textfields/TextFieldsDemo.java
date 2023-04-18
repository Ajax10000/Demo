package swinggui.textfields;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class TextFieldsDemo extends JFrame {
    public TextFieldsDemo() {
        setTitle("JTextField Demo");
        setSize(600, 300);
        JFrame self = this;
    
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                // Using this.dispose() won't work, as here
                // this refers to the WindowAdapter instance
                self.dispose();
            }
        });
    
        JTabbedPane tabPane = new JTabbedPane();
        JPanel pnlBasic = getFirstPanel();
        tabPane.addTab("Basic JTextFields", pnlBasic);
    
        /*
        JPanel pnlWithColors = getSecondPanel();
        tabPane.addTab("With colors", pnlWithColors);
    
        JPanel pnlWithBevelBorders = getThirdPanel();
        tabPane.addTab("", pnlWithBevelBorders);
        */
    
        add(tabPane);
        
        setVisible(true);
    }

    private JPanel getFirstPanel() {
        JPanel pnl = new JPanel();
        BorderLayout brdrLayout = new BorderLayout(0, 10);
        pnl.setLayout(brdrLayout);
        
        // JPanel pnlTxtFldContainer = new JPanel(new GridLayout(5, 2));
        JPanel txtFldCtrWest = new JPanel(new GridLayout(5, 1));
        txtFldCtrWest.setAlignmentX(1.0f);
        
        JPanel txtFldCtrEast = new JPanel(new GridLayout(5, 1));
        txtFldCtrEast.setAlignmentX(0.0f);

        JLabel lblFName = new JLabel("First Name:");
        JTextField tfdFName = new JTextField(30);
        
        JLabel lblLName = new JLabel("Last Name:");
        JTextField tfdLName = new JTextField(30);

        JLabel lblCity = new JLabel("City:");
        JTextField tfdCity = new JTextField(25);

        JLabel lblState = new JLabel("State:");
        JTextField tfdState = new JTextField(2);

        JLabel lblZipCode = new JLabel("Zip Code:");
        JTextField tfdZip = new JTextField(5);

        txtFldCtrWest.add(lblFName);
        txtFldCtrEast.add(tfdFName);
        txtFldCtrWest.add(lblLName);
        txtFldCtrEast.add(tfdLName);
        txtFldCtrWest.add(lblCity);
        txtFldCtrEast.add(tfdCity);
        txtFldCtrWest.add(lblState);
        txtFldCtrEast.add(tfdState);
        txtFldCtrWest.add(lblZipCode);
        txtFldCtrEast.add(tfdZip);
   
        String sMsg = "Above you see 5 labels and 5 textfields. The " + 
            "first and second textfields have a length of 30. The city " + 
            "field has a length of 25. The state textfield has a length " + 
            "of 2. The zip code textfield has a length of 5. " + 
            "\n\n" + 
            "So why do " + 
            "they all appear to have the same length? This is because " + 
            "they are being displayed in 2 JPanels that uses the GridLayout. " +
            "There is one JPanel that is displaying all the labels; it is " + 
            "a GridLayout with 5 rows and 1 column. There is also one JPanel " + 
            "that is displaying all the text fields. It also is using a GridLayout " + 
            "with 5 rows and 1 column. The JPanels containing the labels and " + 
            "text fields were placed in a larger JPanel using the BorderLayout. " +
            "The JPanel with the labels was placed in the EAST side of the " + 
            "BorderLayout. The JPanel with the text fields was placed in the " + 
            "WEST side of the BorderLayout." + 
            "The GridLayout stretches each component to take up all the " + 
            "remaining space. This is something you have to be aware of if " + 
            "you decide to use the GridLayout.";
        JTextArea textArea = new JTextArea(5, 30);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setText(sMsg);

        JScrollPane scrollPane = new JScrollPane(textArea);

        pnl.add(txtFldCtrWest, BorderLayout.WEST);
        pnl.add(txtFldCtrEast, BorderLayout.EAST);
        pnl.add(scrollPane, BorderLayout.SOUTH);

        return pnl;
    }

    private JPanel getSecondPanel() {
        return null;
    }
    
    private JPanel getThirdPanel() {
        return null;
    }

    
    public static void main(String[] args) {
        new TextFieldsDemo();
    }
}
