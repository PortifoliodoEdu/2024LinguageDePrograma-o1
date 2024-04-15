package com.example.racas;

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

    private Racas dragao;

    @FXML
    private void gerarFrase(ActionEvent event) {
        String especie = especieTextField.getText();
        String cor = corTextField.getText();
        String tamanho = tamanhoTextField.getText();
        String classe = classeTextField.getText();

        String frase = "O " + especie + " é uma raça da cor " + cor + ", de " + tamanho + " e da classe " + classe;
        fraseLabel.setText(frase);

        Image imagem = new Image(getClass().getResourceAsStream("/Raçaswallpaper.jpg"));
        imageView.setImage(imagem);
    }
}

