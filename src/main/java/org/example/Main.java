package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Carro carro1 = new Carro();
        carro1.marca = "Fiat Uno";
        carro1.modelo = "Fiat";
        carro1.ano = 2010;

        carro1.ligar();
        carro1.exibirInfo();
        carro1.desligar();
        carro1.exibirInfo();
    }
}
