import javax.swing.*;
import java.awt.*;

public class BookInput {

    public static void main(String[] args) {

        Book likeBook = new Book();
        Book dislikeBook = new Book();

        JTextField titleField = new JTextField(6);
        JTextField pagesField = new JTextField(6);
        JTextField isbnField = new JTextField(6);
        JTextField priceField = new JTextField(4);

        JPanel bookPanel = new JPanel(new GridLayout(4, 1));
        bookPanel.add(new JLabel("Title:"));
        bookPanel.add(titleField);
        bookPanel.add(new JLabel("Pages:"));
        bookPanel.add(pagesField);
        bookPanel.add(new JLabel("ISBN:"));
        bookPanel.add(isbnField);
        bookPanel.add(new JLabel("Price:"));
        bookPanel.add(priceField);


        int bookInput = JOptionPane.showConfirmDialog(null, bookPanel,
                "Favourite book", JOptionPane.OK_CANCEL_OPTION);
        String title = titleField.getText();
        likeBook.setTitle(title);

        String numpages1 = pagesField.getText();
        int numpages = Integer.parseInt(numpages1);
        likeBook.setNumPages(numpages);

        String isbn = isbnField.getText();
        likeBook.setIsbn(isbn);

        String price1 = priceField.getText();
        double price = Double.parseDouble(price1);
        likeBook.setPrice(price);


        JTextField titleField2 = new JTextField(6);
        JTextField pagesField2 = new JTextField(6);
        JTextField isbnField2 = new JTextField(6);
        JTextField priceField2 = new JTextField(4);

        JPanel bookPanel2 = new JPanel(new GridLayout(4, 1));
        bookPanel2.add(new JLabel("Title:"));
        bookPanel2.add(titleField2);
        bookPanel2.add(new JLabel("Pages:"));
        bookPanel2.add(pagesField2);
        bookPanel2.add(new JLabel("ISBN:"));
        bookPanel2.add(isbnField2);
        bookPanel2.add(new JLabel("Price:"));
        bookPanel2.add(priceField2);

        int bookInput2 = JOptionPane.showConfirmDialog(null, bookPanel2,
                "Least favourite", JOptionPane.OK_CANCEL_OPTION);

        String title1 = titleField2.getText();
        dislikeBook.setTitle(title1);

        String numpages2 = pagesField2.getText();
        int numpages3 = Integer.parseInt(numpages2);
        dislikeBook.setNumPages(numpages3);

        String isbn1 = isbnField2.getText();
        dislikeBook.setIsbn(isbn1);

        String price2 = priceField2.getText();
        double price3 = Double.parseDouble(price2);
        dislikeBook.setPrice(price3);

        if (bookInput == JOptionPane.OK_OPTION && bookInput2 == JOptionPane.OK_OPTION) {
            JTextArea textArea = new JTextArea();

            textArea.setText(String.format( "%-20s %10s  \n\n %-20s %10s ","Favourite book",
                     dislikeBook.BooktoString(), "Least Favourite",likeBook.BooktoString()));

            JOptionPane.showMessageDialog(null, textArea);
        }
    }
}
