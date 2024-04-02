package library.inventory; /**

 * Section 4 - Library App
 *
 * @author Caleb Jenkinson, Kyler Hanson, and Joe Johnson
 * @version 1.0
 * @link https://github.com/josephkjohnson04/app.LibraryApp.git
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Item {
    // Class Fields
    private static int lastId = 0;
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");

    // Instance Fields
    private final int id;
    private String title;
    private String desc;
    private LocalDate invDate;

    // Overload Constructor
    public Item(String title, String invDate) throws Exception {
        this.id = ++Item.lastId;
        setTitle(title);
        setInvDate(invDate);
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public LocalDate getInvDate() {
        return invDate;
    }

    public String getDateString(){
        return this.invDate.format(Item.formatter);
    }

    // Setters
    public void setTitle(String title) throws Exception {
        title = title.trim();
        if (!title.isEmpty()) {
            this.title = title;
        } else {
            throw new Exception("Title can't be empty!");
        }
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setInvDate(String myDate) throws Exception {
        try {
            this.invDate = LocalDate.parse(myDate, Item.formatter);
        } catch (Exception e){
            throw new Exception("Invalid date! Must be MM-DD-YYYY");
        }
    }

    // Additional Methods
    @Override
    public String toString() {
        return id + " " + title;
    }

    public void displayItem() {
        System.out.printf("%-4d%-16s%-5s ", id, title, invDate);
    }
}