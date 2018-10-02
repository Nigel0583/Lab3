import javax.swing.*;

public class BicycleDriver {
    public static void main(String[] args) {

        String name, make;
        double value;

        Bicycle bike = new Bicycle();

        name = JOptionPane.showInputDialog("Please enter your name");
        make = JOptionPane.showInputDialog("Please enter the make");
        value = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value"));

        Bicycle bike1 = new Bicycle(name, make, value);

          bike1.setName(JOptionPane.showInputDialog("Please enter your name"));
       bike1.setMake(JOptionPane.showInputDialog("Please enter the make"));
        bike1.setValue(Double.parseDouble(JOptionPane.showInputDialog("Please enter the value")));

        bike.setValue(bike1.getValue()+10);

        JOptionPane.showMessageDialog(null,bike.toString());
        JOptionPane.showMessageDialog(null,bike.getValue());
        JOptionPane.showMessageDialog(null,bike1.toString());



    }
}
