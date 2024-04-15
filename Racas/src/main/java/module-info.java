module com.example.racas {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.racas to javafx.fxml;
    exports com.example.racas;
}