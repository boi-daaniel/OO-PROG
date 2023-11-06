import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class HistoricalEvents extends JFrame {
   private ArrayList<String> eventsList;
   private int currentIndex;

   public HistoricalEvents() {
      // Frame Properties
      setTitle("Historical Events");
      setSize(600, 400);
      setLayout(new GridLayout(6, 0));
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      eventsList = new ArrayList<>();
      eventsList.add("Ketchup was once sold as a medicine");
      eventsList.add("Ice pops were accidentally invented by a kid!");
      eventsList.add("Tug-of-war was once an Olympic sport");
      eventsList.add("Iceland has the world's oldest parliament.");
      eventsList.add("A horse became a Senator in Ancient Rome.");
      eventsList.add("The Great Wall of China was built over 2,000 years ago");
      eventsList.add("Leonardo da Vinci painted the Mona Lisa between 1503 and 1506");
      eventsList.add("The first computer programmer was Ada Lovelace");
      eventsList.add("The first moon landing occurred on July 20, 1969");
      eventsList.add("The fall of the Berlin Wall happened on November 9, 1989");
       
      Collections.shuffle(eventsList);
      JLabel[] labels = new JLabel[5];
      for (int i = 0; i < 5; i++) {
         labels[i] = new JLabel(eventsList.get(i));
         labels[i].setHorizontalAlignment(SwingConstants.CENTER);
         add(labels[i]);
      }

      // Shuffle Button
        JButton shuffleButton = new JButton("Shuffle");
        add(shuffleButton);
        
        shuffleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Collections.shuffle(eventsList);
                labels[currentIndex].setText(eventsList.get(0));
                currentIndex = (currentIndex + 1) % 5;
            }
        });
        setVisible(true);
   }

   public static void main(String[] args) {
      new HistoricalEvents();
   }
}