package org.example;

public abstract class Veiculo {

    private String marca;
    private String modelo;

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Metodo Abstrato (sem corpo)
    public abstract void ligar();

    // Metodo Comum
    public void desligar(){
        System.out.println("O veículo foi desligado");
    }
}
