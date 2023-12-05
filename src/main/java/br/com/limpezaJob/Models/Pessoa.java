package br.com.limpezaJob.Models;

import lombok.Data;

@Data
abstract public class Pessoa {
    private String nome;
    private String telefone;
    private String email;
    private String cpf;

    public Pessoa(String nome, String telefone, String email, String cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
    }
}
