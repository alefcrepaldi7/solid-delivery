package delivery.isp;
public interface GerenciadorPedidos {
    void registrarPedido(int idPedido, String cliente);
    void cancelarPedido(int idPedido);
}
