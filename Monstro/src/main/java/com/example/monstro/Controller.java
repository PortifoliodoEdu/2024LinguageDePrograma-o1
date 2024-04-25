package com.example.monstro;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class Controller {

    @FXML
    private TextField especieTextField;

    @FXML
    private TextField corTextField;

    @FXML
    private TextField tamanhoTextField;

    @FXML
    private TextField classeTextField;

    @FXML
    private Text fraseText;

    @FXML
    private Label fraseLabel;

    @FXML
    private ImageView imageView;

    private Monstro monstro;

    @FXML
    private void gerarFrase(ActionEvent event) {
        String especie = especieTextField.getText();
        String cor = corTextField.getText();
        String tamanho = tamanhoTextField.getText();
        String classe = classeTextField.getText();

        String frase = "O " + especie + " é um monstro da cor " + cor + ", de tamanho " + tamanho + " e da classe de perigo" + classe;
        fraseLabel.setText(frase);

        Image imagem = new Image(getClass().getResourceAsStream("/Monstroswallpaper.jpg"));
        imageView.setImage(imagem);
    }
}

