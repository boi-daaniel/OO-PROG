import javax.swing.*;
import java.awt.*;

public class HistoricalEvents extends JFrame{
   
   public HistoricalEvents(){
      // Frame Properties
      setTitle("Historical Events");
      setSize(600, 400);
      setLayout(new GridLayout(6,0));
      setLocationRelativeTo(null);
      
      JLabel First = new JLabel("Ketchup was once sold as a medicine");
      First.setHorizontalAlignment(SwingConstants.CENTER);
      JLabel Second = new JLabel("Ice pops were accidentally invented by a kid!");
      Second.setHorizontalAlignment(SwingConstants.CENTER);
      JLabel Third = new JLabel("Tug-of-war was once an Olympic sport");
      Third.setHorizontalAlignment(SwingConstants.CENTER);
      JLabel Fourth = new JLabel("Iceland has the world's oldest parliament.");
      Fourth.setHorizontalAlignment(SwingConstants.CENTER);
      JLabel Fifth = new JLabel("A horse became a Senator in Ancient Rome.");
      Fifth.setHorizontalAlignment(SwingConstants.CENTER);
      
      JButton mix = new JButton("Shuffle");
      
      // Components
      add(First);
      add(Second);
      add(Third);
      add(Fourth);
      add(Fifth);
      add(mix);
      setVisible(true);
   }
   
   public static void main(String[] args){
      new HistoricalEvents();
   }
}