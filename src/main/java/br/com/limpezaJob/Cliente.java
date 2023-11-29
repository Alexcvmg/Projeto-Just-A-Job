package br.com.limpezaJob;

import java.util.List;

public class Cliente extends Pessoa {
    private List<Imovel> listaImoveis;
    private Imovel imovelResidencial;

    public Cliente visualizarDadosCliente(String cpf){
        return this;
    }

    public List<Imovel> visualizarImoveis(){
        return listaImoveis;
    }

    public Imovel visualizarImovelResidencial(){
        return imovelResidencial;
    }
}
