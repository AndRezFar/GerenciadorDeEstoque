package br.com.gerenciamentoDeEstoque.estoque;

public class Produto {

    private final int CODIGO_INTERNO;
    private final String NOME_PRODUTO;
    private final String DESCRICAO_PRODUTO;
    private final double PRECO_PRODUTO;
    private int quantidadeEstoque;

    private static int controle = 0;

    public Produto(String nomeProduto, String descrucaoProduto, double precoProduto, int quantidadeEstoque) {
        this.NOME_PRODUTO = nomeProduto;
        this.DESCRICAO_PRODUTO = descrucaoProduto;
        this.PRECO_PRODUTO = precoProduto;
        this.quantidadeEstoque = quantidadeEstoque;
        controle++;
        this.CODIGO_INTERNO = controle;
    }

    public int getCODIGO_INTERNO() {
        return CODIGO_INTERNO;
    }

    public String getNOME_PRODUTO() {
        return NOME_PRODUTO;
    }

    public String getDESCRICAO_PRODUTO() {
        return DESCRICAO_PRODUTO;
    }

    public double getPRECO_PRODUTO() {
        return PRECO_PRODUTO;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }


    @Override
    public String toString() {
        return "[Codigo Interno: " + CODIGO_INTERNO +
                ", Nome: " + NOME_PRODUTO +
                ", Descrição: " + DESCRICAO_PRODUTO +
                ", Preço: " + PRECO_PRODUTO +
                ", Quantidade em Estoque: " + quantidadeEstoque +
                ']';
    }


}
