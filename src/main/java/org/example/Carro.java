package org.example;

public class Carro {

    String marca;
    String modelo;
    int ano;

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
