package br.com.limpezaJob.Models;

import lombok.Data;

import java.util.List;
@Data
public class Imovel {
    private Cliente cliente;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;

    public Imovel(Cliente cliente, String logradouro, String numero, String complemento, String bairro, String cidade, String estado, String cep) {
        this.cliente = cliente;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public Imovel visualizarDadosDoImovel(){
        return this;
    }

    public Cliente visualizarDadosDoProprietario(){
        return cliente;
    }

    public List<Servico> visualizarHistoricoServicos(){
        return null;
    }
}
