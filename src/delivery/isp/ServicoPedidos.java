package delivery.isp;

/** Só implementa o que usa: gerenciar pedidos. */
public class ServicoPedidos implements GerenciadorPedidos {
    @Override public void registrarPedido(int id, String cliente) {
        System.out.println("Pedido #" + id + " registrado para " + cliente);
    }
    @Override public void cancelarPedido(int id) {
        System.out.println("Pedido #" + id + " cancelado");
    }
}
