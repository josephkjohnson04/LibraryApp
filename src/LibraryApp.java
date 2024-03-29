/**
 * Section 4 - Library App
 *
 * @author Caleb Jenkinson, Kyler Hanson, and Joe Johnson
 * @version 1.0
 * @link https://github.com/josephkjohnson04/LibraryApp.git
 */

public class LibraryApp {
    public static void main(String[] args) throws Exception {
        try {
            // testing for Item.java
            //Item item1 = new Item("Book", "03-26-2024");
            //System.out.println("toString: " + item1.toString());
            //System.out.println("displayItem: ");
            //item1.displayItem();
            //item1.setDesc("Description");
            //System.out.println("ID: " + item1.getId());
            //System.out.println("Title: " + item1.getTitle());
            //System.out.println("Description: " + item1.getDesc());
            //System.out.println("Date: " + item1.getDateString());

            // testing for book
            Book book1 = new Book(BookGenre.Fiction, "03-28-2024", "Book1", "Bob");
            System.out.println("Book genre: " + book1.getBookGenre());
            System.out.println("Date: " + book1.getInvDate());
            System.out.println("Title: " + book1.getTitle());
            System.out.println("Author: " + book1.getAuthor());
            book1.displayItem();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}