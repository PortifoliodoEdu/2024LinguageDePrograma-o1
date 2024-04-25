package com.example.magias;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class Controller {

    @FXML
    private TextField nomeDaMagiaTextField;

    @FXML
    private TextField duracaoTextField;

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

    private Magias magia;

    @FXML
    private void gerarFrase(ActionEvent event) {
        String nomeDaMagia = nomeDaMagiaTextField.getText();
        String duracao = duracaoTextField.getText();
        String tamanho = tamanhoTextField.getText();
        String classe = classeTextField.getText();

        String frase = "A " + nomeDaMagia + " é uma mágia que dura " + duracao + ", em uma área de " + tamanho + " e da classe " + classe;
        fraseLabel.setText(frase);

        Image imagem = new Image(getClass().getResourceAsStream("/magiaswallpaper.jpg"));
        imageView.setImage(imagem);
    }
}

