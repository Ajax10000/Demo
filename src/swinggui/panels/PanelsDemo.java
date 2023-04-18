package swinggui.panels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class PanelsDemo extends JFrame {
    public PanelsDemo() {
        setTitle("JPanel Demo");
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
        tabPane.addTab("Basic JPanels", pnlBasic);
    
        JPanel pnlWithColors = getSecondPanel();
        tabPane.addTab("With colors", pnlWithColors);

        /*
        JPanel pnlWithBevelBorders = getThirdPanel();
        tabPane.addTab("", pnlWithBevelBorders);
        */
    
        add(tabPane);
        
        setVisible(true);
    }

    private JPanel getFirstPanel() {
        BorderLayout brdrLayout = new BorderLayout(0, 10);
        JPanel pnl = new JPanel(brdrLayout);

        JPanel pnlWest = new JPanel();
        GridLayout gridLayoutWest = new GridLayout(6, 1);
        pnlWest.setLayout(gridLayoutWest);

        JLabel lblWrkAsAnAdult = new JLabel("When I grow up, I will work as a: ");
        JRadioButton rbnDJ = new JRadioButton("Disc Jockey");
        JRadioButton rbnChemist = new JRadioButton("Chemist");
        JRadioButton rbnSpy = new JRadioButton("Spy");
        JRadioButton rbnEvlScientist = new JRadioButton("Evil Scientist");
        JRadioButton rbnSuperhero = new JRadioButton("Superhero");

        pnlWest.add(lblWrkAsAnAdult);
        pnlWest.add(rbnDJ);
        pnlWest.add(rbnChemist);
        pnlWest.add(rbnSpy);
        pnlWest.add(rbnEvlScientist);
        pnlWest.add(rbnSuperhero);

        JPanel pnlEast = new JPanel(); 
        GridLayout gridLayoutEast = new GridLayout(6, 1);
        pnlEast.setLayout(gridLayoutEast);

        JLabel lblSpouse = new JLabel("I will marry someone who knows: ");
        JCheckBox cbxMath = new JCheckBox("Advanced math, like group, ring and field theory");
        JCheckBox cbxMoneyMgmt = new JCheckBox("Balance a checkbook");
        JCheckBox cbxCook = new JCheckBox("Cook like a chef");
        JCheckBox cbxHumor = new JCheckBox("Has a sense of humor");
        JCheckBox cbxLaughs = new JCheckBox("Laughs at my jokes");

        pnlEast.add(lblSpouse);
        pnlEast.add(cbxMath);
        pnlEast.add(cbxMoneyMgmt);
        pnlEast.add(cbxCook);
        pnlEast.add(cbxHumor);
        pnlEast.add(cbxLaughs);

        String sMsg = "JPanels are usually used as containers for UI " + 
            "elements. Above you see 2 JPanels. One contains a label and " +
            "6 radio buttons, the other contains a label and 6 checkboxes.";
        JTextArea txtArea = new JTextArea(sMsg, 5, 30);
        txtArea.setWrapStyleWord(true);
        txtArea.setLineWrap(true);

        pnl.add(BorderLayout.WEST, pnlWest);
        pnl.add(BorderLayout.EAST, pnlEast);
        pnl.add(BorderLayout.SOUTH, txtArea);

        return pnl;
    }

    private JPanel getSecondPanel() {
        JPanel pnl = new JPanel();
        BorderLayout brdrLayout = new BorderLayout(0, 10);
        pnl.setLayout(brdrLayout);

        JPanel pnlPnlContainer = new JPanel();
        GridLayout gridLayout = new GridLayout(2, 3);
        pnlPnlContainer.setLayout(gridLayout);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        JLabel lblTextOnRed = new JLabel("<html><h1>Hello</h1></html>");
        lblTextOnRed.setForeground(Color.WHITE);
        redPanel.add(lblTextOnRed);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        JLabel lblTextOnGreen = new JLabel("<html><h1>Hello</h1></html>");
        lblTextOnGreen.setForeground(Color.ORANGE);
        greenPanel.add(lblTextOnGreen);

        JPanel whitePanel = new JPanel();
        whitePanel.setBackground(Color.WHITE);
        JLabel lblTextOnWhite = new JLabel("<html><h1>Hello</h1></html>");
        lblTextOnWhite.setForeground(Color.CYAN);
        whitePanel.add(lblTextOnWhite);

        JPanel grayPanel = new JPanel();
        grayPanel.setBackground(Color.GRAY);
        JLabel lblTextOnGray = new JLabel("<html><h1>Hello</h1></html>");
        lblTextOnGray.setForeground(Color.CYAN);
        grayPanel.add(lblTextOnGray);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        JLabel lblTextOnBlue = new JLabel("<html><h1>Hello</h1></html>");
        lblTextOnBlue.setForeground(Color.BLACK);
        bluePanel.add(lblTextOnBlue);

        JPanel orangePanel = new JPanel();
        orangePanel.setBackground(Color.ORANGE);
        JLabel lblTextOnOrange = new JLabel("<html><h1>Hello</h1></html>");
        lblTextOnOrange.setForeground(Color.BLUE);
        orangePanel.add(lblTextOnOrange);

        pnlPnlContainer.add(redPanel);
        pnlPnlContainer.add(greenPanel);
        pnlPnlContainer.add(whitePanel);
        pnlPnlContainer.add(grayPanel);
        pnlPnlContainer.add(bluePanel);
        pnlPnlContainer.add(orangePanel);

        JTextArea textArea = new JTextArea(5, 30);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        String sMsg = "Above you see 6 panels in a 2x3 GridLayout. " +
            "Each panel has been given a background color. " + 
            "Each panel also has a JLabel that simply reads 'Hello'. " +
            "The color of the word 'Hello' is set by setting the " +
            "foreground color on the JLabel, not on the JPanel." + 
            "\n\n" + 
            "The text on the JLabel was created using HTML by setting the " + 
            "text to '<html/><h1>Hello</h1></html>";
        textArea.setText(sMsg);
        textArea.setEditable(false);

        pnl.add(pnlPnlContainer, BorderLayout.CENTER);
        pnl.add(textArea, BorderLayout.SOUTH);

        return pnl;
    }

    private JPanel getThirdPanel() {
        return null;
    }

    public static void main(String[] args) {
        new PanelsDemo();
    }
}
