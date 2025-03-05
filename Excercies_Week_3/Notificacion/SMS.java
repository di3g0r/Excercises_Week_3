package Excercies_Week_3.Notificacion;

class SMS implements CanalNotificacion {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando SMS: " + mensaje);
    }
}