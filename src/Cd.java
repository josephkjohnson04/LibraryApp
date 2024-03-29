/**
 * Section 4 - Library App
 *
 * @author Caleb Jenkinson, Kyler Hanson, and Joe Johnson
 * @version 1.0
 * @link https://github.com/josephkjohnson04/LibraryApp.git
 */


public class Cd extends Item {

    /**
     * Authors
     */
    private String author;

    /**
     * Cd genres
     */
    private CdGenre cdGenre;

    // Overload Constructors

    /**
     * Recieves title and invDate, calls super passing it the title and invDate
     * @param title
     * @param invDate
     * @throws Exception
     */
    public Cd(String title, String invDate) throws Exception {
        super(title, invDate);
    }

    /**
     * Recieves title, invDate, author, and CdGenre. The setters for author and genre are called and super passes the
     * title and invDate
     * @param cdGenre
     * @param invDate
     * @param title
     * @param author
     * @throws Exception
     */
    public Cd(CdGenre cdGenre, String invDate, String title, String author) throws Exception {
        super(title, invDate);
        this.author = author;
        this.cdGenre = cdGenre;
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
     * Gets the Cd genre
     * @return
     */
    public CdGenre getCdGenre() {
        return this.cdGenre;
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
     * Sets the Cd genre
     * @param cdGenre
     */
    public void setCdGenre(CdGenre cdGenre) {
        this.cdGenre = cdGenre;
    }

    /**
     * Outputs displayItem with updated info from Cd.java
     */
    // Additional Methods
    @Override
    public void displayItem() {
        super.displayItem();
        System.out.printf("%-25s%-20s", author, cdGenre);
    }

}
