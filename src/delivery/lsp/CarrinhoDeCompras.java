package delivery.lsp;

import java.util.ArrayList;
import java.util.List;

/** Trabalha com Produto; qualquer subclasse funciona corretamente aqui. */
public class CarrinhoDeCompras {
    private final List<Produto> produtos = new ArrayList<>();

    public void adicionar(Produto p) { produtos.add(p); }

    public double total() {
        return produtos.stream().mapToDouble(Produto::calcularPreco).sum();
    }

    public List<Produto> getProdutos() { return List.copyOf(produtos); }
}
