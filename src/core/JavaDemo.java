package core;

import java.awt.BorderLayout;
import java.awt.Component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import swinggui.buttons.ButtonsDemo;
import swinggui.checkboxes.CheckBoxesDemo;
import swinggui.comboboxes.ComboBoxesDemo;
import swinggui.dialogs.DialogsDemo;
import swinggui.frames.FramesDemo;
import swinggui.labels.LabelsDemo;
import swinggui.lists.ListsDemo; 
import swinggui.menus.MenusDemo;
import swinggui.panels.PanelsDemo;
import swinggui.progressbars.ProgressBarsDemo;
import swinggui.radiobuttons.RadioButtonsDemo;
import swinggui.scrollbars.ScrollBarsDemo;
import swinggui.sliders.SlidersDemo;
import swinggui.spinners.SpinnersDemo;
import swinggui.tables.TablesDemo;
import swinggui.textareas.TextAreasDemo;
import swinggui.textfields.TextFieldsDemo;
import swinggui.togglebuttons.ToggleButtonsDemo;
import swinggui.trees.TreesDemo;

public class JavaDemo extends JFrame implements ActionListener {
    public JavaDemo() {
        setTitle("Java Demo");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BorderLayout brdrLyot = new BorderLayout();
        setLayout(brdrLyot);
        JMenuBar menuBar = createMenuBar();
        addActionListeners(menuBar);
        
        add(menuBar, BorderLayout.NORTH);
        setVisible(true);
    }

    private JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        JMenu mnuSwing = new JMenu("Swing");
        JMenu mnuAlgo = new JMenu("Algorithms");

        populateSwingMenu(mnuSwing);
        populateAlgorithmsMenu(mnuAlgo);

        menuBar.add(mnuSwing);
        menuBar.add(mnuAlgo);

        return menuBar;
    }

    private void populateSwingMenu(JMenu mnuSwing) {
        JMenuItem mimToggleButtons = new JMenuItem("Toggle buttons");
        JMenuItem mimButtons = new JMenuItem("Buttons");
        JMenuItem mimCheckBoxes = new JMenuItem("Check boxes");
        JMenuItem mimRadioButtons = new JMenuItem("Radio buttons");

        JMenuItem mimTextFields = new JMenuItem("Textfields");
        JMenuItem mimTextAreas = new JMenuItem("Textareas");
        JMenuItem mimSpinners = new JMenuItem("Spinners");
        JMenuItem mimLabels = new JMenuItem("Labels");

        JMenuItem mimLists = new JMenuItem("Lists");
        JMenuItem mimComboBoxes = new JMenuItem("ComboBoxes");
        JMenuItem mimMenus = new JMenuItem("Menus");

        JMenuItem mimScrollbars = new JMenuItem("Scrollbars");
        JMenuItem mimSliders = new JMenuItem("Sliders");
        JMenuItem mimProgressBars = new JMenuItem("ProgressBars");

        JMenuItem mimFrames = new JMenuItem("Frames");
        JMenuItem mimDialogs = new JMenuItem("Dialogs");
        JMenuItem mimPanels = new JMenuItem("Panels");

        JMenuItem mimTables = new JMenuItem("Tables");
        JMenuItem mimTrees = new JMenuItem("Trees");

        mnuSwing.add(mimToggleButtons);
        mnuSwing.add(mimButtons);
        mnuSwing.add(mimCheckBoxes);
        mnuSwing.add(mimRadioButtons);
        mnuSwing.addSeparator();

        mnuSwing.add(mimTextFields);
        mnuSwing.add(mimTextAreas);
        mnuSwing.add(mimSpinners);
        mnuSwing.add(mimLabels);
        mnuSwing.addSeparator();

        mnuSwing.add(mimLists);
        mnuSwing.add(mimComboBoxes);
        mnuSwing.add(mimMenus);
        mnuSwing.addSeparator();

        mnuSwing.add(mimScrollbars);
        mnuSwing.add(mimSliders);
        mnuSwing.add(mimProgressBars);
        mnuSwing.addSeparator();

        mnuSwing.add(mimFrames);
        mnuSwing.add(mimDialogs);
        mnuSwing.add(mimPanels);
        mnuSwing.addSeparator();

        mnuSwing.add(mimTables);
        mnuSwing.add(mimTrees);
    }


    private void populateAlgorithmsMenu(JMenu mnuAlgo) {
        JMenu mnuSearching = new JMenu("Searching");
        JMenuItem mimLinearSearch = new JMenuItem("Linear Search");
        JMenuItem mimBinarySearch = new JMenuItem("Binary search");
        mnuSearching.add(mimLinearSearch);
        mnuSearching.add(mimBinarySearch);

        JMenu mnuSorting = new JMenu("Sorting");
        JMenuItem mimInsertionSort = new JMenuItem("Insertion sort");
        JMenuItem mimSelectionSort = new JMenuItem("Selection sort");
        JMenuItem mimBubbleSort = new JMenuItem("Bubble sort");
        mnuSorting.add(mimInsertionSort);
        mnuSorting.add(mimSelectionSort);
        mnuSorting.add(mimBubbleSort);

        mnuAlgo.add(mnuSearching);
        mnuAlgo.add(mnuSorting);
    }


    private void addActionListeners(JMenuBar pMenuBar) {
        int iMenuCnt = pMenuBar.getMenuCount();
        for (int i = 0; i < iMenuCnt; i++) {
            JMenu currMenu = pMenuBar.getMenu(i);
            String currMenuStr = currMenu.getText();
            currMenuStr = currMenuStr.strip();
            int iMenuItemCnt = currMenu.getMenuComponentCount();

            Component[] menuComponents = currMenu.getMenuComponents();
            for (int j = 0; j < iMenuItemCnt; j++) {
                if (menuComponents[j] instanceof JMenuItem) {
                    JMenuItem currMenuItem = (JMenuItem)menuComponents[j];
                    currMenuItem.setActionCommand(currMenuStr + "|" + currMenuItem.getText());
                    currMenuItem.addActionListener(this);
                }
            }
        }
    }

    public void actionPerformed(ActionEvent ae) {
        String sActionCmd = ae.getActionCommand();
        int idx = sActionCmd.indexOf("|");
        if (idx == -1) {
            throw new IllegalStateException("Found a menu item whose action command did not contain the '|' character");
        }
        String sMenu = sActionCmd.substring(0, idx);
        if (sMenu.equals("Swing")) {
            processSwingMenuItem(sActionCmd);
        } else {
            processAlgoMenuItem(sActionCmd);
        }
    }

    
    private void processSwingMenuItem(String psActionCmd) {
        switch(psActionCmd) {
        case "Swing|Toggle buttons":
            new ToggleButtonsDemo();
            break;
        case "Swing|Buttons":
            new ButtonsDemo();
            break;
        case "Swing|Check boxes":
            new CheckBoxesDemo();
            break;
        case "Swing|Radio buttons":
            new RadioButtonsDemo();
            break;
        case "Swing|Textfields":
            new TextFieldsDemo();
            break;
        case "Swing|Textareas":
            new TextAreasDemo();
            break;
        case "Swing|Spinners":
            new SpinnersDemo();
            break;
        case "Swing|Labels":
            new LabelsDemo();
            break;
        case "Swing|Lists":
            new ListsDemo();
            break;
        case "Swing|ComboBoxes":
            new ComboBoxesDemo();
            break;
        case "Swing|Menus":
            new MenusDemo();
            break;
        case "Swing|Scrollbars":
            new ScrollBarsDemo();
            break;
        case "Swing|Sliders":
            new SlidersDemo();
            break;
        case "Swing|ProgressBars":
            new ProgressBarsDemo();
            break;
        case "Swing|Frames":
            new FramesDemo();
            break;
        case "Swing|Dialogs":
            new DialogsDemo();
            break;
        case "Swing|Panels":
            new PanelsDemo();
            break;
        case "Swing|Tables":
            new TablesDemo();
            break;
        case "Swing|Trees":
            new TreesDemo();
            break;
        default:
            throw new IllegalStateException("Unknown Swing menu item!");
        } // switch
    }

    private void processAlgoMenuItem(String psActionCmd) {
        switch(psActionCmd) {
        case "Swing|Toggle buttons":
            break;
        case "Swing|Buttons":
            new ButtonsDemo();
            break;
        case "Swing|Check boxes":
            break;
        default:
            throw new IllegalStateException("Unknown algorithm menu item!");
        } // switch
    }

    public static void main(String[] args) {
        new JavaDemo();
    }
}

