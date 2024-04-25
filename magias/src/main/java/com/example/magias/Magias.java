package com.example.magias;

public class Magias {

    private String nomeDaMagia;
    private String duracao;
    private String tamanho;
    private String classe;

    public Magias(String nomeDaMagia, String duracao, String tamanho, String classe){
        this.nomeDaMagia = nomeDaMagia;
        this.duracao = duracao;
        this.tamanho = tamanho;
        this.classe = classe;
    }

    // Getters e Setters
    public String getNomeDaMagia() {
        return nomeDaMagia;
    }

    public void setNomeDaMagia(String nomeDamagia) {
        this.nomeDaMagia = nomeDamagia;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String cor) {
        this.duracao = duracao;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
}
