package swinggui.textareas;

import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class TextAreasDemo extends JFrame {
    public TextAreasDemo() {
        setTitle("JTextArea Demo");
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
        tabPane.addTab("Basic JTextAreas", pnlBasic);
    
        /*
        JPanel pnlWithColors = getSecondPanel();
        tabPane.addTab("", pnlWithColors);
    
        JPanel pnlWithBevelBorders = getThirdPanel();
        tabPane.addTab("", pnlWithBevelBorders);
        */
    
        add(tabPane);
        
        setVisible(true);
    }

    private JPanel getFirstPanel() {
        JPanel pnl = new JPanel(new FlowLayout());

        String sMsg = "Sorry, this demo hasn't been fully built yet.";
        JTextArea txtArea = new JTextArea(sMsg, 5, 30);
        txtArea.setWrapStyleWord(true);
        txtArea.setLineWrap(true);
        pnl.add(txtArea);

        return pnl;
    }

    private JPanel getSecondPanel() {
        return null;
    }

    private JPanel getThirdPanel() {
        return null;
    }
}
