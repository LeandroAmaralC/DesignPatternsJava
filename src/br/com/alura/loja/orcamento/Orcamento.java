package br.com.alura.loja.orcamento;

import br.com.alura.loja.situacao.EmAnalise;
import br.com.alura.loja.situacao.SituacaoOrcamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private int quantidadeItens;



    private SituacaoOrcamento situacao;

    public void aplicarDescontoExtra(){

        BigDecimal valorDoDescontoExtra = this.situacao.calcularValorDescontoExtra(this);

        this.valor = this.valor.subtract(valorDoDescontoExtra);
    }

    public void aprovar(){
    this.situacao.aprovar(this);
    }

    public void reprovar(){
        this.situacao.reprovar(this);
    }

    public void finalizar(){
        this.situacao.finalizar(this);
    }

    public Orcamento(BigDecimal valor, int quantidadeItens ) {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
        this.situacao = new EmAnalise();
    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public SituacaoOrcamento getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoOrcamento situacao) {
        this.situacao = situacao;
    }
}
