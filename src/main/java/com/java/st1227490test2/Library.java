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

    public Library(String address, ArrayList<Book> books) {
        books = new ArrayList<Book>();
    }
}