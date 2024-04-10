# Library App
## Written by: Caleb Jenkinson, Kyler Hanson, and Joe Johnson

<b>Table of Content</b>
- [Summary](#summary)

- [How it Works](#how-it-works)
- [Programming Concepts used](#programming-concepts)

## Summary
The LibraryApp allows users to store data into three main categories, Books, CDs, and DVDs. The user is prompted with an interface where they can add, delete, display, save, and load the data they enter. Users enter the title, date recorded, an optional description,
author (artist or director), and the genre of media they enter. The LibraryApp is an easy way to store, retrieve, and alter data into these simple categories.

## How it works
The code uses a base class called Item.java to manage ID, title, inventory date, and an optional description. It has three derived classes (Book.java, Cd.java, and Dvd. java) with unique fields for each specific class the user wants to manipulate. Each of these derived 
classes has an enum associated with them for the genre of media they can use. Packages are used to sort these classes into a singular package which is easier to access and edit. LibraryApp.java handles adding, removing, updating, displaying, saving, and loading this data. 
Input.java is used to gather the user's inputs. LibraryApp.java and Input.java are part of another, separate package which makes the code easier to digest. 

## Programming concepts
**What was Learned**
  * Inheritance
  * With inheritance working with Super() and extends
  * Working with Date & Time API
  * Working with Enums
  * Using multiple overload constructors.


[Back to Top](#hot-cold-game)
