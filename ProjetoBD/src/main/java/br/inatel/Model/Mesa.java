package br.inatel.Model;

public class Mesa {

    private int idMesa;
    private int numero;
    private int capacidade;

    // Construtor
    public Mesa(int idMesa, int numero, int capacidade) {
        this.idMesa = idMesa;
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