import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CoffeeShop implements ActionListener{

    JFrame frame;

    JTextField textField, textfield2, coldbrewTextfield, espressoTextfield, icedCoffeefield, hotCoffeeTextfield;

    JButton[] optionButtons = new JButton[15];

    JButton espressoButton, icedCoffeeButton, hotCoffeeButton, coldBrewButton;

    JPanel panel;

    double price, coldBrewPrice, espressoPrice, icedCoffeePrice, hotCoffeePrice;

    int caffeineCount, coldBrewCaffeine, espressoCaffeine, icedCoffeeCaffeine, hotCoffeeCaffeine;

    int coldBrewCount, espressoCount, icedCoffeeCount, hotCoffeeCount;


    Font myFont = new Font("Ink Free", Font.BOLD, 21);


      CoffeeShop(String name){

        //Create Frame(Biggest Window)
        JFrame frame = new JFrame("Welcome to " + name + "'s CoffeeShop");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 1000);
        frame.setLayout(null);

        //Create Text Field To Hold Price Totals
          textField = new JTextField();
          textField.setBounds(50, 25, 300, 50);
          textField.setFont(myFont);


        //Disables the user from typing in the text box
        textField.setEditable(false);

        //Create text field to hold caffeine count
          textfield2 = new JTextField();
          textfield2.setBounds(550, 25, 450, 50);
          textfield2.setFont(myFont);
          textfield2.setEditable(false);

        //Creates A Panel that will hold the buttons in the options
          panel = new JPanel();
          panel.setBounds(50, 100, 200, 200);
          panel.setLayout(new GridLayout(4,4,10,10));

          //Create textfields to keep up with quantity of each item
          coldbrewTextfield = new JTextField();
          coldbrewTextfield.setBounds(270, 100, 90, 40);
          coldbrewTextfield.setFont(myFont);
          coldbrewTextfield.setEditable(false);

          espressoTextfield = new JTextField();
          espressoTextfield.setBounds(270, 125, 90, 40);
          espressoTextfield.setFont(myFont);
          espressoTextfield.setEditable(false);

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

        coldBrewPrice = 3.25;
        espressoPrice = 2.77;
        icedCoffeePrice = 3.15;
        hotCoffeePrice = 2.85;

        coldBrewCaffeine = 255;
        espressoCaffeine = 115;
        icedCoffeeCaffeine = 85;
        hotCoffeeCaffeine = 90;

        coldBrewCount = 0;
        espressoCount = 0;
        icedCoffeeCount = 0;
        hotCoffeeCount = 0;

          //Add our coffee options onto our panel
          panel.add(coldBrewButton);
          panel.add(espressoButton);
          panel.add(icedCoffeeButton);
          panel.add(hotCoffeeButton);

        //Adding the panel with the buttons, all textfields to the frame so they actually appear
        frame.add(panel);
        frame.add(textField);
        frame.add(textfield2);
        frame.add(coldbrewTextfield);


        frame.setVisible(true);
    }

    public void setPrice(double newPrice){
          price += newPrice;
    }

    public void setCaffeineCount(int caffeine){
          caffeineCount += caffeine;
    }

    public static void main(String[] args) {
        CoffeeShop robs = new CoffeeShop("Rob");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == coldBrewButton){
            this.setPrice(coldBrewPrice);
            this.setCaffeineCount(coldBrewCaffeine);
            textField.setText("Your total will be $" + String.format("%.2f", price));
            textfield2.setText("Caffeine count: " + caffeineCount + "mg");
            coldBrewCount++;
            coldbrewTextfield.setText("" + coldBrewCount);
        }
        else if(e.getSource() == espressoButton){
            this.setPrice(espressoPrice);
            this.setCaffeineCount(espressoCaffeine);
            textField.setText("Your total will be $" + String.format("%.2f", price));
            textfield2.setText("Caffeine count: " + caffeineCount + "mg");
        }
        else if(e.getSource() == icedCoffeeButton){
            this.setPrice(icedCoffeePrice);
            this.setCaffeineCount(icedCoffeeCaffeine);
            textField.setText("Your total will be $" + String.format("%.2f", price));
            textfield2.setText("Caffeine count: " + caffeineCount + "mg");
        }
        else if(e.getSource() == hotCoffeeButton){
            this.setPrice(hotCoffeePrice);
            this.setCaffeineCount(hotCoffeeCaffeine);
            textField.setText("Your total will be $" + String.format("%.2f", price));
            textfield2.setText("Caffeine count: " + caffeineCount + "mg");
        }

    }
}
