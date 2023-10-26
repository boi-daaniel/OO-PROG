import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Triangle extends JFrame{
   private JTextField lengthField, widthField, Area, Perimeter;
   private JButton calculateButton, exitButton;
   
   public Triangle(){
      //Frame Properties
      setTitle("Triangle Calculator");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(500, 300);
      setLayout(new GridLayout(5,2));
      setLocationRelativeTo(null);
      getContentPane().setBackground(new Color(0x141413));
      Color textColor = new Color(0xfbfaf8);
      ImageIcon image = new ImageIcon("logo.png");
      setIconImage(image.getImage());
      
      // Length 
      JLabel lengthLabel = new JLabel("Enter Length:");
      lengthLabel.setForeground(textColor);
      lengthLabel.setHorizontalAlignment(SwingConstants.CENTER);
      lengthField = new JTextField();
      lengthField.setBackground(new Color(0xffecd1));

      // Width
      JLabel widthLabel = new JLabel("Enter Width:");
      widthLabel.setForeground(textColor);
      widthLabel.setHorizontalAlignment(SwingConstants.CENTER);
      widthField = new JTextField();
      widthField.setBackground(new Color(0xffecd1));

      // Area
      JLabel areaLabel = new JLabel("Area: ");
      areaLabel.setForeground(textColor);
      areaLabel.setHorizontalAlignment(SwingConstants.CENTER);
      Area = new JTextField();
      Area.setEditable(false);
      Area.setBackground(new Color(0xffecd1));
      
      // Perimeter
      JLabel perimeterLabel = new JLabel("Perimeter: ");
      perimeterLabel.setForeground(textColor);
      perimeterLabel.setHorizontalAlignment(SwingConstants.CENTER);
      Perimeter = new JTextField();
      Perimeter.setEditable(false);
      Perimeter.setBackground(new Color(0xffecd1));
      
      // Calculate Button
      JButton calculateButton = new JButton("Calculate");
      calculateButton.setForeground(new Color(0x1b2021));
      calculateButton.setBackground(textColor);
      calculateButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
      
      calculateButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            double length = Double.parseDouble(lengthField.getText());
            double width = Double.parseDouble(widthField.getText());
            double area = length * width;
            double perimeter = 2 * (length + width);
            String formattedArea = String.valueOf(area);
            String formattedPerimeter = String.valueOf(perimeter);
            Area.setText(formattedArea);
            Perimeter.setText(formattedPerimeter);
                
         }
      });

      // Exit Button
      JButton exitButton = new JButton("Exit");
      exitButton.setForeground(new Color(0x1b2021));
      exitButton.setBackground(textColor);
      exitButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
      
      exitButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
      exitButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent exit) {
                System.exit(0);
         }
      });
      
       
      // Components
      add(lengthLabel);
      add(lengthField);
      
      add(widthLabel);
      add(widthField);
      
      add(areaLabel);
      add(Area);
      
      add(perimeterLabel);
      add(Perimeter);
      
      add(calculateButton);
      add(exitButton);
      setVisible(true);
   }
   
   public static void main(String[] args){
      new Triangle();
   }
}