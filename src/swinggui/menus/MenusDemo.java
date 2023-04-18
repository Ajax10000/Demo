package swinggui.menus;

import java.awt.BorderLayout;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class MenusDemo extends JFrame {
    public MenusDemo() {
        setTitle("JMenu Demo");
        setSize(1300, 400);
        JFrame self = this;
    
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                // Using this.dispose() won't work, as here
                // this refers to the WindowAdapter instance
                self.dispose();
            }
        });

        BorderLayout brdrLyot = new BorderLayout();
        setLayout(brdrLyot);
        JMenuBar menuBar = createMenuBar();
        
        add(menuBar, BorderLayout.NORTH);
        setVisible(true);
    }


    JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        JMenu mnuCAlgebra = new JMenu("College Algebra");
        JMenu mnuTrig = new JMenu("Trigonometry");
        JMenu mnuAnalyticGeom = new JMenu("Analytic Geometry");
        JMenu mnuPrecalculus = new JMenu("Precalculus");
        JMenu mnuCalculus1 = new JMenu("Calculus 1");
        JMenu mnuCalculus2 = new JMenu("Calculus 2");
        JMenu mnuCalculus3 = new JMenu("Calculus 3");
        JMenu mnuACalculus = new JMenu("Advanced Calculus");
        JMenu mnuDiffEqns = new JMenu("Differential Eqns");
        JMenu mnuPDEqns = new JMenu("Partial Differential Eqns");
        JMenu mnuMAlgebra1 = new JMenu("Modern Algebra 1");
        JMenu mnuMAlgebra2 = new JMenu("Modern Algebra 2");

        populateTrigonometryMenu(mnuTrig);
        populateAnalyticGeomMenu(mnuAnalyticGeom);

        menuBar.add(mnuCAlgebra);
        menuBar.add(mnuTrig);
        menuBar.add(mnuAnalyticGeom);
        menuBar.add(mnuPrecalculus);
        menuBar.add(mnuCalculus1);
        menuBar.add(mnuCalculus2);
        menuBar.add(mnuCalculus3);
        menuBar.add(mnuACalculus);
        menuBar.add(mnuDiffEqns);
        menuBar.add(mnuPDEqns);
        menuBar.add(mnuMAlgebra1);
        menuBar.add(mnuMAlgebra2);

        return menuBar;
    }

    private void populateTrigonometryMenu(JMenu mnuTrig) {
        mnuTrig.add("cos(x)");
        mnuTrig.add("sin(x)");
        mnuTrig.add("tan(x)");
        mnuTrig.add("sec(s)");
        mnuTrig.add("csc(x)");
        mnuTrig.add("cot(x)");
        mnuTrig.add("triangles");
        mnuTrig.add("trigonmetric identities");
    }

    private void populateAnalyticGeomMenu(JMenu mnuAnalyticGeom) {
        mnuAnalyticGeom.add("Parabolas");
        mnuAnalyticGeom.add("Ellipses");
        mnuAnalyticGeom.add("Circles");
        mnuAnalyticGeom.add("Hyperbolas");
    }

    public static void main(String[] args) {
        new MenusDemo();
    }
}

