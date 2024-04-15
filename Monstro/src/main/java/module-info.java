module com.example.monstro {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.monstro to javafx.fxml;
    exports com.example.monstro;
}