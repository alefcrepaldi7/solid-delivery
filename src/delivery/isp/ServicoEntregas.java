package delivery.isp;

/** Só implementa o que usa: gerenciar entregas. */
public class ServicoEntregas implements GerenciadorEntregas {
    @Override public void atribuirEntregador(int id, String entregador) {
        System.out.println("Pedido #" + id + " atribuído ao entregador " + entregador);
    }
    @Override public void finalizarEntrega(int id) {
        System.out.println("Entrega do pedido #" + id + " finalizada");
    }
}
