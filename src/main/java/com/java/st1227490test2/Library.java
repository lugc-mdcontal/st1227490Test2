package com.java.st1227490test2;

import java.util.ArrayList;

public class Library {
    private String address;
    private ArrayList<Book> books;

    public String getAddress() { return address; };
    public void setAddress(String newAddress) {
        // Clean up the address
        newAddress = newAddress.trim();

        // Ensure that the new address is valid in length
        if (newAddress.length() < 10)
            throw new IllegalArgumentException("The addresss must be 10 characters in length.");

        // Set the new address
        address = newAddress;
    }

    public ArrayList<Book> getBooks() { return books; }
    public void addBook(Book newBook) {
        // Append the new book
        books.add(newBook);
    }

    public double inventoryValue() {
        double totalPrice = 0;

        // Sum up the total price of all books
        for (Book book : books)
            totalPrice += book.getPrice();

        return totalPrice;
    }

    public Library(String address, ArrayList<Book> books) {
        // Initialize the class
        books = new ArrayList<Book>();
    }
}