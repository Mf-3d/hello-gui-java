import javax.swing.*;
import java.awt.*;

class JSample1_4{
  public static void main(String args[]){
    JFrame frame = new JFrame("Hello Java");
    frame.setBounds(100, 100, 200, 200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel p = new JPanel();
    JLabel btn1 = new JLabel("Hello World!!");

    p.add(btn1);

    frame.getContentPane().add(p, BorderLayout.CENTER);
    frame.setVisible(true);
  }
}