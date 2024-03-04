package com.java.st1227490test2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Library library = new Library("60 Worsley St, Barrie, ON, L4M 1L6");
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

        launch();
    }
}