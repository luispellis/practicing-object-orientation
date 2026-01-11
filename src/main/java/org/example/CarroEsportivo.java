package org.example;

public class CarroEsportivo extends Carro{

    private int velocidadeMaxima;

    public int getVelocidadeMaxima() {return velocidadeMaxima;}
    public void setVelocidadeMaxima(int velocidadeMaxima) { this.velocidadeMaxima = velocidadeMaxima;}

    // Metodo específico do carro esportivo
    public void ativarModoTurbo(){
        System.out.println("Modo Turbo Ativado! Velocidade Máxima: " + velocidadeMaxima + " km/h");
    }
}
