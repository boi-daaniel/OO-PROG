import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class WordConverter extends JFrame implements KeyListener {
    JTextField inputField;
    JLabel displayArea;

    public WordConverter() {
        // Frame Properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        setLayout(new GridLayout(2, 1));
        setTitle("Word Converter");
        setLocationRelativeTo(null);

        // Text Field
        inputField = new JTextField();
        inputField.setHorizontalAlignment(SwingConstants.CENTER);
        inputField.addKeyListener(this);

        // Display Area
        displayArea = new JLabel();
        displayArea.setHorizontalAlignment(SwingConstants.CENTER);

        // Components
        add(inputField);
        add(displayArea);
        setVisible(true);
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            String inputText = inputField.getText();
            String convertedText = convertCase(inputText);
            String output = "<html>Input: " + inputText + "<br>Converted: " + convertedText + "</html>";
            displayArea.setText(output);
            inputField.setText("");
        }
    }

    public void keyReleased(KeyEvent e) {
    }

    private String convertCase(String text) {
        StringBuilder convertedText = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isUpperCase(c)) {
                convertedText.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                convertedText.append(Character.toUpperCase(c));
            } else {
                convertedText.append(c);
            }
        }
        return convertedText.toString();
    }

    public static void main(String[] args) {
        new WordConverter();
    }
}
