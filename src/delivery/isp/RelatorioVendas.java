package delivery.isp;

/** Só gera relatório; não é obrigado a gerenciar pedidos, entregas ou notificações. */
public class RelatorioVendas implements GeradorRelatorio {
    @Override public String gerarRelatorio() { return "Relatório de vendas do dia: 12 pedidos, R$ 540,00"; }
}
