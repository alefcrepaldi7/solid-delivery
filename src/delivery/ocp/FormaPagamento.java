package delivery.ocp;

/** Abstração: novos pagamentos = novas classes que implementam isto. */
public interface FormaPagamento {
    void pagar(double valor);
}
