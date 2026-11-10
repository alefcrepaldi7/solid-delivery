package delivery.lsp;

public class Hamburguer extends Produto {
    private final boolean comQueijoExtra;

    public Hamburguer(String nome, double precoBase, boolean comQueijoExtra) {
        super("Hambúrguer " + nome, precoBase);
        this.comQueijoExtra = comQueijoExtra;
    }

    @Override
    public double calcularPreco() { return getPrecoBase() + (comQueijoExtra ? 2.00 : 0.0); }
}
