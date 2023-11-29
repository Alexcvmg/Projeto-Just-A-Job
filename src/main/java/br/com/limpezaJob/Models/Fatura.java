package br.com.limpezaJob.Models;

import java.time.LocalDateTime;

public class Fatura {
    private double valor;
    private LocalDateTime dataEmissao;
    private LocalDateTime dataVencimento;
    private double valorPago;
    private Servico servico;

    public Fatura(double valor, LocalDateTime dataEmissao, LocalDateTime dataVencimento, double valorPago, Servico servico) {
        this.valor = valor;
        this.dataEmissao = dataEmissao;
        this.dataVencimento = dataVencimento;
        this.valorPago = valorPago;
        this.servico = servico;
    }

    public boolean atualizarPagamentoParcial(){
        return false;
    }
}
