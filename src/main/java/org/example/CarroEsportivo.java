package org.example;

public class CarroEsportivo extends Carro implements Turbo{

    private int velocidadeMaxima;

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }
    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    @Override
    public void ligar(){
        System.out.println("O Carro esportivo está ligado com ronco esportivo! ");
    }

    @Override
    public void ativarTurbo(){
        System.out.println("Turbo ativado! Velocidade máxima: " + velocidadeMaxima + " km/h");
    }
}
