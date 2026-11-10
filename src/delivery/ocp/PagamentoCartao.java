package delivery.ocp;

public class PagamentoCartao implements FormaPagamento {
    @Override
    public void pagar(double valor) {
        System.out.printf("Pagamento de R$ %.2f realizado via CARTÃO.%n", valor);
    }
}
