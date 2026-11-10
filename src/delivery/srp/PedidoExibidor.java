package delivery.srp;

/** Responsabilidade ÚNICA: EXIBIR as informações de um pedido. */
public class PedidoExibidor {
    public void exibir(Pedido p) {
        System.out.println("Pedido #" + p.getId());
        System.out.println("  Cliente: " + p.getCliente());
        System.out.println("  Itens  : " + String.join(", ", p.getItens()));
        System.out.printf("  Total  : R$ %.2f%n", p.getTotal());
    }
}
