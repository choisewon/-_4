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
    JLabel mlName,mlDept,mlAddress,mlSchoolYear;
    JTextField tfName,tfDept,tfAddress;
    JButton mb,mbClear;
    JComboBox<String> cdSchoolYear;
    TextArea ta;
    public MyPanel(){
        this.setLayout(new FlowLayout());
        mlName = new JLabel("이름");
        mlDept = new JLabel("학과");
        mlAddress = new JLabel("주소");
        mlSchoolYear = new JLabel("학년");
        tfName = new JTextField(14);
        tfDept = new JTextField("글로벌소프트웨어",14);
        tfAddress = new JTextField(14);
        String[] array = {"1학년","2학년","3학년","4학년"};
        cdSchoolYear = new JComboBox<String>(array);
        mb = new JButton("추가");
        mbClear = new JButton("Clear");
        this.add(mlName);
        this.add(tfName);
        this.add(mlDept);
        this.add(tfDept);
        this.add(mlAddress);
        this.add(tfAddress);
        this.add(mlSchoolYear);
        this.add(cdSchoolYear);
        this.add(mb);
        this.add(mbClear);
    }
}
