package Excercies_Week_3.Notificacion;

// Implementación concreta: Correo Electrónico
class CorreoElectronico implements CanalNotificacion {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando correo: " + mensaje);
    }
}