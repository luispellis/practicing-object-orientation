package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        CarroEsportivo ferrari = new CarroEsportivo();
        ferrari.setMarca("Ferrari");
        ferrari.setModelo("488 Spider");
        ferrari.setAno(2018);
        ferrari.setVelocidadeMaxima(330);

        ferrari.ligar();
        ferrari.exibirInfo();
        ferrari.ativarModoTurbo();
        ferrari.desligar();
    }
}
