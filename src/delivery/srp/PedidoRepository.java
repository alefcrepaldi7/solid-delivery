package delivery.srp;

import java.util.ArrayList;
import java.util.List;

/** Responsabilidade ÚNICA: SALVAR (persistir) pedidos. Aqui, em memória. */
public class PedidoRepository {
    private final List<Pedido> pedidos = new ArrayList<>();

    public void salvar(Pedido pedido) { pedidos.add(pedido); }

    public List<Pedido> listar() { return List.copyOf(pedidos); }
}
