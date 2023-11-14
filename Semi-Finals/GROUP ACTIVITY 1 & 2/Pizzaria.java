import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pizzaria extends JFrame implements ActionListener {
    private JComboBox<String> toppingsBox, sizeBox;
    private JTextField total;

    Pizzaria() {
        setSize(240, 300);
        setTitle("Pizza");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 1));

        String[] toppings = {"Cheese", "Pepperoni", "Mushrooms", "Sausage", "Black Olives"};
        String[] sizes = {"Small", "Medium", "Large", "Extra Large"};

        JLabel pizza = new JLabel("My Pizza Hut");
        pizza.setFont(new Font("Calibri", Font.BOLD, 30));
        pizza.setHorizontalAlignment(SwingConstants.CENTER);
        pizza.setBorder(new EmptyBorder(30, 0, 0, 0));

        JLabel sizeLabel = new JLabel("Size List");
        sizeLabel.setBorder(new EmptyBorder(30, 10, 10, 10));
        sizeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        sizeBox = new JComboBox<>(sizes);
        sizeBox.setFocusable(false);
        sizeBox.setBorder(new EmptyBorder(5, 30, 5, 30)); 
        sizeBox.addActionListener(this);

        JLabel tList = new JLabel("Topping List");
        tList.setBorder(new EmptyBorder(30, 10, 10, 10));
        tList.setHorizontalAlignment(SwingConstants.CENTER);
        toppingsBox = new JComboBox<>(toppings);
        toppingsBox.setFocusable(false);
        toppingsBox.setBorder(new EmptyBorder(5, 30, 5, 30)); 
        toppingsBox.addActionListener(this);

        total = new JTextField();
        total.setEditable(false);
        total.setHorizontalAlignment(SwingConstants.CENTER);
        total.setBorder(new EmptyBorder(5, 30, 5, 30)); 

        add(pizza);
        add(sizeLabel);
        add(sizeBox);
        add(tList);
        add(toppingsBox);
        add(total);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int sizePrice = 0;

        switch (sizeBox.getSelectedItem().toString()) {
            case "Small":
                sizePrice = 300;
                break;
            case "Medium":
                sizePrice = 400;
                break;
            case "Large":
                sizePrice = 500;
                break;
            case "Extra Large":
                sizePrice = 600;
                break;
        }

        int toppingPrice = 10; // Fixed topping price of $10

        // Calculate toppings cost (way apil cheese)
        int selectedToppingsIndex = toppingsBox.getSelectedIndex();
        int toppingsCost = (selectedToppingsIndex > 0) ? toppingPrice : 0;
        int totalPrice = sizePrice + toppingsCost;
        total.setText("Total Price: " + totalPrice);
    }

    public static void main(String[] args) {
        new Pizzaria();
    }
}
