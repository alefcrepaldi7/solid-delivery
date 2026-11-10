package delivery.lsp;

public class Pizza extends Produto {
    private final int quantidadeRecheios;

    public Pizza(String sabor, double precoBase, int quantidadeRecheios) {
        super("Pizza " + sabor, precoBase);
        this.quantidadeRecheios = Math.max(0, quantidadeRecheios);
    }

    @Override
    public double calcularPreco() { return getPrecoBase() + quantidadeRecheios * 3.50; }
}
