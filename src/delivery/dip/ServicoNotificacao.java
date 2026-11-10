package delivery.dip;

import java.util.List;

/**
 * Módulo de alto nível: NÃO conhece Email, SMS ou WhatsApp.
 * Recebe as abstrações por injeção de dependência (construtor).
 */
public class ServicoNotificacao {
    private final List<Notificador> notificadores;

    public ServicoNotificacao(List<Notificador> notificadores) {
        this.notificadores = List.copyOf(notificadores);
    }

    public void notificarTodos(String destino, String mensagem) {
        notificadores.forEach(n -> n.enviar(destino, mensagem));
    }
}
