package library.inventory;

/**
 * This code creates artist and cdGenre and sets them for use in LibraryApp.java.
 *
 * @author Caleb Jenkinson, Kyler Hanson, and Joe Johnson
 * @version 1.0
 * @link https://github.com/josephkjohnson04/app.LibraryApp.git
 */

public class Cd extends Item implements CheckInOut{

    // Instance Fields

    /**
     * Artists
     */
    private String artist;

    /**
     * inventory.Cd genres
     */
    private CdGenre cdGenre;

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
    public Cd(String title, String invDate) throws Exception {
        super(title, invDate);
        this.checkedOut = false;
    }

    /**
     * Recieves title, invDate, artist, and inventory.CdGenre. The setters for artist and genre are called and super passes the
     * title and invDate
     @param title
     * @param invDate
     * @param artist
     * @param cdGenre
     * @throws Exception
     */
    public Cd(String title, String invDate, String artist, CdGenre cdGenre) throws Exception {
        super(title, invDate);
        this.artist = artist;
        this.cdGenre = cdGenre;
        this.checkedOut = false;
    }

    /**
     * Initializes CD with an id, title, inventory date, artist, and genre from a superclass
     * @param id
     * @param title
     * @param invDate
     * @param artist
     * @param cdGenre
     * @throws Exception
     */
    public Cd(int id, String title, String invDate, String artist, CdGenre cdGenre) throws Exception {
        super(id, title, invDate);
        this.artist = artist;
        this.cdGenre = cdGenre;
        this.checkedOut = false;
    }

    // Getters

    /**
     * Gets the artists name
     * @return
     */
    public String getArtist() {
        return artist;
    }

    /**
     * Gets the inventory.Cd genre
     * @return
     */
    public CdGenre getCdGenre() {
        return this.cdGenre;
    }

    // Setters

    /**
     * Sets the artists name
     * @param artist
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     * Sets the inventory.Cd genre
     * @param cdGenre
     */
    public void setCdGenre(CdGenre cdGenre) {
        this.cdGenre = cdGenre;
    }

    // Additional Methods

    @Override
    public void checkOut() {
        checkedOut = true;
    }

    @Override
    public void checkIn() {
        checkedOut = false;
    }

    @Override
    public String isCheckedOut() {
        return checkedOut ? "Yes" : "No";
    }

    /**
     * Outputs displayItem with updated info from inventory.Cd.java
     */
    @Override
    public void displayItem() {
        System.out.printf("%-4d%-16s%-5s ", id, title, getDateString());
        System.out.printf("%-16s%-11s%-5s ", artist, cdGenre, isCheckedOut());
    }

}