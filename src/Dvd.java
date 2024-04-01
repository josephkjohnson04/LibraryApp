
/**
 * Section 4 - Library App
 *
 * @author Caleb Jenkinson, Kyler Hanson, and Joe Johnson
 * @version 1.0
 * @link https://github.com/josephkjohnson04/LibraryApp.git
 */


public class Dvd extends Item {

    /**
     * Directors
     */
    private String director;

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
     * Recieves title, invDate, director, and DvdGenre. The setters for director and genre are called and super passes
     * the title and invDate
     * @param dvdGenre
     * @param invDate
     * @param title
     * @param director
     * @throws Exception
     */
    public Dvd(DvdGenre dvdGenre, String invDate, String title, String director) throws Exception {
        super(title, invDate);
        this.director = director;
        this.dvdGenre = dvdGenre;
    }

    /**
     * Gets the directors name
     * @return
     */
    // Getters
    public String getDirector() {
        return director;
    }

    /**
     * Gets the Dvd genre
     * @return
     */
    public DvdGenre getDvdGenre() {
        return this.dvdGenre;
    }

    /**
     * Sets the directors name
     * @param director
     */
    // Setters
    public void setDirector(String director) {
        this.director = director;
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
        System.out.printf("%-16s%-20s", director, dvdGenre);
    }

}
