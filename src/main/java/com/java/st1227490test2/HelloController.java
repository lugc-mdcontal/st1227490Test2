package com.java.st1227490test2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class HelloController {
    private Library library;
    private int currentBookIndex = 0;

    private ArrayList<Book> getBooks() {
        // Get the books (and filter if needed)
        boolean captureAll = searchCategory.getValue().equals("All");
        ArrayList<Book> books = captureAll ? library.getBooks() : library.getBooksInCategory(searchCategory.getValue());

        return books;
    }

    private void renderBook() {
        // Get the books
        ArrayList<Book> books = getBooks();

        // Make sure it's valid range
        if (currentBookIndex < 0 || currentBookIndex > books.size())
            throw new IllegalArgumentException("The book is in invalid.");

        Book fetchedBook = books.get(currentBookIndex);

        title.setText(fetchedBook.getTitle());
        author.setText(fetchedBook.getAuthor());
        isbn.setText(fetchedBook.getIsbn());
        category.setText(fetchedBook.getCategory());
        price.setText(String.format("%.2f", fetchedBook.getPrice()));
    }

    @FXML
    private Label address;

    @FXML
    private Label author;

    @FXML
    private Label category;

    @FXML
    private Label isbn;

    @FXML
    private Button nextBook;

    @FXML
    private Label numBooks;

    @FXML
    private Label price;

    @FXML
    private Label title;

    @FXML
    private Label valBooks;

    @FXML
    private ComboBox<String> searchCategory;

    @FXML
    void onNextButton(MouseEvent event) {
        // This makes sure we never go over, and just reloops
        currentBookIndex = (++currentBookIndex) % getBooks().size();

        // Render the book
        renderBook();
    }

    @FXML
    public void initialize() {
        library = new Library("60 Worsley St, Barrie, ON, L4M 1L6");
        Book book1 = new Book("Intro to Java","Dan Wright","1234567891011",79.99,"TextBook");
        Book book2 = new Book("The Maid","Nita Prose","9780735245259",24.95,"Fiction");
        Book book3 = new Book("Atomic Habits","James Clear","9780735211292",21.88,"Self Help");
        Book book4 = new Book("Plant You","Carleigh Bodrug","9780306923043",38.00,"CookBook");
        Book book5 = new Book("Five Little Indians","Michelle Good","9781443459181",18.39,"Indigenous");
        Book book6 = new Book("The Christie Affair","Nina De Gramont","9781250282132",38.00,"Romance");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);

        // Add all specifier
        searchCategory.getItems().add("All");

        // Add filtered search
        for (String category : library.getCategories())
            searchCategory.getItems().add(category);

        // Set to all by default
        searchCategory.setValue("All");

        address.setText(address.getText() + library.getAddress());
        numBooks.setText(numBooks.getText() + library.getBooks().size());
        valBooks.setText(valBooks.getText() + String.format("%.2f", library.inventoryValue()));

        renderBook();
    }
}