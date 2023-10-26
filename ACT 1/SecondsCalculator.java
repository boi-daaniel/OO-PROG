import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SecondsCalculator extends JFrame {
   private JTextField Seconds, Years, Weeks, Hours, Minutes;
   private JButton calculateButton, exitButton;

   public SecondsCalculator() {
      // Frame Properties
      this.setTitle("Time Calculator");
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setSize(500, 300);
      this.setLayout(new GridLayout(6,2));
      this.setLocationRelativeTo(null);
      this.getContentPane().setBackground(new Color(0x141413));
      this.getRootPane().setBorder(BorderFactory.createLineBorder(Color.BLACK));
      Color textColor = new Color(0xfbfaf8);
      ImageIcon image = new ImageIcon("logo.png");
      this.setIconImage(image.getImage());
       
      // Seconds Panel Properties
      JLabel secondsLabel = new JLabel("Enter Seconds:");
      secondsLabel.setForeground(textColor);
      secondsLabel.setHorizontalAlignment(SwingConstants.CENTER);
      Seconds = new JTextField();
      Seconds.setHorizontalAlignment(SwingConstants.CENTER);
      Seconds.setBackground(new Color(0xffecd1));
      Seconds.setBorder(BorderFactory.createLineBorder(Color.BLACK));

      
      // Years Panel Properties
      JLabel yearsLabel = new JLabel("Seconds to Years:");
      yearsLabel.setForeground(textColor);
      yearsLabel.setHorizontalAlignment(SwingConstants.CENTER);
      
      Years = new JTextField();
      Years.setHorizontalAlignment(SwingConstants.CENTER);
      Years.setBackground(new Color(0xffecd1));
      Years.setBorder(BorderFactory.createLineBorder(Color.BLACK));
      Years.setEditable(false);

      // Weeks Panel Properties
      JLabel weeksLabel = new JLabel("Seconds to Weeks:");
      weeksLabel.setForeground(textColor);
      weeksLabel.setHorizontalAlignment(SwingConstants.CENTER);
      
      Weeks = new JTextField();
      Weeks.setHorizontalAlignment(SwingConstants.CENTER);
      Weeks.setBackground(new Color(0xffecd1));
      Weeks.setBorder(BorderFactory.createLineBorder(Color.BLACK));
      Weeks.setEditable(false);

      // Hours Panel Properties
      JLabel hoursLabel = new JLabel("Seconds to Hours:");
      hoursLabel.setForeground(textColor);
      hoursLabel.setHorizontalAlignment(SwingConstants.CENTER);
      
      Hours = new JTextField();
      Hours.setHorizontalAlignment(SwingConstants.CENTER);
      Hours.setBackground(new Color(0xffecd1));
      Hours.setBorder(BorderFactory.createLineBorder(Color.BLACK));
      Hours.setEditable(false);

      // Minutes Panel Properties
      JLabel minutesLabel = new JLabel("Seconds to Minutes:");
      minutesLabel.setForeground(textColor);
      minutesLabel.setHorizontalAlignment(SwingConstants.CENTER);
      Minutes = new JTextField();
      
      Minutes.setHorizontalAlignment(SwingConstants.CENTER);
      Minutes.setBackground(new Color(0xffecd1));
      Minutes.setBorder(BorderFactory.createLineBorder(Color.BLACK));
      Minutes.setEditable(false);
        
       
      
      // Calulate Button   
      calculateButton = new JButton("Calculate");
      calculateButton.setForeground(new Color(0x1b2021));
      calculateButton.setBackground(textColor);
      
      calculateButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
      calculateButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent calculate) {
            calculateTime();
         }
      });

      // Exit Button
      exitButton = new JButton("Exit");
      exitButton.setForeground(new Color(0x1b2021));
      exitButton.setBackground(textColor);
      
      exitButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
      exitButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent exit) {
                System.exit(0);
         }
      });

      // Components
      add(secondsLabel);
      add(Seconds);
        
      add(yearsLabel);
      add(Years);
        
      add(weeksLabel);
      add(Weeks);
        
      add(hoursLabel);
      add(Hours);
        
      add(minutesLabel);
      add(Minutes);
        
      add(calculateButton);
      add(exitButton);
      this.setVisible(true);
   }

   // Calculate Method
   public void calculateTime() {
      try {
         int inputSeconds = Integer.parseInt(Seconds.getText());
         int secondsInMinute = 60;
         int secondsInHour = secondsInMinute * 60;
         int secondsInDay = secondsInHour * 24;
         int secondsInWeek = 7 * secondsInDay;
         int secondsInYear = secondsInDay * 365;
   
         int years = inputSeconds / secondsInYear;
         int remainingSeconds = inputSeconds % secondsInYear;
         int weeks = remainingSeconds / secondsInWeek;
         remainingSeconds %= secondsInWeek;
         int days = remainingSeconds / secondsInDay;
         remainingSeconds %= secondsInDay;
         int hours = remainingSeconds / secondsInHour;
         remainingSeconds %= secondsInHour;
         int minutes = remainingSeconds / secondsInMinute;
   
         Years.setText(Integer.toString(years));
         Weeks.setText(Integer.toString(weeks));
         Hours.setText(Integer.toString(hours));
         Minutes.setText(Integer.toString(minutes));
      } 
      catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(this, "Invalid input. Please enter a valid number of seconds.");
      }
   }

    public static void main(String[] args) {
        new SecondsCalculator();
    }
}