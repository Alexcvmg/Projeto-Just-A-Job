package br.com.limpezaJob.Models;

import java.util.List;

public class Cliente extends Pessoa {
    private List<Imovel> listaImoveis;
    private Imovel imovelResidencial;

    public Cliente(String nome, String telefone, String email, String cpf, List<Imovel> listaImoveis, Imovel imovelResidencial) {
        super(nome, telefone, email, cpf);
        this.listaImoveis = listaImoveis;
        this.imovelResidencial = imovelResidencial;
    }

    public Cliente visualizarDadosCliente(String cpf){
        return null;
    }

    public List<Imovel> visualizarImoveis(){
        return listaImoveis;
    }

    public Imovel visualizarImovelResidencial(){
        return imovelResidencial;
    }
}
