package library.app;

//package library.app;

// import library.inventory.inventory.Book;
// import library.inventory.inventory.BookGenre;
// import library.inventory.inventory.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Library App that allows adding, deleting, displaying, saving, and loading
 inventory for Books, CDs, and DVDs.
 * <a href="PUT_YOUR_URL_HERE">GitHub Repository URL</a>
 *
 * @author PUT_YOUR_NAMES_HERE
 * @since PUT_THE_CURRENT_DATE_HERE
 * @version 1.0 beta
 *
 */

public class LibraryApp {
    /**
     * Standard double dash line.
     */
    private final static String DOUBLE_LINE =
            "==========================================================";
    /**
     * Standard single dash line.
     */
    private final static String SINGLE_LINE =
            "---------------------------------------------------------";
    /**
     * List to store all types of inventory items (inventory.Book, inventory.Cd, inventory.Dvd).
     */
    private List<Item> inventory;
    /**
     * Default constructor instantiates the ArrayList for storing items.
     */
    public LibraryApp(){
        this.inventory = new ArrayList<Item>();
    } // end of constructor
    /**
     * Display the program's title.
     */
    private void displayAppHeading() {
        System.out.println(DOUBLE_LINE);
        System.out.println("Welcome to the Library App");
        System.out.println(DOUBLE_LINE);
    } // end of displayAppHeading method
    /**
     * Allows the user to enter an inventory id to be deleted.
     */
    private void deleteItem(){
        int id = 0;
        System.out.println("Delete Inventory");
        System.out.println(SINGLE_LINE);
        id = Input.getInt("Please enter the inventory id: ");
        for (Item item : inventory){
            System.out.println(id);
            if (item.getId() == id){
                inventory.remove(item);
                System.out.println("Successful Delete: " + item);
                Input.getLine("Press enter to continue...");
                return;
            }
        }
        System.out.println("ERROR: Inventory ID:" + id + " NOT found!");
    } // end of deleteItem method

    /**
     * Add a book to the Library's inventory. Allows the user to enter the book's
     author and genre.
     *
     * @param title The item's title.
     * @param dateReceived The item's date received into inventory.
     * @param description The item's description which is not a required field.
     * @return The newly created book.
     * @throws Exception Any exception thrown to addBook will be back to the
    calling method.
     */
    private Book addBook(String title, String dateReceived, String description) throws Exception {
        Book book;
        int userInput = 0;
        String author = null;
        BookGenre genre = null;
        author = Input.getString("Author: ");
        try {
            userInput = Input.getIntRange("Genre 1=Children, 2=Fiction, 3=Nonfiction, 4=Mystery, 5=Scifi," +
                    " 6=Romance: ", 1, 6);
                    genre = BookGenre.values()[userInput - 1];
        } catch (Exception e){
            throw new Exception("Invalid data! inventory.Book Genre = " + genre);
        }
        book = new Book(genre, dateReceived, author, title);
        book.setDesc(description);
        return book;
    } // end of addBook method

    /**
     * Add a cd to the Library's inventory. Allows the user to enter the cd's
     artist and genre.
     *
     * @param title The item's title.
     * @param dateReceived The item's date received into inventory.
     * @param description The item's description which is not a required field.
     * @return The newly created cd.
     * @throws Exception Any exception thrown to addcd will be back to the
    calling method.
     */
    private Cd addCd(String title, String dateReceived, String description) throws Exception {
        Cd cd;
        int userInput = 0;
        String artist = null;
        CdGenre genre = null;
        artist = Input.getString("Artist: ");
        try {
            userInput = Input.getIntRange("Genre 1=Classical, 2=Country, 3=Jazz, 4=Rock, 5=Rap, 6=Pop: ",
                    1, 6);
            genre = CdGenre.values()[userInput - 1];
        } catch (Exception e){
            throw new Exception("Invalid data! inventory.Cd Genre = " + genre);
        }
        cd = new Cd(genre, dateReceived, artist, title);
        cd.setDesc(description);
        return cd;
    } // end of addCd method

    /**
     * Add a dvd to the Library's inventory. Allows the user to enter the dvd's
     director and genre.
     *
     * @param title The item's title.
     * @param dateReceived The item's date received into inventory.
     * @param description The item's description which is not a required field.
     * @return The newly created dvd.
     * @throws Exception Any exception thrown to adddvd will be back to the
    calling method.
     */
    private Dvd addDvd(String title, String dateReceived, String description) throws Exception {
        Dvd dvd;
        int userInput = 0;
        String director = null;
        DvdGenre genre = null;
        director = Input.getString("Director: ");
        try {
            userInput = Input.getIntRange("Genre 1=Action, 2=Horror, 3=Romance, 4=Drama, 5=Scifi, 6=Comedy: ",
                    1, 6);
            genre = DvdGenre.values()[userInput - 1];
        } catch (Exception e){
            throw new Exception("Invalid data! inventory.Dvd Genre = " + genre);
        }
        dvd = new Dvd(genre, dateReceived, director, title);
        dvd.setDesc(description);
        return dvd;
    } // end of addDvd method

    /**
     * Add an item to inventory. Allow's the user to enter the item's title,
     description,
     * date received into inventory and then will call the appropriate item's type
     (inventory.Book, CD, DVD) for additional
     * user's input.
     * @throws Exception All exceptions will be thrown back to the main menu for
    handling.
     */
    private void addItem() throws Exception {
        String title = null;
        String description = null;
        String dateReceived = null;
        int inventoryType = 0;
        System.out.println("Add Inventory");
        System.out.println(SINGLE_LINE);
        System.out.println("Please enter the following inventory information:");
        title = Input.getString("Title: ");
        dateReceived = Input.getDate("Date Received (MM-DD-YYYY): ");
        description = Input.getLine("Description or press enter to continue: ");
        inventoryType = Input.getIntRange("Type 1=inventory.Book, 2=CD, 3=DVD: ", 1, 3);
        switch(inventoryType){
            case 1:
                Book book = addBook(title, dateReceived, description);
                inventory.add(book);
                System.out.println("Successful Add: " + book);
                Input.getLine("Press enter to continue...");
                break;
            case 2:
                Cd cd = addCd(title, dateReceived, description);
                inventory.add(cd);
                System.out.println("Successful Add: " + cd);
                Input.getLine("Press enter to continue...");
                break;
            case 3:
                Dvd dvd = addDvd(title, dateReceived, description);
                inventory.add(dvd);
                System.out.println("Successful Add: " + dvd);
                Input.getLine("Press enter to continue...");
                break;
            default:
                throw new Exception("Invalid app.Input! Inventory Type = " +
                        inventoryType);
        } // end of switch
    } // end of addItem method

    /**
     * Display the Library's inventory's detail group by inventory type.
     */
    private void displayInventory(){
        System.out.println("inventory.Book Inventory");
        System.out.println(SINGLE_LINE);
        System.out.println("ID  Title           Date Rec'd Author          Genre");
        System.out.println("--- --------------- ---------- --------------- ----------");
        for (Item item : inventory) {
            if (item instanceof Book){
                item.displayItem();
            }
        }

        System.out.println("\ninventory.Cd Inventory");
        System.out.println(SINGLE_LINE);
        System.out.println("ID  Title           Date Rec'd Artist          Genre");
        System.out.println("--- --------------- ---------- --------------- ----------");
        for (Item item : inventory) {
            if (item instanceof Cd){
                item.displayItem();
            }
        }

        System.out.println("\ninventory.Dvd Inventory");
        System.out.println(SINGLE_LINE);
        System.out.println("ID  Title           Date Rec'd Director        Genre");
        System.out.println("--- --------------- ---------- --------------- ----------");
        for (Item item : inventory) {
            if (item instanceof Dvd){
                item.displayItem();
            }
        }
        System.out.println();
//TO-DO: ADD LOGIC FOR DISPLAYING OTHER INVENTORY TYPES
        Input.getLine("Press enter to continue...");
    } // end of displayInventory

    /**
     * The main menu that allows the user to add, delete, display, load, and save
     inventory.
     * @throws Exception All exceptions will be displayed or thrown back to the
    main method.
     */
    private void mainMenu() throws Exception {
        boolean keepRunning = true;
        int userInput = 0;
        while (keepRunning) {
            System.out.println(SINGLE_LINE);
            System.out.println("Main Menu");
            System.out.println(SINGLE_LINE);
            System.out.println("0 = End Game");
            System.out.println("1 = Add inventory.Item");
            System.out.println("2 = Delete inventory.Item");
            System.out.println("3 = Display Inventory");
            System.out.println("4 = Save Inventory");
            System.out.println("5 = Load Inventory");
            System.out.println(SINGLE_LINE);
            userInput = Input.getIntRange("Menu Choice: ", 0, 6);
            System.out.println(SINGLE_LINE);
            switch (userInput) {
                case 0:
                    keepRunning = false;
                    break;
                case 1:
                    try {
                        this.addItem();
                    } catch (Exception e){
                        System.out.println(e.getMessage());
                        Input.getLine("Press enter to continue...");
                    }
                    break;
                case 2:
                    try {
                        this.deleteItem();
                    } catch (Exception e){
                        System.out.println(e.getMessage());
                        Input.getLine("Press enter to continue...");
                    }
                    break;
                case 3:
                    displayInventory();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    throw new Exception("Invalid menu choice: " + userInput);
            } // end of switch
        } // end of while loop
    } // end of mainMenu
    /**
     * Main method to keep the Library App running
     * @param args Not used
     * @throws Exception Any type of exceptions thrown back to main will be
    displayed and end the program.
     */
    public static void main(String[] args) throws Exception {
        LibraryApp app = new LibraryApp();
        app.displayAppHeading();
        try {
            app.mainMenu();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Sorry but this program ended with an error. Please contact support!");
        }
        Input.sc.close();
    } // end of main method
} // end of app.LibraryApp class