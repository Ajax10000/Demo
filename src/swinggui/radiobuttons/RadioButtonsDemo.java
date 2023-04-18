package swinggui.radiobuttons;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class RadioButtonsDemo extends JFrame {
    public RadioButtonsDemo() {
        setTitle("JRadioButton Demo");
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
        tabPane.addTab("Basic JRadioButtons", pnlBasic);
    

        JPanel pnlRbnsInGroup = getSecondPanel();
        tabPane.addTab("Radio buttons in a ButtonGroup", pnlRbnsInGroup);
    
        /*
        JPanel pnlWithBevelBorders = getThirdPanel();
        tabPane.addTab("With beveled borders", pnlWithBevelBorders);
        */
    
        add(tabPane);
        
        setVisible(true);
    }

    private JPanel getFirstPanel() {
        JPanel pnl = new JPanel();
        BorderLayout brdrLayout = new BorderLayout(0, 10);
        pnl.setLayout(brdrLayout);

        JLabel lblPowers = new JLabel("If you were a superhero, which ability would you like?");

        JPanel pnlRBtnContainer = new JPanel();
        GridLayout gridLayout = new GridLayout(6, 1);
        pnlRBtnContainer.setLayout(gridLayout);

        JRadioButton rbnInvisibility = new JRadioButton("Invisibility");
        JRadioButton rbnFlight = new JRadioButton("Flight");
        JRadioButton rbnSuperStrength = new JRadioButton("Super strength");
        JRadioButton rbnSuperSpeed = new JRadioButton("Super speed");
        JRadioButton rbnXRayVision = new JRadioButton("X-ray vision");

        pnlRBtnContainer.add(lblPowers);
        pnlRBtnContainer.add(rbnInvisibility);
        pnlRBtnContainer.add(rbnFlight);
        pnlRBtnContainer.add(rbnSuperStrength);
        pnlRBtnContainer.add(rbnSuperSpeed);
        pnlRBtnContainer.add(rbnXRayVision);

        String sMsg = "Above you see 1 JLabel and 5 JRadioButtons. The radio " + 
            "buttons were not placed in a ButtonGroup, which is why you can " + 
            "choose more than one radio button.";
        JTextArea textArea = new JTextArea(5, 30);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setText(sMsg);

        pnl.add(pnlRBtnContainer, BorderLayout.NORTH);
        pnl.add(textArea, BorderLayout.SOUTH);

        return pnl;
    }

    private JPanel getSecondPanel() {
        JPanel pnl = new JPanel();
        BorderLayout brdrLayout = new BorderLayout(0, 10);
        pnl.setLayout(brdrLayout);

        JLabel lblPowers = new JLabel("If you were a superhero, which ability would you like?");

        JPanel pnlRBtnContainer = new JPanel();
        GridLayout gridLayout = new GridLayout(6, 1);
        pnlRBtnContainer.setLayout(gridLayout);

        JRadioButton rbnInvisibility = new JRadioButton("Invisibility");
        JRadioButton rbnFlight = new JRadioButton("Flight");
        JRadioButton rbnSuperStrength = new JRadioButton("Super strength");
        JRadioButton rbnSuperSpeed = new JRadioButton("Super speed");
        JRadioButton rbnXRayVision = new JRadioButton("X-ray vision");

        ButtonGroup btnGrp = new ButtonGroup();
        btnGrp.add(rbnInvisibility);
        btnGrp.add(rbnFlight);
        btnGrp.add(rbnSuperStrength);
        btnGrp.add(rbnSuperSpeed);
        btnGrp.add(rbnXRayVision);

        pnlRBtnContainer.add(lblPowers);
        pnlRBtnContainer.add(rbnInvisibility);
        pnlRBtnContainer.add(rbnFlight);
        pnlRBtnContainer.add(rbnSuperStrength);
        pnlRBtnContainer.add(rbnSuperSpeed);
        pnlRBtnContainer.add(rbnXRayVision);

        String sMsg = "Above you see 1 JLabel and 5 JRadioButtons. The radio " + 
            "buttons were placed in a ButtonGroup, which is why you can " + 
            "only choose one radio button.";
        JTextArea textArea = new JTextArea(5, 30);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setText(sMsg);

        pnl.add(pnlRBtnContainer, BorderLayout.NORTH);
        pnl.add(textArea, BorderLayout.SOUTH);

        return pnl;
    }

    private JPanel getThirdPanel() {
        return null;
    }

    public static void main(String[] args) {
        new RadioButtonsDemo();
    }
}
