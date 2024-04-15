module com.example.magias {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.magias to javafx.fxml;
    exports com.example.magias;
}