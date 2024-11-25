package br.inatel.Model;

public class Cliente {

    private String nome;

    private String cpf;

    int idCliente;

    private String telefone;

    private String email;

    public Cliente(String nome, String cpf, int idCliente, String telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.idCliente = idCliente;
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


