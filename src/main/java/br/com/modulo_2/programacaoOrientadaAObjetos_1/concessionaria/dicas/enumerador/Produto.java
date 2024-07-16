package br.com.modulo_2.programacaoOrientadaAObjetos_1.concessionaria.dicas.enumerador;

public class Produto {
    public Produto(int idTipoProduto){
        TipoProdutoEnum tipoProdutoEnum = TipoProdutoEnum.obterPorId(idTipoProduto);
        this.tipoProdutoEnum = tipoProdutoEnum;
    }

    TipoProdutoEnum tipoProdutoEnum;
    String nome;
    double valor;
}
