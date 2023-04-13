package br.com.gerenciamentoDeEstoque;

import br.com.gerenciamentoDeEstoque.controleEstoque.ControleDoEstoque;
import br.com.gerenciamentoDeEstoque.estoque.Produto;

public class TesteControleDeEstoque {

    public static void main(String[] args) {



        ControleDoEstoque estoque = new ControleDoEstoque();

        estoque.adicionarProduto(new Produto("Nome1", " ", 1.0, 1));
        estoque.adicionarProduto(new Produto("Nome2", " ", 2.0, 1));
        estoque.adicionarProduto(new Produto("Nome3", " ", 3.0, 1));
        estoque.adicionarProduto(new Produto("Nome3", " ", 3.0, 1));
        estoque.adicionarProduto(new Produto("Nome5", " ", 4.0, 100));

        estoque.mostrar();

        System.out.println("===============================================================================================");

        estoque.alterarEstoque(3, 15);
        estoque.mostrar();

        System.out.println("===============================================================================================");

        estoque.removerProduto(5);
        estoque.mostrar();




    }


}