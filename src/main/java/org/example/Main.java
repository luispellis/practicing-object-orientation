package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Carro carro1 = new Carro();
        carro1.setMarca("Fiat Uno");
        carro1.setModelo("Fiat");
        carro1.setAno(2016);

        carro1.ligar();
        carro1.exibirInfo();
        carro1.desligar();
        carro1.exibirInfo();

        // Testando validação
        carro1.setAno(1500);
    }
}
