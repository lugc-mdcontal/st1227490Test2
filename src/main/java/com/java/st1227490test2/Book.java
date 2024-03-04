package com.java.st1227490test2;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private final List<String> validCategories = List.of(
            "Mystery", "Thriller", "Horror",
            "Historical", "Romance", "Western",
            "Fantasy", "TextBook", "CookBook",
            "Self Help", "Fiction", "Indigenous"
    );

    private String title;
    private String author;
    private String isbn;
    private String category;
    private double price;

    public String getTitle() { return title; }
    public void setTitle(String newTitle) {
        // Clean up the title string
        newTitle = newTitle.trim();


        // Ensure the string is correct length
        if (newTitle.length() < 4)
            throw new IllegalArgumentException("The title needs to be at least four characters in length.");

        // Set the title
        title = newTitle;
    }

    public String getAuthor() { return author; }
    public void setAuthor(String newAuthor) {
        // Clean up the title string
        newAuthor = newAuthor.trim();

        // Ensure the string is correct length
        if (newAuthor.length() < 2)
            throw new IllegalArgumentException("The title needs to be at least four characters in length.");

        // Set the author
        author = newAuthor;
    }

    public String getIsbn() { return isbn; };
    public void setIsbn(String newIsbn) {
        // Ensure that they're all number digits, and correct length, using one regex statement
        if (!newIsbn.matches("\\d{13}"))
            throw new IllegalArgumentException("The isbn needs to be 13 digits in length.");

        // Set the new isbn
        isbn = newIsbn;
    }

    public String getCategory() { return category; }
    public void setCategory(String newCategory) {
        // Check if the category is correct
        if (!validCategories.contains(newCategory))
            throw new IllegalArgumentException("The category is not a valid category.");

        // Set the new category
        category = newCategory;
    }

    public double getPrice() { return price; }
    public void setPrice(double newPrice) {
        // Check if the price is within 0-2000 range
        if (price < 0 || price > 2000)
            throw new IllegalArgumentException("The price must be within 0-2000 range.");

        // Set the new price
        price = newPrice;
    }

    public Book(String title, String author, String isbn, String category, double price) {
        setTitle(title);
        setAuthor(author);
        setIsbn(isbn);
        setCategory(category);
        setPrice(price);
    }
}
