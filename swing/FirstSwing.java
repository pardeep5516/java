import java.awt.event.*;  
import javax.swing.*;    
public class FirstSwing 
{  
    public static void main(String[] args)
    {  
        JFrame f=new JFrame("Button Example");  
        final JTextField tf=new JTextField();
        JLabel label = new JLabel();
        label.setBounds(50, 150, 100, 50);
        tf.setBounds(50,50, 150,20);  
        JButton b=new JButton("Click Here");  
        b.setBounds(50,100,95,30);  
        b.addActionListener(new ActionListener()
        {  
            public void actionPerformed(ActionEvent e) 
            {  
                int num = Integer.parseInt(tf.getText());
                int fact = 1;
                for(int i = 1; i <= num; i++){
                    fact = fact * i;
                }
                label.setText("fact: " + fact);  
            }  
        });  
        f.add(b);
        f.add(tf);
        f.add(label);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);   
    }  
}  