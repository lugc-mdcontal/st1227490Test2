module com.java.st1227490test2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.java.st1227490test2 to javafx.fxml;
    exports com.java.st1227490test2;
}