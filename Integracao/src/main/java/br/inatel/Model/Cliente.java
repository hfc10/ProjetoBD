package br.inatel.Model;

public class Cliente {

    String nome;

    String cpf;

    int id;

    String telefone;

    String email;

    public Cliente(String nome, String cpf, int id, String telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.id = id;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCpf() {
        return cpf;
    }
}


