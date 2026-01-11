package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Carro corolla = new Carro();
        corolla.setMarca("Toyota");
        corolla.setModelo("Corolla");
        corolla.setAno(2020);
        corolla.ligar();
        corolla.desligar();

        CarroEsportivo ferrari = new CarroEsportivo();
        ferrari.setMarca("Ferrari");
        ferrari.setModelo("488 Spider");
        ferrari.setAno(2021);
        ferrari.setVelocidadeMaxima(330);
        ferrari.ligar();
        ferrari.ativarTurbo();
        ferrari.desligar();
    }
}
