package swinggui.buttons;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

public class ButtonsDemo extends JFrame {

    public ButtonsDemo() {
        setTitle("JButton Demo");
        setSize(600, 400);
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
        tabPane.addTab("Basic JButtons", pnlBasic);

        JPanel pnlWithColors = getSecondPanel();
        tabPane.addTab("With colors", pnlWithColors);

        JPanel pnlWithBevelBorders = getThirdPanel();
        tabPane.addTab("With beveled borders", pnlWithBevelBorders);

        JPanel pnlWithDifferentFonts = getFourthPanel();
        tabPane.addTab("With different fonts", pnlWithDifferentFonts);

        add(tabPane);
        
        setVisible(true);
    }

    private JPanel getFirstPanel() {
        JPanel pnl = new JPanel();
        BorderLayout brdrLayout = new BorderLayout(0, 10);
        pnl.setLayout(brdrLayout);

        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(5, 30));

        ActionListener actionListener = new TabActionListener(textField);
        JPanel pnlBtnContainer = new JPanel();
        JButton btnChop = new JButton("Chop");
        btnChop.setActionCommand("Chop");
        btnChop.addActionListener(actionListener);

        JButton btnSlice = new JButton("Slice");
        btnSlice.setActionCommand("Slice");
        btnSlice.addActionListener(actionListener);

        JButton btnDice = new JButton("Dice");
        btnDice.setActionCommand("Dice");
        btnDice.addActionListener(actionListener);

        pnlBtnContainer.add(btnChop);
        pnlBtnContainer.add(btnSlice);
        pnlBtnContainer.add(btnDice);

        String sMsg = "When a button is clicked, you can get your code to " + 
            "respond by setting up an ActionListener on the button. When " + 
            "the button is clicked, the actionPerformed method of the ActionListener " + 
            "is called, and you can have that code do what you want.";
        JTextArea textArea = new JTextArea(5, 30);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setText(sMsg);

        pnl.add(pnlBtnContainer, BorderLayout.NORTH);
        pnl.add(textField, BorderLayout.CENTER);
        pnl.add(textArea, BorderLayout.SOUTH);

        return pnl;
    }

    private JPanel getSecondPanel() {
        JPanel pnl = new JPanel();
        BorderLayout brdrLayout = new BorderLayout(0, 10);
        pnl.setLayout(brdrLayout);

        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(5, 30));

        ActionListener actionListener = new TabActionListener(textField);
        JPanel pnlBtnContainer = new JPanel();
        JButton btnChop = new JButton("Chop");
        btnChop.setBackground(Color.BLUE);
        btnChop.setForeground(Color.WHITE);
        btnChop.setActionCommand("Chop");
        btnChop.addActionListener(actionListener);

        JButton btnSlice = new JButton("Slice");
        btnSlice.setBackground(Color.GREEN);
        btnSlice.setForeground(Color.RED);
        btnSlice.setActionCommand("Slice");
        btnSlice.addActionListener(actionListener);

        JButton btnDice = new JButton("Dice");
        btnDice.setBackground(Color.MAGENTA);
        btnDice.setForeground(Color.YELLOW);
        btnDice.setActionCommand("Dice");
        btnDice.addActionListener(actionListener);

        pnlBtnContainer.add(btnChop);
        pnlBtnContainer.add(btnSlice);
        pnlBtnContainer.add(btnDice);

        JTextArea textArea = new JTextArea(5, 30);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        String sMsg = "The first button above has a blue background with " + 
            "a white foreground. The second button above has a green " + 
            "background with a red foreground. Finally the third above " + 
            "has a magenta background with a yellow foreground.";
        textArea.setText(sMsg);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);

        pnl.add(pnlBtnContainer, BorderLayout.NORTH);
        pnl.add(textField, BorderLayout.CENTER);
        pnl.add(textArea, BorderLayout.SOUTH);

        return pnl;
    }


    private JPanel getThirdPanel() {
        JPanel pnl = new JPanel();
        BorderLayout brdrLayout = new BorderLayout(0, 10);
        pnl.setLayout(brdrLayout);

        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(5, 30));

        ActionListener actionListener = new TabActionListener(textField);
        JPanel pnlBtnContainer = new JPanel();
        JButton btnChop = new JButton("Chop");
        Border brdrChop = BorderFactory.createBevelBorder(BevelBorder.RAISED);
        btnChop.setBorder(brdrChop);
        btnChop.setActionCommand("Chop");
        btnChop.addActionListener(actionListener);

        JButton btnSlice = new JButton("Slice");
        Border brdrSlice = BorderFactory.createBevelBorder(BevelBorder.LOWERED);
        btnSlice.setBorder(brdrSlice);
        btnSlice.setActionCommand("Slice");
        btnSlice.addActionListener(actionListener);

        pnlBtnContainer.add(btnChop);
        pnlBtnContainer.add(btnSlice);

        JTextArea textArea = new JTextArea(5, 30);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        String sMsg = "The two buttons in this demo have bevel borders. " + 
            "There are two types of bevel borders. One is raised, the " + 
            "other is lowered. The first button above has a raised bevel " +
            "border, the second one has a lowered bevel border.";
        textArea.setText(sMsg);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);

        pnl.add(pnlBtnContainer, BorderLayout.NORTH);
        pnl.add(textField, BorderLayout.CENTER);
        pnl.add(textArea, BorderLayout.SOUTH);

        return pnl;
    }


    private JPanel getFourthPanel() {
        JPanel pnl = new JPanel();
        BorderLayout brdrLayout = new BorderLayout(0, 10);
        pnl.setLayout(brdrLayout);

        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(5, 30));

        ActionListener actionListener = new TabActionListener(textField);
        JPanel pnlBtnContainer = new JPanel();
        Font fontChop = new Font("Times New Roman", Font.PLAIN, 14);
        JButton btnChop = new JButton("Chop");
        btnChop.setFont(fontChop);
        btnChop.setActionCommand("Chop");
        btnChop.addActionListener(actionListener);

        Font fontSlice = new Font("Arial", Font.ITALIC, 16);
        JButton btnSlice = new JButton("Slice");
        btnSlice.setFont(fontSlice);
        btnSlice.setActionCommand("Slice");
        btnSlice.addActionListener(actionListener);

        Font fontDice = new Font("Calibri", Font.BOLD, 12);
        JButton btnDice = new JButton("Dice");
        btnDice.setFont(fontDice);
        btnDice.setActionCommand("Dice");
        btnDice.addActionListener(actionListener);

        pnlBtnContainer.add(btnChop);
        pnlBtnContainer.add(btnSlice);
        pnlBtnContainer.add(btnDice);

        JTextArea textArea = new JTextArea(5, 30);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        String sMsg = "The three buttons in this demo have different fonts." + 
            "The font for the Chop button was created like this: \n" +
            "Font fontChop = new Font(\"Times New Roman\", Font.PLAIN, 14);\n" +
            "The font for the Slice button was created like this: \n" + 
            "Font fontSlice = new Font(\"Arial\", Font.ITALIC, 16); \n" + 
            "The font for the Dice button was created like this: \n" + 
            "Font fontDice = new Font(\"Calibri\", Font.BOLD, 12);" + 
            "\n\n" + 
            "After creating the fonts, I set the font for each button by " + 
            "calling the JButton setFont method.";
        textArea.setText(sMsg);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(textArea);

        pnl.add(pnlBtnContainer, BorderLayout.NORTH);
        pnl.add(textField, BorderLayout.CENTER);
        pnl.add(scrollPane, BorderLayout.SOUTH);

        return pnl;
    }


    private class TabActionListener implements ActionListener {
        private JTextField textField;

        public TabActionListener(JTextField pTxtField) {
            this.textField = pTxtField;
        }

        public void actionPerformed(ActionEvent ae) {
            String sActionCmd = ae.getActionCommand();
            switch (sActionCmd) {
            case "Chop":
                textField.setText("It chops!");
                break;
            case "Slice":
                textField.setText("It slices!");
                break;
            case "Dice":
                textField.setText("It dices!");
                break;
            default:
                new IllegalStateException("Unknown action command: " + sActionCmd);
            }
        }
    }

    public static void main(String[] args) {
        new ButtonsDemo();
    }
}
