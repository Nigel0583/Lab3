public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("TitleHere", 15 , "123ISBN", 0);
        book1.setTitle("Book1");
        book1.setPrice(24);
        book1.setIsbn("321ISBNWF3");
        book1.setNumPages(234);
        int numPages = book2.getNumPages();
        System.out.print(book1.getTitle() + "\n" + book1.getIsbn() +"\n"+ book1.getPrice() +"\n" + book1.getNumPages() +"\n\n");
        System.out.print(book2.getTitle() + "\n\n");
        System.out.print(book1.toString());



    }
}
