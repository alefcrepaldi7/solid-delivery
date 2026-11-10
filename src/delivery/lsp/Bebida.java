package delivery.lsp;

public class Bebida extends Produto {
    public Bebida(String nome, double precoBase) { super(nome, precoBase); }
    // Usa o comportamento da base sem alterar o contrato.
}
