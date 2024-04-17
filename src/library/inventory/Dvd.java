package library.inventory;

/**
 * This code creates director and dvdGenre and sets them for use in LibraryApp.java.
 *
 * @author Caleb Jenkinson, Kyler Hanson, and Joe Johnson
 * @version 1.0
 * @link https://github.com/josephkjohnson04/app.LibraryApp.git
 */

public class Dvd extends Item {

    // Instance Fields

    /**
     * Directors
     */
    private String director;

    /**
     * inventory.Dvd genres
     */
    private DvdGenre dvdGenre;

    /**
     * Yes or no if book is checked out
     */
    private boolean checkedOut;

    // Overload Constructors

    /**
     * Recieves title and invDate, calls super passing it the title and invDate
     * @param title
     * @param invDate
     * @throws Exception
     */
    public Dvd(String title, String invDate) throws Exception {
        super(title, invDate);
        this.checkedOut = false;
    }

    /**
     * Recieves title, invDate, director, and inventory.DvdGenre. The setters for director and genre are called and super passes
     * the title and invDate
     * @param title
     * @param invDate
     * @param director
     * @param dvdGenre
     * @throws Exception
     */
    public Dvd(String title, String invDate, String director, DvdGenre dvdGenre) throws Exception {
        super(title, invDate);
        this.director = director;
        this.dvdGenre = dvdGenre;
        this.checkedOut = false;
    }

    /**
     * Initializes DVD with an id, title, inventory date, director, and genre from a superclass
     * @param id
     * @param title
     * @param invDate
     * @param director
     * @param dvdGenre
     * @throws Exception
     */
    public Dvd(int id, String title, String invDate, String director, DvdGenre dvdGenre) throws Exception {
        super(id, title, invDate);
        this.director = director;
        this.dvdGenre = dvdGenre;
        this.checkedOut = false;
    }

    // Getters

    /**
     * Gets the directors name
     * @return
     */
    public String getDirector() {
        return director;
    }

    /**
     * Gets the inventory.Dvd genre
     * @return
     */
    public DvdGenre getDvdGenre() {
        return this.dvdGenre;
    }

    // Setters

    /**
     * Sets the directors name
     * @param director
     */
    public void setDirector(String director) {
        this.director = director;
    }

    /**
     * Sets the inventory.Dvd genre
     * @param dvdGenre
     */
    public void setDvdGenre(DvdGenre dvdGenre) {
        this.dvdGenre = dvdGenre;
    }

    // Additional Methods

    @Override
    public void checkedOut() {
        checkedOut = true;
    }

    @Override
    public void checkedIn() {
        checkedOut = false;
    }

    @Override
    public String getIsCheckedOut() {
        return checkedOut ? "Yes" : "No";
    }

    /**
     * Outputs displayItem with updated info from inventory.Dvd.java
     */
    @Override
    public void displayItem() {
        System.out.printf("%-4d%-16s%-5s ", id, title, getDateString());
        System.out.printf("%-16s%-11s%-5s ", director, dvdGenre, getIsCheckedOut());
    }

}