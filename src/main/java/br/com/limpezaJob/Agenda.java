package br.com.limpezaJob;

import java.time.LocalDateTime;
import java.util.List;

public class Agenda {
    private int diasDaSemanaDeTrabalho;
    private Funcionario faxineiro;

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
