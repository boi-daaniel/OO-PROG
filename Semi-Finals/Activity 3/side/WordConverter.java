import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class WordConverter extends JFrame implements KeyListener {
    JTextField inputField;
    JTextPane displayArea;

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
        displayArea = new JTextPane();
        displayArea.setEditable(false);


        // Components
        add(displayArea);
        add(inputField);
        setVisible(true);
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            String inputText = inputField.getText();
            String uppercaseText = inputText.toUpperCase();
            String output = "Input: " + inputText + "\nUppercase: " + uppercaseText + "\n\n";
            displayArea.setText(output);
            inputField.setText("");
        }
    }

    public void keyReleased(KeyEvent e) {
    }

    public static void main(String[] args) {
        new WordConverter();
    }
}
