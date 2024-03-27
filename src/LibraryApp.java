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
            Item item1 = new Item("Book1", "03-26-2024");
            System.out.println("toString: " + item1.toString());
            System.out.println("displayItem: ");
            item1.displayItem();
            item1.setDesc("Description");
            System.out.println("ID: " + item1.getId());
            System.out.println("Title: " + item1.getTitle());
            System.out.println("Description: " + item1.getDesc());
            System.out.println("Date: " + item1.getDateString());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}