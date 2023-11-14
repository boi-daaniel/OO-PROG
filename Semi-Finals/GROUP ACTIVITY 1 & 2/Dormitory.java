import javax.swing.*;
import java.awt.*;

public class Dormitory extends JFrame {
    private final JCheckBox[] checkboxes;
    private final JTextArea result;

    public Dormitory() {
        setTitle("Dormitory");
        setSize(500, 300);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        checkboxes = new JCheckBox[] {
            createCheckBox("Private"),
            createCheckBox("Internet"),
            createCheckBox("Cable TV"),
            createCheckBox("Microwave"),
            createCheckBox("Refrigerator")
        };

        result = new JTextArea();
        result.setEditable(false);

        for (JCheckBox checkBox : checkboxes) {
            checkBox.setFocusable(false);
            checkBox.addItemListener(e -> updateResult());
            add(checkBox);
        }
        updateResult();
        add(result);
        setVisible(true);
    }

    private JCheckBox createCheckBox(String label) {
        return new JCheckBox(label);
    }

    private void updateResult() {
        StringBuilder resultText = new StringBuilder();

        for (int i = 0; i < checkboxes.length; i++) {
            JCheckBox checkBox = checkboxes[i];
            String checkboxLabel = checkBox.getText();

            if (checkboxLabel.equals("Private")) {
                resultText.append(checkBox.isSelected() ? "Private Room\n" : "Shared Room\n");
            } else {
                resultText.append(checkBox.isSelected() ? "With " : "No ").append(checkboxLabel);
                if (i < checkboxes.length - 1) {
                    resultText.append("\n");
                }
            }
        }

        result.setText(resultText.toString());
    }

    public static void main(String[] args) {
        new Dormitory();
    }
}
