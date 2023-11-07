import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class button extends JFrame {
   int clickCount = 0;
   JButton click;
   
   public button(){
      setTitle("Click Me");
      setSize(500, 300);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      click = new JButton("Click Me!");
      click.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent exit) {
            clickCount++;
                if (clickCount == 8) {
                    click.setText("That's enough");
                    click.setEnabled(false);
                }    
         }
      });
      
      add(click);
      setVisible(true);
   }
   
   public static void main(String[] args){
      new button();
   }
}