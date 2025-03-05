package Excercies_Week_3.Notificacion;

// Implementación concreta: WhatsApp
class WhatsApp implements CanalNotificacion {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando WhatsApp: " + mensaje);
    }
}
