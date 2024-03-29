package br.com.limpezaJob.Models;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
@Data
public class Agenda {
    private int diasDaSemanaDeTrabalho;
    private Funcionario faxineiro;

    public Agenda(int diasDaSemanaDeTrabalho, Funcionario faxineiro) {
        this.diasDaSemanaDeTrabalho = diasDaSemanaDeTrabalho;
        this.faxineiro = faxineiro;
    }

    public List<LocalDateTime> verificarDatasDisponiveis(){
        return null;
    }

    public boolean verificarSeDataEstaDisponivel(){
        return true;
    }

    public String verificarCompromisso(){
        return null;
    }

    public Funcionario visualizarFuncionario(){
        return faxineiro;
    }

    public List<Funcionario> visualizarFuncionarios(){
        return null;
    }

}
