# Library App
## Written by: Caleb Jenkinson, Kyler Hanson, and Joe Johnson

<b>Table of Content</b>
- [Summary](#summary)
- [How it Works](#how-it-works)
- [Menu Choices](#menu-choices)
  - [Exit](#exit)
  - [Add Item](#add-item)
  - [Delete Item](#delete-item)
  - [Display Inventory](#display-inventory)
  - [Save Inventory](#save-inventory)
  - [Load Inventory](#load-inventory)
  - [Check In Item](#check-in-item)
  - [Check Out Item](#check-out-item)
- [Programming Concepts Used](#programming-concepts)

## Summary
This program is a library where you can add or remove items from it. The different items that you can add to the library are books, cds, and dvds.
Each of the items have their own genres to separate them. Also inside of the menu you can display all of the items that are inside of the library. 
The program also has options in the menu where you are able to save and load from a file. The program now allows users to check out books, cds, or
dvds as well as be able to check them back in.

## How it works
This program is run using a main menu.
<pre>
 ==========================================================
Welcome to the Library App
==========================================================
---------------------------------------------------------
Main Menu
---------------------------------------------------------
0 = Exit
1 = Add Inventory Item
2 = Delete Inventory Item
3 = Display Inventory
4 = Save Inventory
5 = Load Inventory
6 = Check In Item
7 = Check Out Item
---------------------------------------------------------
Menu Choice: 
</pre>

## Menu choices
### Exit
Exits the main menu and ends the program.
<pre>
---------------------------------------------------------
Menu Choice: 0
---------------------------------------------------------

Process finished with exit code 0
</pre>

### Add item
Asks the user to input the title, date, and description of the Item. It then asks whether the item is a book, cd, or dvd. Depending on the type of
item chosen it will then ask for the author, artist, or director. Finally the add item will ask for the item  type's genre. Add item ends by 
displaying if the item was successfully added to the inventory and has a press enter to continue.
<pre>
 ---------------------------------------------------------
Menu Choice: 1
---------------------------------------------------------
Add Inventory
---------------------------------------------------------
Please enter the following inventory information:
Title: Title
Date Received (MM-DD-YYYY): 04-17-2024
Description or press enter to continue: Description
Type 1=Book, 2=CD, 3=DVD: 1
Author: Author
Genre 1=Children, 2=Fiction, 3=Nonfiction, 4=Mystery, 5=Scifi, 6=Romance: 2
Successful Add: 1 Title
Press enter to continue...
</pre>

### Delete item
Delete item asks which inventory item you would like to delete. The user will input the inventory id number to choose which item to delete. Delete 
item ends by displaying if the item was successfully deleted from the inventory and has a press enter to continue.
<pre>
 ---------------------------------------------------------
Menu Choice: 2
---------------------------------------------------------
Delete Inventory
---------------------------------------------------------
Please enter the inventory id: 1
1
Successful Delete: 1 Title
Press enter to continue...
</pre>

### Display inventory
Display inventory breaks the items into thier three types and displays everything about the item. 
<pre>
---------------------------------------------------------
Menu Choice: 3
---------------------------------------------------------

Book Inventory
---------------------------------------------------------
ID  Title           Date Rec'd Author          Genre      Checked Out?
--- --------------- ---------- --------------- ---------- ------------
1   Title           04-17-2024 Author          Mystery    No    

Cd Inventory
---------------------------------------------------------
ID  Title           Date Rec'd Artist          Genre      Checked Out?
--- --------------- ---------- --------------- ---------- ------------
2   Title           04-17-2024 Artist          Country    No    

Dvd Inventory
---------------------------------------------------------
ID  Title           Date Rec'd Director        Genre      Checked Out?
--- --------------- ---------- --------------- ---------- ------------
3   Title           04-17-2024 Director        Comedy     No            
Press enter to continue...
</pre>

### Save inventory
Saves the current inventory to file.
<pre>
---------------------------------------------------------
Menu Choice: 4
---------------------------------------------------------
Saving Game...
</pre>

### Load inventory
Loads the inventory from the file.
<pre>
---------------------------------------------------------
Menu Choice: 5
---------------------------------------------------------
Loading Game...
</pre>

### Check In Item
Checks an item back into inventory so that it can be checked out again.
<pre>
---------------------------------------------------------
Menu Choice: 6
---------------------------------------------------------
Please enter item ID to check in: 1
Checked in: 1 Title

Book Inventory
---------------------------------------------------------
ID  Title           Date Rec'd Author          Genre      Checked Out?
--- --------------- ---------- --------------- ---------- ------------
1   Title           04-17-2024 Author          Children   No
</pre>

### Check Out Item
Checks an out an item out of inventory.
<pre>
---------------------------------------------------------
Menu Choice: 7
---------------------------------------------------------
Please enter item ID to check out: 1
Checked out: 1 Title

Book Inventory
---------------------------------------------------------
ID  Title           Date Rec'd Author          Genre      Checked Out?
--- --------------- ---------- --------------- ---------- ------------
1   Title           04-17-2024 Author          Children   Yes
</pre>

## Programming concepts
**What was Learned**
  * Inheritance
  * With inheritance working with Super() and extends
  * Working with Date & Time API
  * Working with File IO
  * Working with packages
  * Working with Enums
  * Using multiple overload constructors.
  * Abstraction
  * Ternary Operators
  * Interfaces
  * Working with ChatGPT


[Back to Top](#library-app)
