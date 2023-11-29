package br.com.limpezaJob.Models;

import java.util.List;

public class Imovel {
    private Cliente cliente;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;

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
