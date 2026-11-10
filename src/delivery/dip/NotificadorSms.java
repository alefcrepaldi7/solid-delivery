package delivery.dip;
public class NotificadorSms implements Notificador {
    @Override public void enviar(String destino, String msg) { System.out.println("[SMS -> " + destino + "] " + msg); }
}
