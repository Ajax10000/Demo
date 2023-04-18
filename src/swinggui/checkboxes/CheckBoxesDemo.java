package swinggui.checkboxes;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class CheckBoxesDemo extends JFrame {
    public CheckBoxesDemo() {
        setTitle("JCheckBox Demo");
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
        tabPane.addTab("Basic checkboxes", pnlBasic);

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

        GridLayout gridLayout = new GridLayout(5, 1);
        JPanel pnlCbxContainer = new JPanel(gridLayout);

        JLabel lblLanguages = new JLabel("Which of the following languages do you know?");
        JCheckBox cbxJava = new JCheckBox("Java");
        JCheckBox cbxJavaScript = new JCheckBox("JavaScript");
        JCheckBox cbxC = new JCheckBox("C");
        JCheckBox cbxCPP = new JCheckBox("C++");

        pnlCbxContainer.add(lblLanguages);
        pnlCbxContainer.add(cbxJava);
        pnlCbxContainer.add(cbxJavaScript);
        pnlCbxContainer.add(cbxC);
        pnlCbxContainer.add(cbxCPP);

        String sMsg = "Above you see 1 JLabel and 4 JCheckBoxes. They are " + 
            "displayed in a JPanel with a 5x1 GridLayout";
        JTextArea textArea = new JTextArea(5, 30);
        textArea.setText(sMsg);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        pnl.add(pnlCbxContainer, BorderLayout.NORTH);
        pnl.add(textArea, BorderLayout.SOUTH);

        return pnl;
    }

    private JPanel getSecondPanel() {
        return null;
    }

    private JPanel getThirdPanel() {
        return null;
    }

    public static void main(String[] args) {
        new CheckBoxesDemo();
    }
}
