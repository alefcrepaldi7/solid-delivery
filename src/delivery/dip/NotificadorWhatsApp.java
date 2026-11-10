package delivery.dip;
public class NotificadorWhatsApp implements Notificador {
    @Override public void enviar(String destino, String msg) { System.out.println("[WHATSAPP -> " + destino + "] " + msg); }
}
