package delivery.srp;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/** Responsabilidade ÚNICA: CRIAR pedidos (gera o id e valida os dados). */
public class PedidoFactory {
    private final AtomicInteger sequencia = new AtomicInteger(1);

    public Pedido criar(String cliente, List<String> itens, double total) {
        if (cliente == null || cliente.isBlank())
            throw new IllegalArgumentException("Cliente obrigatório");
        if (itens == null || itens.isEmpty())
            throw new IllegalArgumentException("O pedido precisa ter itens");
        if (total < 0)
            throw new IllegalArgumentException("Total inválido");
        return new Pedido(sequencia.getAndIncrement(), cliente, itens, total);
    }
}
