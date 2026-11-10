package delivery.dip;
public class NotificadorEmail implements Notificador {
    @Override public void enviar(String destino, String msg) { System.out.println("[EMAIL -> " + destino + "] " + msg); }
}
