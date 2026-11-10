package delivery.dip;

/** Abstração da qual o módulo de alto nível depende. */
public interface Notificador { void enviar(String destino, String mensagem); }
