import javax.swing.*;
import java.awt.event.*;
public class ScannerDialog implements ActionListener {  
    JTextField tf1;
    void TextFieldExample() {  
        JFrame f= new JFrame();
        tf1=new JTextField();
        tf1.setBounds(50,50,150,20);
        f.add(tf1);
        f.setSize(300,300);
        f.setLayout(null); 
        f.setVisible(true);
    }         
    public void actionPerformed(ActionEvent e) {  
        String s1=tf1.getText();
        int a=Integer.parseInt(s1);
        int c=0;
        String result=String.valueOf(c);
        System.out.println(e);
    }
    public static void main(String[] args) {  
        new ScannerDialog().TextFieldExample();;
    } 
}
// to disable parameter name thing: 
// Language support for Java extension, search for "parameters"