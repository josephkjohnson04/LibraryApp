/**
 * Section 4 - Library App
 *
 * @author Caleb Jenkinson, Kyler Hanson, and Joe Johnson
 * @version 1.0
 * @link https://github.com/josephkjohnson04/LibraryApp.git
 */
public class Book extends Item {

    // instance fields
    private String author;
    private BookGenre bookGenre;

    // overload constructor
    public Book(String title, String invDate) throws Exception {
        super(title, invDate);
    }

    public Book(BookGenre bookGenre, String invDate, String title, String author) throws Exception {
        super(title, invDate);
        this.author = author;
        this.bookGenre = bookGenre;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BookGenre getBookGenre() {
        return this.bookGenre;
    }

    public void setBookGenre(BookGenre bookGenre) {
        this.bookGenre = bookGenre;
    }
}
