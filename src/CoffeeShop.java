import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CoffeeShop implements ActionListener{

    JFrame frame;

    JTextField textField;

    JButton[] optionButtons = new JButton[15];

    JButton espressoButton, icedCoffeeButton, hotCoffeeButton;

    JButton coldBrewButton;

    JPanel panel;

    JTextArea field2;

    JLabel label;

    Font myFont = new Font("Ink Free", Font.BOLD, 21);


      CoffeeShop(String name){

        //Create Frame(Biggest Window)
        JFrame frame = new JFrame("Welcome to " + name + "'s CoffeeShop");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);

        //Create Text Field To Hold Price Totals
        textField = new JTextField();
        textField.setBounds(70, 25, 350, 50);
        textField.setFont(myFont);

        //Disables the user from typing in the text box
        textField.setEditable(false);

        //Creates A Panel that will hold the buttons in the options
        panel = new JPanel();
        panel.setBounds(50, 100, 200, 200);
        panel.setLayout(new GridLayout(4,4,10,10));

        //Creating buttons for our coffee options
        coldBrewButton = new JButton("Cold Brew");
        espressoButton = new JButton("Espresso");
        icedCoffeeButton = new JButton("Iced Coffee");
        hotCoffeeButton = new JButton("Hot Coffee");

        optionButtons[0] = coldBrewButton;

        coldBrewButton.addActionListener(this);
        espressoButton.addActionListener(this);
        icedCoffeeButton.addActionListener(this);
        hotCoffeeButton.addActionListener(this);

          //Add our coffee options onto our panel
          panel.add(coldBrewButton);
          panel.add(espressoButton);
          panel.add(icedCoffeeButton);
          panel.add(hotCoffeeButton);

          field2 = new JTextArea();

          field2.setBounds(450, 450, 300, 300);
          field2.setFont(myFont);
          field2.setText("Cart");
          field2.setEditable(false);
          field2.setLineWrap(false);



        frame.add(panel);
        frame.add(textField);
        frame.add(field2, BorderLayout.EAST);


        frame.setVisible(true);
    }

    public static void main(String[] args) {
        CoffeeShop robs = new CoffeeShop("Rob");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == coldBrewButton){
            textField.setText("Your total will be $3.77");
            field2.setText("\n" + field2.getText() + " Cold Brew");
        }
        else if(e.getSource() == espressoButton){
            textField.setText("Your total will be $2.13");
            field2.setText("\n" + field2.getText() + " Espresso");
        }
        else if(e.getSource() == icedCoffeeButton){
            textField.setText("Your total will be $3.07");
            field2.setText("\n" + field2.getText() + " Iced Coffee");
        }
        else if(e.getSource() == hotCoffeeButton){
            textField.setText("Your total will be $2.88");
            field2.setText("\n" + field2.getText() + " Hot Coffee");
        }

    }
}
