package library.inventory;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Class that adds the logic and variables for id, title, desc, and invDate. This class is used
 * throughout Book.java, Cd.java, Dvd.java, and LibraryApp.java.
 *
 * @author Caleb Jenkinson, Kyler Hanson, and Joe Johnson
 * @version 1.0
 * @link https://github.com/josephkjohnson04/app.LibraryApp.git
 */

public class Item implements Serializable {

    // Class Fields

    /**
     * The lastId that the id class builds upon for id assignment
     */
    private static int lastId = 0;

    /**
     * DateTimeFormatter used for formatting the dates correctly
     */
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");

    // Instance Fields

    /**
     * Id assigned to all books, cds, or dvds
     */
    private final int id;

    /**
     * The title for books, cds, or dvds
     */
    private String title;

    /**
     * The optional description for books, cds, or dvds
     */
    private String desc;

    /**
     * The inventory date for books, cds, or dvds
     */
    private LocalDate invDate;

    // Overload Constructor

    /**
     * Overload constructor that sets id, title, and inventory date
     * @param title
     * @param invDate
     * @throws Exception
     */
    public Item(String title, String invDate) throws Exception {
        this.id = ++Item.lastId;
        setTitle(title);
        setInvDate(invDate);
    }

    public Item(int id, String title, String invDate) throws Exception {
        this.id = id;
        this.setTitle(title);
        this.setInvDate(invDate);
    }

    // Getters

    /**
     * Gets the data's id
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the user's title
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the user's description
     * @return
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Gets the user's inventory date
     * @return
     */
    public LocalDate getInvDate() {
        return invDate;
    }

    /**
     * Gets and formats the user's inventory date
     * @return
     */
    public String getDateString(){
        return this.invDate.format(Item.formatter);
    }

    // Setters

    /**
     * Sets the user's title
     * @param title
     * @throws Exception
     */
    public void setTitle(String title) throws Exception {
        title = title.trim();
        if (!title.isEmpty()) {
            this.title = title;
        } else {
            throw new Exception("Title can't be empty!");
        }
    }

    /**
     * Sets the user's description
     * @param desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public static void setLastId(int id) {
        Item.lastId = id;
    }

    /**
     * Sets the inventory date and insures the date is correctly entered
     * @param myDate
     * @throws Exception
     */

    public void setInvDate(String myDate) throws Exception {
        try {
            this.invDate = LocalDate.parse(myDate, Item.formatter);
        } catch (Exception e){
            throw new Exception("Invalid date! Must be MM-DD-YYYY");
        }
    }

    // Additional Methods

    /**
     * Returns the id and title
     * @return
     */
    @Override
    public String toString() {
        return id + " " + title;
    }

    /**
     * Returns the id, title, and inventory date in formatting for display
     */
    public void displayItem() {
        System.out.printf("%-4d%-16s%-5s ", id, title, invDate);
    }
}