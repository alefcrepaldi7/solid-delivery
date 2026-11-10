package delivery.srp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** Responsabilidade ÚNICA: representar os dados de um pedido. */
public class Pedido {
    private final int id;
    private final String cliente;
    private final List<String> itens = new ArrayList<>();
    private final double total;

    public Pedido(int id, String cliente, List<String> itens, double total) {
        this.id = id;
        this.cliente = cliente;
        this.itens.addAll(itens);
        this.total = total;
    }

    public int getId() { return id; }
    public String getCliente() { return cliente; }
    public List<String> getItens() { return Collections.unmodifiableList(itens); }
    public double getTotal() { return total; }
}
