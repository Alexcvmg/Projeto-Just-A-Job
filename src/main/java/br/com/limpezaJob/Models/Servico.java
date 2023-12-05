package br.com.limpezaJob.Models;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
@Data
public class Servico {
    private Imovel imovel;
    private Funcionario gerente;
    private  Fatura fatura;
    private LocalDateTime dataHoraCotacao;
    private double valor;
    private LocalDateTime dataHoraExecucao;
    private List<Funcionario> equipeFaxineiros = new ArrayList<Funcionario>();
    private double avaliacao;

    public Servico(Imovel imovel, Funcionario funcionario, Fatura fatura, LocalDateTime dataHoraCotacao, double valor, LocalDateTime dataHoraExecucao) {
        this.imovel = imovel;
        this.gerente = funcionario;
        this.fatura = fatura;
        this.dataHoraCotacao = dataHoraCotacao;
        this.valor = valor;
        this.dataHoraExecucao = dataHoraExecucao;
    }

    public void marcarVisitaParaCotacao(LocalDateTime data, Imovel imovel, Funcionario gerente){

    }

    public boolean marcarRealizacaoDoServico(){
        return false;
    }

    public boolean adicionarMembroNaEquipe(Funcionario faxineiro){
        equipeFaxineiros.add(faxineiro);
        return true;
    }

    public void avaliarServico(double nota){
        this.avaliacao = nota;
    }

}
