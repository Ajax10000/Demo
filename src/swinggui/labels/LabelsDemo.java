package swinggui.labels;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class LabelsDemo extends JFrame {
    public LabelsDemo() {
        setTitle("JLabel Demo");
        setSize(700, 300);
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
        tabPane.addTab("Basic labels", pnlBasic);

        JPanel pnlWithVertAlignment = getSecondPanel();
        tabPane.addTab("With vertical alignment", pnlWithVertAlignment);

        JPanel pnlWithContainerLeftAlignment = getThirdPanel();
        tabPane.addTab("With container left alignment", pnlWithContainerLeftAlignment);

        JPanel pnlWithContainerRightAlignment = getFourthPanel();
        tabPane.addTab("With container right alignment", pnlWithContainerRightAlignment);

        add(tabPane);
        
        setVisible(true);
    }

    private JPanel getFirstPanel() {
        Dimension lblSize = new Dimension(60, 50);
        JPanel pnl = new JPanel();
        BorderLayout brdrLayout = new BorderLayout(0, 10);
        pnl.setLayout(brdrLayout);

        JPanel pnlLblContainer = new JPanel();
        JLabel lblAlpha = new JLabel("Alpha");
        lblAlpha.setSize(lblSize);
        lblAlpha.setPreferredSize(lblSize);
        lblAlpha.setOpaque(true);
        lblAlpha.setBackground(Color.WHITE);

        JLabel lblBeta = new JLabel("Beta");
        lblBeta.setSize(lblSize);
        lblBeta.setPreferredSize(lblSize);
        lblBeta.setOpaque(true);
        lblBeta.setBackground(Color.WHITE);
        lblBeta.setHorizontalAlignment(JLabel.LEFT);

        JLabel lblGamma = new JLabel("Gamma");
        lblGamma.setSize(lblSize);
        lblGamma.setPreferredSize(lblSize);
        lblGamma.setOpaque(true);
        lblGamma.setBackground(Color.WHITE);
        lblGamma.setHorizontalAlignment(JLabel.CENTER);

        JLabel lblDelta = new JLabel("Delta");
        lblDelta.setSize(lblSize);
        lblDelta.setPreferredSize(lblSize);
        lblDelta.setOpaque(true);
        lblDelta.setBackground(Color.WHITE);
        lblDelta.setHorizontalAlignment(JLabel.RIGHT);

        pnlLblContainer.add(lblAlpha);
        pnlLblContainer.add(lblBeta);
        pnlLblContainer.add(lblGamma);
        pnlLblContainer.add(lblDelta);

        JTextArea textArea = new JTextArea(5, 30);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        String sMsg = "The first label (Alpha) above was created with no alignment set. " +
            "The second label (Beta) is left-aligned. The third label (Gamma) is centered. " + 
            "The fourth label (Delta) is right-aligned. " + 
            "The alignment is set by calling the JLabel.setHorizontalAlignment method" + 
            "\n\n" + 
            "To make the alignment differences more obvious, I gave all the labels " + 
            "a white background with the setBackground() method, which JLabel inherits " + 
            "from JComponent. However, labels by default are transparent, so I also " + 
            "had to set the label's opaque property to true via the setOpaque method " + 
            " to stop the labels from being transparent.";
        textArea.setText(sMsg);
        textArea.setEditable(false);

        pnl.add(pnlLblContainer, BorderLayout.NORTH);
        pnl.add(textArea, BorderLayout.SOUTH);

        return pnl;
    }

    private JPanel getSecondPanel() {
        Dimension lblSize = new Dimension(60, 50);
        JPanel pnl = new JPanel();
        BorderLayout brdrLayout = new BorderLayout(0, 10);
        pnl.setLayout(brdrLayout);

        JPanel pnlLblContainer = new JPanel();
        JLabel lblAlpha = new JLabel("Alpha");
        lblAlpha.setSize(lblSize);
        lblAlpha.setPreferredSize(lblSize);
        lblAlpha.setOpaque(true);
        lblAlpha.setBackground(Color.WHITE);

        JLabel lblBeta = new JLabel("Beta");
        lblBeta.setSize(lblSize);
        lblBeta.setPreferredSize(lblSize);
        lblBeta.setOpaque(true);
        lblBeta.setBackground(Color.WHITE);
        lblBeta.setVerticalAlignment(JLabel.TOP);

        JLabel lblGamma = new JLabel("Gamma");
        lblGamma.setSize(lblSize);
        lblGamma.setPreferredSize(lblSize);
        lblGamma.setOpaque(true);
        lblGamma.setBackground(Color.WHITE);
        lblGamma.setVerticalAlignment(JLabel.CENTER);

        JLabel lblDelta = new JLabel("Delta");
        lblDelta.setSize(lblSize);
        lblDelta.setPreferredSize(lblSize);
        lblDelta.setOpaque(true);
        lblDelta.setBackground(Color.WHITE);
        lblDelta.setVerticalAlignment(JLabel.BOTTOM);

        pnlLblContainer.add(lblAlpha);
        pnlLblContainer.add(lblBeta);
        pnlLblContainer.add(lblGamma);
        pnlLblContainer.add(lblDelta);

        JTextArea textArea = new JTextArea(5, 30);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        String sMsg = "The first label (Alpha) above was created with no alignment set. " +
            "The second label (Beta) is top-aligned. The third label (Gamma) is centered. " + 
            "The fourth label (Delta) is bottom-aligned. " + 
            "The alignment is set by calling the JLabel.setVerticalAlignment method" + 
            "\n\n" + 
            "To make the alignment differences more obvious, I gave all the labels " + 
            "a white background with the setBackground() method, which JLabel inherits " + 
            "from JComponent. However, labels by default are transparent, so I also " + 
            "had to set the label's opaque property to true via the setOpaque method " + 
            " to stop the labels from being transparent.";
        textArea.setText(sMsg);
        textArea.setEditable(false);

        pnl.add(pnlLblContainer, BorderLayout.NORTH);
        pnl.add(textArea, BorderLayout.SOUTH);

        return pnl;
    }

    private JPanel getThirdPanel() {
        Dimension lblSize = new Dimension(60, 50);
        JPanel pnl = new JPanel();
        BorderLayout brdrLayout = new BorderLayout(0, 10);
        pnl.setLayout(brdrLayout);

        FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT);
        JPanel pnlLblContainer = new JPanel(flowLayout);

        JLabel lblAlpha = new JLabel("Alpha");
        lblAlpha.setSize(lblSize);
        lblAlpha.setPreferredSize(lblSize);
        lblAlpha.setOpaque(true);
        lblAlpha.setBackground(Color.WHITE);
        lblAlpha.setAlignmentX(0.0f);

        JLabel lblBeta = new JLabel("Beta");
        lblBeta.setSize(lblSize);
        lblBeta.setPreferredSize(lblSize);
        lblBeta.setOpaque(true);
        lblBeta.setBackground(Color.WHITE);

        JLabel lblGamma = new JLabel("Gamma");
        lblGamma.setSize(lblSize);
        lblGamma.setPreferredSize(lblSize);
        lblGamma.setOpaque(true);
        lblGamma.setBackground(Color.WHITE);

        JLabel lblDelta = new JLabel("Delta");
        lblDelta.setSize(lblSize);
        lblDelta.setPreferredSize(lblSize);
        lblDelta.setOpaque(true);
        lblDelta.setBackground(Color.WHITE);

        pnlLblContainer.add(lblAlpha);
        pnlLblContainer.add(lblBeta);
        pnlLblContainer.add(lblGamma);
        pnlLblContainer.add(lblDelta);

        JTextArea textArea = new JTextArea(5, 30);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        String sMsg = "Above you see 4 JLabels in a JPanel that is using " +
            "the FlowLayout layout manager. The labels appear on the left " +
            "side of the JPanel because the FlowLayout manager was constructed " + 
            "like this: FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT);";
        textArea.setText(sMsg);
        textArea.setEditable(false);

        pnl.add(pnlLblContainer, BorderLayout.NORTH);
        pnl.add(textArea, BorderLayout.SOUTH);

        return pnl;
    }

    private JPanel getFourthPanel() {
        Dimension lblSize = new Dimension(60, 50);
        JPanel pnl = new JPanel();
        BorderLayout brdrLayout = new BorderLayout(0, 10);
        pnl.setLayout(brdrLayout);

        FlowLayout flowLayout = new FlowLayout(FlowLayout.RIGHT);
        JPanel pnlLblContainer = new JPanel(flowLayout);

        JLabel lblAlpha = new JLabel("Alpha");
        lblAlpha.setSize(lblSize);
        lblAlpha.setPreferredSize(lblSize);
        lblAlpha.setOpaque(true);
        lblAlpha.setBackground(Color.WHITE);
        lblAlpha.setAlignmentX(0.0f);

        JLabel lblBeta = new JLabel("Beta");
        lblBeta.setSize(lblSize);
        lblBeta.setPreferredSize(lblSize);
        lblBeta.setOpaque(true);
        lblBeta.setBackground(Color.WHITE);

        JLabel lblGamma = new JLabel("Gamma");
        lblGamma.setSize(lblSize);
        lblGamma.setPreferredSize(lblSize);
        lblGamma.setOpaque(true);
        lblGamma.setBackground(Color.WHITE);

        JLabel lblDelta = new JLabel("Delta");
        lblDelta.setSize(lblSize);
        lblDelta.setPreferredSize(lblSize);
        lblDelta.setOpaque(true);
        lblDelta.setBackground(Color.WHITE);

        pnlLblContainer.add(lblAlpha);
        pnlLblContainer.add(lblBeta);
        pnlLblContainer.add(lblGamma);
        pnlLblContainer.add(lblDelta);

        JTextArea textArea = new JTextArea(5, 30);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        String sMsg = "Above you see 4 JLabels in a JPanel that is using " +
            "the FlowLayout layout manager. The labels appear on the right " +
            "side of the JPanel because the FlowLayout manager was constructed " + 
            "like this: FlowLayout flowLayout = new FlowLayout(FlowLayout.RIGHT);";
        textArea.setText(sMsg);
        textArea.setEditable(false);

        pnl.add(pnlLblContainer, BorderLayout.NORTH);
        pnl.add(textArea, BorderLayout.SOUTH);

        return pnl;
    }

    public static void main(String[] args) {
        new LabelsDemo();
    }
}

