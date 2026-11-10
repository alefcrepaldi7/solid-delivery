package delivery.ocp;

/**
 * FECHADA para modificação: nunca muda ao adicionar um novo tipo de pagamento.
 * ABERTA para extensão: basta criar outra classe que implemente FormaPagamento.
 */
public class ProcessadorPagamento {
    public void processar(FormaPagamento forma, double valor) {
        forma.pagar(valor);
    }
}
