package br.com.limpezaJob.Models;

public class Funcionario extends Pessoa {
    private String perfil;

    public Funcionario(String nome, String telefone, String email, String cpf, String perfil) {
        super(nome, telefone, email, cpf);
        this.perfil = perfil;
    }

}
