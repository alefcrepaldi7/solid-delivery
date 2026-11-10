# Sistema de Delivery — Princípios SOLID (Java)

Cada pacote em `src/delivery` demonstra um princípio:

| Pacote | Princípio | Como foi aplicado |
|--------|-----------|-------------------|
| `srp`  | Single Responsibility | `Pedido` (dados), `PedidoFactory` (criar), `PedidoRepository` (salvar), `PedidoExibidor` (exibir) |
| `ocp`  | Open/Closed | `FormaPagamento` + Cartão, Pix, Dinheiro. Novo pagamento = nova classe; `ProcessadorPagamento` não muda |
| `lsp`  | Liskov Substitution | `Produto` → `Pizza`, `Hamburguer`, `Bebida`; `CarrinhoDeCompras` usa qualquer um sem surpresas |
| `isp`  | Interface Segregation | 4 interfaces pequenas (notificação, relatório, pedidos, entregas); nenhuma classe implementa método que não usa |
| `dip`  | Dependency Inversion | `ServicoNotificacao` depende de `Notificador` (abstração), não de Email/SMS/WhatsApp |

## Executar
```bash
mkdir out
javac -d out $(find src -name "*.java")
java -cp out delivery.Main
```
Requer JDK 11+.
