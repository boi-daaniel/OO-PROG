import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.Border;

public class SecondsCalculator extends JFrame {
   // Variables
   private JTextField Seconds, Years, Weeks, Hours, Minutes;
   private JButton calculateButton, exitButton;
   private static final double SECONDS_IN_YEAR = 3.154e+7;
   private static final double SECONDS_IN_WEEK = 604800;
   private static final double SECONDS_IN_HOUR = 3600;
   private static final double SECONDS_IN_MINUTE = 60;
   private Border blackBorder = BorderFactory.createLineBorder(Color.BLACK);
   private Color backgroundColor = new Color(0xffecd1);

   public SecondsCalculator() {
      // Frame Properties
      setTitle("Time Calculator");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(500, 300);
      setLayout(new GridLayout(6,2));
      setLocationRelativeTo(null);
      getContentPane().setBackground(new Color(0x141413));
      getRootPane().setBorder(blackBorder);
      Color textColor = new Color(0xfbfaf8);
      ImageIcon image = new ImageIcon("logo.png");
      setIconImage(image.getImage());
       
      // Seconds Panel Properties
      JLabel secondsLabel = new JLabel("Enter Seconds:");
      secondsLabel.setForeground(textColor);
      secondsLabel.setHorizontalAlignment(SwingConstants.CENTER);
      Seconds = new JTextField();
      Seconds.setHorizontalAlignment(SwingConstants.CENTER);
      Seconds.setBackground(backgroundColor);
      Seconds.setBorder(blackBorder);
      
      // Years Panel Properties
      JLabel yearsLabel = new JLabel("Seconds to Year:");
      yearsLabel.setForeground(textColor);
      yearsLabel.setHorizontalAlignment(SwingConstants.CENTER);
      Years = new JTextField();
      Years.setHorizontalAlignment(SwingConstants.CENTER);
      Years.setBackground(backgroundColor);
      Years.setBorder(blackBorder);
      Years.setEditable(false);

      // Weeks Panel Properties
      JLabel weeksLabel = new JLabel("Seconds to Week:");
      weeksLabel.setForeground(textColor);
      weeksLabel.setHorizontalAlignment(SwingConstants.CENTER);
      Weeks = new JTextField();
      Weeks.setHorizontalAlignment(SwingConstants.CENTER);
      Weeks.setBackground(backgroundColor);
      Weeks.setBorder(blackBorder);
      Weeks.setEditable(false);

      // Hours Panel Properties
      JLabel hoursLabel = new JLabel("Seconds to Hour:");
      hoursLabel.setForeground(textColor);
      hoursLabel.setHorizontalAlignment(SwingConstants.CENTER);
      Hours = new JTextField();
      Hours.setHorizontalAlignment(SwingConstants.CENTER);
      Hours.setBackground(backgroundColor);
      Hours.setBorder(blackBorder);
      Hours.setEditable(false);

      // Minutes Panel Properties
      JLabel minutesLabel = new JLabel("Seconds to Minute:");
      minutesLabel.setForeground(textColor);
      minutesLabel.setHorizontalAlignment(SwingConstants.CENTER);
      Minutes = new JTextField();
      Minutes.setHorizontalAlignment(SwingConstants.CENTER);
      Minutes.setBackground(backgroundColor);
      Minutes.setBorder(blackBorder);
      Minutes.setEditable(false);
      
      // Calulate Button   
      calculateButton = new JButton("Calculate");
      calculateButton.setForeground(new Color(0x1b2021));
      calculateButton.setBackground(textColor);
      calculateButton.setBorder(blackBorder);
      
      calculateButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent calculate) {
            try {
            int inputSeconds = Integer.parseInt(Seconds.getText());
            double years = inputSeconds / SECONDS_IN_YEAR;
            double remainingSeconds = inputSeconds % SECONDS_IN_YEAR;
            double weeks = remainingSeconds / SECONDS_IN_WEEK;
            double hours = remainingSeconds / SECONDS_IN_HOUR;
            double minutes = remainingSeconds / SECONDS_IN_MINUTE;

            String formattedYears = String.format("%.4e", years);
            Years.setText(formattedYears);
            Weeks.setText(Double.toString(weeks));
            Hours.setText(Double.toString(hours));
            Minutes.setText(Double.toString(minutes));
            } 
            catch (NumberFormatException e) {
                  JOptionPane.showMessageDialog(SecondsCalculator.this, "Invalid input. Please enter a valid number of seconds.");
            }
         }
      });

      // Exit Button
      exitButton = new JButton("Exit");
      exitButton.setForeground(new Color(0x1b2021));
      exitButton.setBackground(textColor);
      exitButton.setBorder(blackBorder);
      
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
      setVisible(true);
   }

    public static void main(String[] args) {
        new SecondsCalculator();
    }
}
