import javax.swing.*;

public class VendingMachineDriver {
    public static void main(String[] args) {

        VendingMachine vending = new VendingMachine();
        vending.fillMachine(38);

          int c = Integer.parseInt(JOptionPane.showInputDialog("How many cans?"));
          
        for (int i=0; i<c; i++){
            vending.buyCan();
        }

        System.out.println(vending.toString());




    }
}
