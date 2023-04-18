package swinggui.combinations;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;


public class HamburgerOrder extends JFrame {

    public HamburgerOrder() {
        setTitle("JCheckBox/JRadioButton Demo");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlowLayout flowLayout = new FlowLayout();
        this.setLayout(flowLayout);

        // Create the Hamburger Ingredients panel
        JPanel pnlHIngreds = new JPanel();
        GridLayout glo = new GridLayout(0, 1);
        pnlHIngreds.setLayout(glo);
        pnlHIngreds.setSize(150, 200);
        pnlHIngreds.setPreferredSize(new Dimension(150, 200));
        Border hBorder = BorderFactory.createTitledBorder("Hamburger Ingredients");
        pnlHIngreds.setBorder(hBorder);

        // Create the checkboxes that will go in the Hamburger Ingredients panel
        JCheckBox cbxLettuce = new JCheckBox("Lettuce");
        JCheckBox cbxCheese = new JCheckBox("Cheese");
        JCheckBox cbxJalapenos = new JCheckBox("Jalapenos");
        JCheckBox cbxTomatoes = new JCheckBox("Tomatoes");
        JCheckBox cbxOnions = new JCheckBox("Onions");
        JCheckBox cbxPickles = new JCheckBox("Pickles");

        // Add the checkboxes to the Hamburger Ingredients panel
        pnlHIngreds.add(cbxLettuce);
        pnlHIngreds.add(cbxCheese);
        pnlHIngreds.add(cbxJalapenos);
        pnlHIngreds.add(cbxTomatoes);
        pnlHIngreds.add(cbxOnions);
        pnlHIngreds.add(cbxPickles);

        // Create the Side Orders panel
        JPanel pnlSideOrders = new JPanel();
        GridLayout glo1 = new GridLayout(0, 1);
        pnlSideOrders.setLayout(glo1);
        pnlSideOrders.setSize(150, 200);
        Border soBorder = BorderFactory.createTitledBorder("Side Orders");
        pnlSideOrders.setBorder(soBorder);

        // Create the checkboxes that will go in the Side Orders panel
        JCheckBox cbxFries = new JCheckBox("Fries");
        JCheckBox cbxCurlyFries = new JCheckBox("Curly Fries");
        JCheckBox cbxBeans = new JCheckBox("Beans");
        JCheckBox cbxColeSlaw = new JCheckBox("ColeSlaw");

        // Add the checkboxes to the Side Orders panel
        pnlSideOrders.add(cbxFries);
        pnlSideOrders.add(cbxCurlyFries);
        pnlSideOrders.add(cbxBeans);
        pnlSideOrders.add(cbxColeSlaw);

        // Create the Drinks panel
        JPanel pnlDrinks = new JPanel();
        pnlDrinks.setSize(150, 100);
        Border dBorder = BorderFactory.createTitledBorder("Drinks");
        pnlDrinks.setBorder(dBorder);

        // Create the radio buttons that will go into the Drinks panel
        JRadioButton rbnCoke = new JRadioButton("Coca-Cola");
        JRadioButton rbnPepsi = new JRadioButton("Pepsi");
        JRadioButton rbnRootBeer = new JRadioButton("Root Beer");
        JRadioButton rbnIcedTea = new JRadioButton("Iced Tea");
        JRadioButton rbnLemonade = new JRadioButton("Lemonade");

        // Create a button group and add the radio buttons to it
        ButtonGroup btnGroup = new ButtonGroup();
        btnGroup.add(rbnCoke);
        btnGroup.add(rbnPepsi);
        btnGroup.add(rbnRootBeer);
        btnGroup.add(rbnIcedTea);
        btnGroup.add(rbnLemonade);

        // Add the radio buttons to the Drinks panel
        pnlDrinks.add(rbnCoke);
        pnlDrinks.add(rbnPepsi);
        pnlDrinks.add(rbnRootBeer);
        pnlDrinks.add(rbnIcedTea);
        pnlDrinks.add(rbnLemonade);

        // Add the panels to the frame
        this.add(pnlHIngreds);
        this.add(pnlSideOrders);
        this.add(pnlDrinks);

        setVisible(true);
    }
    
    public static void main(String[] args) {
        new HamburgerOrder();
    }
}
