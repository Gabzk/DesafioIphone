package models;

import interfaces.*;

public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {

    private String numeroTelefonico;
    private String modelo;

    public String getModelo() {
        return modelo;
    }
    
    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    public Iphone(String numeroTelefonico, String modelo) {
        this.modelo = modelo;
        this.numeroTelefonico = numeroTelefonico;
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o numero " + numero);
    }

    @Override
    public void tocarCorreioDeVoz() {
        System.out.println("Tocando correio de voz");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada.");
    }

    @Override
    public void novaPagina() {
        System.out.println("Abrindo nova pagina.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina: " + url);
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música.");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música.");
    }
}
