package br.com.limpezaJob.Models;

import lombok.Data;
import lombok.Getter;
@Data
public class Funcionario extends Pessoa {

    private String perfil;
    private Agenda agenda;
    public Funcionario(String nome, String telefone, String email, String cpf, String perfil) {
        super(nome, telefone, email, cpf);
        this.perfil = perfil;
    }


}
