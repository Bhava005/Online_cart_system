package onlinecartsystem;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class Onlinecartsystem extends JFrame {

    JTextField productfield,brandfield,pricefield;
    JLabel  productlabel,brandlabel,pricelabel;
    JButton clearbutton,insertbutton,displaybutton;
    public Onlinecartsystem()
    {
        productlabel=new JLabel("Enter the Product name:");
        brandlabel =new JLabel("Enter the brand anme:");
        pricelabel=new JLabel("Enter the price amount:");
        
        productfield=new JTextField(20);
        brandfield=new JTextField(20);
        pricefield=new JTextField(20);
        
        clearbutton=new JButton("CLEAR");
        insertbutton=new JButton("INSERT");
        displaybutton=new JButton("DISPLAY");
        
        setLayout(new GridLayout(5,2));
        add(productlabel);
        add(productfield);
        add(brandlabel);
        add(brandlabel);
        add(brandfield);
        add(pricelabel);
        add(pricefield);
        add(clearbutton);
        add(insertbutton);
        add(displaybutton);
        
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        
    }
    
    public static void main(String[] args) {
        
        new Onlinecartsystem();
    }
    
}
