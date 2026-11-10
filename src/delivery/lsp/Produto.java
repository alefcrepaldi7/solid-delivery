package delivery.lsp;

/**
 * Contrato da classe base:
 *  - getNome() nunca retorna nulo/vazio;
 *  - calcularPreco() sempre retorna um valor >= 0;
 *  - subclasses NÃO podem fortalecer pré-condições nem enfraquecer pós-condições.
 */
public abstract class Produto {
    private final String nome;
    private final double precoBase;

    protected Produto(String nome, double precoBase) {
        if (nome == null || nome.isBlank()) throw new IllegalArgumentException("Nome inválido");
        if (precoBase < 0) throw new IllegalArgumentException("Preço inválido");
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public String getNome() { return nome; }

    protected double getPrecoBase() { return precoBase; }

    /** Preço final. As subclasses podem adicionar adicionais, mas nunca resultar em valor negativo. */
    public double calcularPreco() { return precoBase; }
}
