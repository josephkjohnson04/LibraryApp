
/**
 * Section 4 - Library App
 *
 * @author Caleb Jenkinson, Kyler Hanson, and Joe Johnson
 * @version 1.0
 * @link https://github.com/josephkjohnson04/LibraryApp.git
 */


public class Dvd extends Item {

    /**
     * Authors
     */
    private String author;

    /**
     * Dvd genres
     */
    private DvdGenre dvdGenre;

    // Overload Constructors

    /**
     * Recieves title and invDate, calls super passing it the title and invDate
     * @param title
     * @param invDate
     * @throws Exception
     */
    public Dvd(String title, String invDate) throws Exception {
        super(title, invDate);
    }

    /**
     * Recieves title, invDate, author, and DvdGenre. The setters for author and genre are called and super passes the
     * title and invDate
     * @param dvdGenre
     * @param invDate
     * @param title
     * @param author
     * @throws Exception
     */
    public Dvd(DvdGenre dvdGenre, String invDate, String title, String author) throws Exception {
        super(title, invDate);
        this.author = author;
        this.dvdGenre = dvdGenre;
    }

    /**
     * Gets the authors name
     * @return
     */
    // Getters
    public String getAuthor() {
        return author;
    }

    /**
     * Gets the Dvd genre
     * @return
     */
    public DvdGenre getDvdGenre() {
        return this.dvdGenre;
    }

    /**
     * Sets the authors name
     * @param author
     */
    // Setters
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Sets the Dvd genre
     * @param dvdGenre
     */
    public void setDvdGenre(DvdGenre dvdGenre) {
        this.dvdGenre = dvdGenre;
    }

    /**
     * Outputs displayItem with updated info from Dvd.java
     */
    // Additional Methods
    @Override
    public void displayItem() {
        super.displayItem();
        System.out.printf("%-25s%-20s", author, dvdGenre);
    }

}
