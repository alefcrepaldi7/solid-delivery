package delivery.isp;

/** Só envia notificações. */
public class NotificadorPush implements EnviadorNotificacao {
    @Override public void enviarNotificacao(String destino, String mensagem) {
        System.out.println("[PUSH -> " + destino + "] " + mensagem);
    }
}
