package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Carro carroComum = new Carro();
        carroComum.setMarca("Toyota");
        carroComum.setModelo("Corolla");
        carroComum.setAno(2020);

        CarroEsportivo ferrari = new CarroEsportivo();
        ferrari.setMarca("Ferrari");
        ferrari.setModelo("488 Spider");
        ferrari.setAno(2021);
        ferrari.setVelocidadeMaxima(330);

        // Testando Polimorfismo
        carroComum.ligar();     // Metodo da classe pai
        ferrari.ligar();        // Metodo sobrescrito da classe filha

        carroComum.acelerar();                // Sobrecarga sem parametro
        carroComum.acelerar(120);   // Sobrecarga com parametro

        ferrari.ativarModoTurbo();            // Metodo exclusivo da class Filha
    }
}
