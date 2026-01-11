package org.example;

public class Carro extends Veiculo{

    private int ano;

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public void ligar(){
        System.out.println("O Carro está ligado normalmente. ");
    }
}
