import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * Write a description of class MyPanel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyPanel extends JPanel
{
    JLabel mlName,mlDept,mlAddress;
    JTextField tfName,tfDept,tfAddress;
    public MyPanel(){
        this.setLayout(new FlowLayout());
        mlName = new JLabel("?���?");
        mlDept = new JLabel("?���?");
        mlAddress = new JLabel("주소");
        tfName = new JTextField(14);
        tfDept = new JTextField("�?로벌?��?��?��?��?��",14);
        tfAddress = new JTextField(14);
        
        this.add(mlName);
        this.add(tfName);
        this.add(mlDept);
        this.add(tfDept);
        this.add(mlAddress);
        this.add(tfAddress);
        
    }
}
