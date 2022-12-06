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

    double price;


    Font myFont = new Font("Ink Free", Font.BOLD, 21);


      CoffeeShop(String name){

        //Create Frame(Biggest Window)
        JFrame frame = new JFrame("Welcome to " + name + "'s CoffeeShop");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);

        //Create Text Field To Hold Price Totals
          textField = new JTextField();
          textField.setBounds(50, 25, 300, 50);
          textField.setFont(myFont);


        //Disables the user from typing in the text box
        textField.setEditable(false);

        //Creates A Panel that will hold the buttons in the options
          panel = new JPanel();
          panel.setBounds(50, 100, 300, 300);
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





        frame.add(panel);
        frame.add(textField);


        frame.setVisible(true);
    }

    public void setPrice(double newPrice){
          price += newPrice;
    }

    public static void main(String[] args) {
        CoffeeShop robs = new CoffeeShop("Rob");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == coldBrewButton){
            this.setPrice(2);
            textField.setText("Your total will be $" + price);
            //field2.append("\nCold Brew");
        }
        else if(e.getSource() == espressoButton){
            textField.setText("Your total will be $2.13");
            //field2.append("\nEspresso");
        }
        else if(e.getSource() == icedCoffeeButton){
            textField.setText("Your total will be $3.07");
            //field2.append("\nIced Coffee");
        }
        else if(e.getSource() == hotCoffeeButton){
            textField.setText("Your total will be $2.88");
            //field2.append("Hot Coffee");
        }

    }
}
