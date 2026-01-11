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

    // Primeiro carro foi construido em 1886
    public void setAno(int ano){
        if (ano > 1885){
            this.ano = ano;
        } else {
            System.out.println("Ano Inválido");
        }
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

    public void desligar(){
        System.out.println("O Carro está desligado");
    }

    public void exibirInfo(){
        System.out.println("Marca: "+marca+" modelo: "+modelo);
    }
}
