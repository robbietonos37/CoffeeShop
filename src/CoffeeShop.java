import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CoffeeShop implements ActionListener{

    JFrame frame;

    JTextField textField = new JTextField();

    JButton[] optionButtons = new JButton[15];

    JButton espressoButton, icedCoffeeButton, hotCoffeeButton;

    JButton coldBrewButton;

    JPanel panel;

    Font myFont = new Font("Ink Free", Font.BOLD, 21);


      CoffeeShop(){

        frame = new JFrame("Welcome to Rob's");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        frame.setSize(420, 550);
        frame.setLayout(null);
         textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);
        textField.setFont(myFont);

        //disables the user from typing in the text box
        textField.setEditable(false);

        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4,4,10,10));

        coldBrewButton = new JButton("Cold Brew");
        espressoButton = new JButton("Espresso");
        icedCoffeeButton = new JButton("Iced Coffee");
        hotCoffeeButton = new JButton("Hot Coffee");




          optionButtons[0] = coldBrewButton;

        coldBrewButton.addActionListener(this);
          espressoButton.addActionListener(this);

          icedCoffeeButton.addActionListener(this);

          hotCoffeeButton.addActionListener(this);

          panel.add(coldBrewButton);
          panel.add(espressoButton);
          panel.add(icedCoffeeButton);
          panel.add(hotCoffeeButton);

        frame.add(panel);

        frame.add(textField);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        CoffeeShop robs = new CoffeeShop();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == coldBrewButton){
            textField.setText("Your total will be $3.77");
        }
        if(e.getSource() == espressoButton){
            textField.setText("Your total will be $2.13");
        }
        if(e.getSource() == icedCoffeeButton){
            textField.setText("Your total will be $3.07");
        }
        if(e.getSource() == hotCoffeeButton){
            textField.setText("Your total will be $2.88");
        }
    }
}
