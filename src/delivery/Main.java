package delivery;

import delivery.dip.*;
import delivery.isp.*;
import delivery.lsp.*;
import delivery.ocp.*;
import delivery.srp.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== 1. SRP - Pedidos ===");
        PedidoFactory factory = new PedidoFactory();
        PedidoRepository repo = new PedidoRepository();
        PedidoExibidor exibidor = new PedidoExibidor();
        Pedido pedido = factory.criar("Maria", List.of("Pizza Calabresa", "Coca-Cola"), 62.50);
        repo.salvar(pedido);
        exibidor.exibir(pedido);

        System.out.println("\n=== 2. OCP - Pagamentos ===");
        ProcessadorPagamento processador = new ProcessadorPagamento();
        processador.processar(new PagamentoCartao(), 62.50);
        processador.processar(new PagamentoPix(), 62.50);
        processador.processar(new PagamentoDinheiro(), 62.50);
        // Novo pagamento SEM alterar código existente (classe anônima de exemplo):
        processador.processar(valor -> System.out.printf("Pagamento de R$ %.2f via VALE-REFEIÇÃO.%n", valor), 62.50);

        System.out.println("\n=== 3. LSP - Produtos ===");
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionar(new Pizza("Calabresa", 40.0, 2));
        carrinho.adicionar(new Hamburguer("Artesanal", 28.0, true));
        carrinho.adicionar(new Bebida("Coca-Cola 2L", 12.0));
        for (Produto p : carrinho.getProdutos())
            System.out.printf("%-25s R$ %.2f%n", p.getNome(), p.calcularPreco());
        System.out.printf("TOTAL: R$ %.2f%n", carrinho.total());

        System.out.println("\n=== 4. ISP - Interfaces específicas ===");
        GerenciadorPedidos pedidos = new ServicoPedidos();
        GerenciadorEntregas entregas = new ServicoEntregas();
        GeradorRelatorio relatorio = new RelatorioVendas();
        EnviadorNotificacao push = new NotificadorPush();
        pedidos.registrarPedido(1, "Maria");
        entregas.atribuirEntregador(1, "Carlos");
        entregas.finalizarEntrega(1);
        System.out.println(relatorio.gerarRelatorio());
        push.enviarNotificacao("Maria", "Seu pedido saiu para entrega!");

        System.out.println("\n=== 5. DIP - Notificações desacopladas ===");
        ServicoNotificacao servico = new ServicoNotificacao(
                List.of(new NotificadorEmail(), new NotificadorSms(), new NotificadorWhatsApp()));
        servico.notificarTodos("maria@email.com", "Pedido entregue!");
    }
}
