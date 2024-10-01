package br.inatel.Model;

public class Mesa {

    int id;
    int numero;
    int capacidade;

    // Construtor
    public Mesa(int id, int numero, int capacidade) {
        this.id = id;
        this.numero = numero;
        this.capacidade = capacidade;
    }


    public int getNumero() {
        return numero;
    }



    public int getCapacidade() {
        return capacidade;
    }


}