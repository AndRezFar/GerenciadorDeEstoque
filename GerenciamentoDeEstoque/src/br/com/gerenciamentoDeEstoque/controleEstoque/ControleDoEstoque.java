package br.com.gerenciamentoDeEstoque.controleEstoque;

import br.com.gerenciamentoDeEstoque.estoque.Produto;
import java.util.*;

public class ControleDoEstoque {

    Map<Integer, Produto> produtos = new HashMap<>();

    public void adicionarProduto(Produto produto){
        this.produtos.put(produto.getCODIGO_INTERNO(), produto);
    }

    public void alterarEstoque(int codigoInterno, int novoValor){
        produtos.get(codigoInterno).setQuantidadeEstoque(novoValor);
    }

    public void removerProduto(int codigoInterno){
        produtos.remove(codigoInterno);
    }


    public void mostrar(){
        Iterator<Produto> i = produtos.values().iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }

}
