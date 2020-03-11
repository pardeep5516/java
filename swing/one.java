import javax.swing.*;
import java.awt.event.*;

class One{
    public static void main(String[] args) {
        JLabel label = new JLabel();
        JFrame frame = new JFrame("display");
        JButton button = new JButton("click");
        JTextField textField = new JTextField();
        textField.setBounds(50, 20, 70, 30);
        
        frame.add(button);
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                label.setText("hello");
            }
        });
        label.setBounds(50, 50, 50, 30);
        button.setBounds(50, 70, 80, 30);
        frame.add(label);
        frame.add(textField);
        frame.setVisible(true);
        frame.setSize(300, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
