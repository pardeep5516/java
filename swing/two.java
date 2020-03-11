import javax.swing.*;
import java.awt.event.*;

public class two extends JFrame implements ActionListener{
    JLabel l1, l2;
    JTextField t1;
    JRadioButton b1, b2;
    JButton ob1;
    Double a, b, c, d;
    String m, n, m1, n1;
    public two(){
        JFrame f1 = new JFrame("Temprature");
        ob1 = new JButton("click");
        ob1.addActionListener(this);
        l1 = new JLabel("Enter temprature");
        l1.setBounds(70, 50, 100, 70);
        f1.add(l1);
        t1 = new JTextField();
        t1.setBounds(200, 70, 60, 40);
        f1.add(ob1);
        f1.setVisible(true);
        f1.setSize(300, 400);
        f1.setLocationRelativeTo(null);
        f1.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        l1.setText("hello");
    }
    public static void main(String[] args) {
        new two();
    }
}