package Excercies_Week_3.Notificacion;

// Interfaz para los canales de notificación
interface CanalNotificacion {
    void enviarMensaje(String mensaje);
}

class Notificador {
    private CanalNotificacion canal;

    public Notificador(CanalNotificacion canal) {
        this.canal = canal; // Inyección de dependencia
    }

    public void notificar(String mensaje) {
        canal.enviarMensaje(mensaje);
    }
}