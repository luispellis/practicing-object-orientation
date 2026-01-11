package org.example;

public class CarroEsportivo extends Carro{
    private int velocidadeMaxima;

    public int getVelocidadeMaxima() {return velocidadeMaxima;}
    public void setVelocidadeMaxima(int velocidadeMaxima){
        this.velocidadeMaxima = velocidadeMaxima;
    }

    // Sobrescrita do metodo ligar
    public void ligar(){
        System.out.println("O Carro esportivo está ligando com ronco esportivo! ");
    }

    public void ativarModoTurbo(){
        System.out.println("Modo Turbo ativado! Velocidade máxima: " + velocidadeMaxima + " km/h");
    }
}
