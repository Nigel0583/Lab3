
public class Book {
    private String title;
    private int numPages;
    private String isbn;
    private double price;


    public String getTitle() {
        return title;
    }

    public String getIsbn(){
        return isbn;
    }

    public double getPrice(){
        return price;
    }

    public int getNumPages() {
        return numPages;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public Book(){
      this.title = "No Title";
      this.numPages = 0;
      this.isbn = "No ISBN";
      this.price = 0;
    }

    public String BooktoString(){
        return "Title" +title+ "\nPages" +numPages+ "\nISBN" +isbn+ "\nPrice" +price;
    }

    public Book(String title, int numPages, String isbn, double price){
        setTitle(title);
        setNumPages(numPages);
        setIsbn(isbn);
        setPrice(price);
    }
}