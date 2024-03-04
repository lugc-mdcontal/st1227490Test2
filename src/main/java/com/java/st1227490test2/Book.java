package com.java.st1227490test2;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private String category;
    private double price;

    public String getTitle() { return title; }
    public void setTitle(String newTitle) {
        // Ensure the string is correct length
        if (newTitle.length() < 4)
            throw new IllegalArgumentException("The title needs to be at least four characters in length.");

        // Clean up the title string
        newTitle = newTitle.trim();

        // Set the title in this class
        title = newTitle;
    }

    public String getAuthor() { return author; }
    public void setAuthor(String newAuthor) {
        // Ensure the string is correct length
        if (newAuthor.length() < 2)
            throw new IllegalArgumentException("The title needs to be at least four characters in length.");

        // Clean up the title string
        newAuthor = newAuthor.trim();

        // Set the title in this class
        author = newAuthor;
    }
}
