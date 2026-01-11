package org.example;

public class Carro {

    // Atributos privados
    private String marca;
    private String modelo;
    private int ano;

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void ligar(){
        System.out.println("O Carro está ligado");
    }

    // Sobrecarga de metodos (Overload)
    public void acelerar(){
        System.out.println("O Carro está acelerando...");
    }

    public void acelerar(int velocidade){
        System.out.println("O Carro está acelerando até  "+ velocidade +" km/h");
    }
}
