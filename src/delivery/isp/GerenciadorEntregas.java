package delivery.isp;
public interface GerenciadorEntregas {
    void atribuirEntregador(int idPedido, String entregador);
    void finalizarEntrega(int idPedido);
}
