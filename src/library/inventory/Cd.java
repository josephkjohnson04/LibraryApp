package library.inventory;

/**
 * Section 4 - Library App
 *
 * @author Caleb Jenkinson, Kyler Hanson, and Joe Johnson
 * @version 1.0
 * @link https://github.com/josephkjohnson04/app.LibraryApp.git
 */


public class Cd extends Item {

    /**
     * Artists
     */
    private String artist;

    /**
     * inventory.Cd genres
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
     * Recieves title, invDate, artist, and inventory.CdGenre. The setters for artist and genre are called and super passes the
     * title and invDate
     * @param cdGenre
     * @param invDate
     * @param title
     * @param artist
     * @throws Exception
     */
    public Cd(CdGenre cdGenre, String invDate, String title, String artist) throws Exception {
        super(title, invDate);
        this.artist = artist;
        this.cdGenre = cdGenre;
    }

    /**
     * Gets the artists name
     * @return
     */
    // Getters
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

    /**
     * Sets the artists name
     * @param artist
     */
    // Setters
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

    /**
     * Outputs displayItem with updated info from inventory.Cd.java
     */
    // Additional Methods
    @Override
    public void displayItem() {
        super.displayItem();
        System.out.printf("%-16s%-20s", artist, cdGenre);
    }

}
