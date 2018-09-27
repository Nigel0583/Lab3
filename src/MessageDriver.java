import javax.swing.*;

public class MessageDriver {
    public static void main(String[] args) {


        Message email = new Message("James O’Donoghue", " Gouch Cooper");
        email.setMessage("Message Here.");


       JOptionPane.showMessageDialog(null,email.toString());

    }
}
