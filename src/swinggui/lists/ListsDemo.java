package swinggui.lists;

import java.awt.FlowLayout;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class ListsDemo extends JFrame {
    public ListsDemo() {
        setTitle("JList Demo");
        setSize(600, 450);
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
        tabPane.addTab("Basic lists", pnlBasic);

        JPanel pnlWithViewableSizes = getSecondPanel();
        tabPane.addTab("With visibleRowCount", pnlWithViewableSizes);

        add(tabPane);
        
        setVisible(true);
    }

    private JPanel getFirstPanel() {
        JPanel pnl = new JPanel(new FlowLayout());
        JList<String> mathList1 = createMathList();
        JList<String> mathList2 = createMathList();
        JList<String> mathList3 = createMathList();
        JScrollPane jsPane02 = new JScrollPane(mathList2);
        JScrollPane jsPane03 = new JScrollPane(mathList3);
        mathList3.setVisibleRowCount(3);

        pnl.add(mathList1);
        pnl.add(jsPane02);
        pnl.add(jsPane03);

        String sMsg = "The JList on the left has no scroll pane. " + 
            "The JList in the center was given a scroll pane." +
            "The JList on the right was given a scroll pane, and " +
            "had its visibleRowCount property set to 3.";
        JTextArea txtArea = new JTextArea(sMsg, 5, 30);
        txtArea.setWrapStyleWord(true);
        txtArea.setLineWrap(true);
        pnl.add(txtArea);

        return pnl;
    }

    private JPanel getSecondPanel() {
        FlowLayout flowLayout = new FlowLayout();
        flowLayout.setAlignOnBaseline(true);
        JPanel pnl = new JPanel(flowLayout);
        JList<String> mathList1 = createMathList();
        JList<String> mathList2 = createMathList();
        JList<String> mathList3 = createMathList();

        JScrollPane jsPane01 = new JScrollPane(mathList1);
        mathList1.setVisibleRowCount(3);

        JScrollPane jsPane02 = new JScrollPane(mathList2);
        mathList2.setVisibleRowCount(4);

        JScrollPane jsPane03 = new JScrollPane(mathList3);
        mathList3.setVisibleRowCount(5);
        
        pnl.add(jsPane01);
        pnl.add(jsPane02);
        pnl.add(jsPane03);

        String sMsg = "The JList on the left has a visibleRowCount property of 3. " + 
            "The JList in the center has a visibleRowCount property of 4." +
            "The JList on the right has a visibleRowCount property of 5." + 
            "\n\n" + 
            "The JLists are aligned along the top because they were added " + 
            "to a JPanel using the FlowLayout layout manager, and I called " + 
            "the flowLayout.setAlignOnBaseline(true); method.";
        JTextArea txtArea = new JTextArea(sMsg, 5, 30);
        txtArea.setWrapStyleWord(true);
        txtArea.setLineWrap(true);
        pnl.add(txtArea);

        return pnl;
    }


    private JList<String> createMathList() {
        String[] listData = {
            "College Algebra",
            "Trigonometry",
            "Analytic Geometry",
            "Precalculus",
            "Linear Algebra 1",
            "Linear Algebra 2",
            "Discrete Mathematics",
            "Calculus 1",
            "Calculus 2",
            "Calculus 3",
            "Advanced Calculus",
            "Complex Variables",
            "Differential Eqns",
            "Partial Differential Eqns",
            "Modern Algebra 1",
            "Modern Algebra 2"
        };

        JList<String> mathList = new JList<String>(listData);

        return mathList;
    }


    public static void main(String[] args) {
        new ListsDemo();
    }
}
