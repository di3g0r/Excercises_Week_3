package Excercies_Week_3.Notificacion;

public class Main {
    public static void main(String[] args) {
        CanalNotificacion email = new CorreoElectronico();
        email.enviarMensaje("Como estan");

        CanalNotificacion wpp = new WhatsApp();
        wpp.enviarMensaje("Hola");

        CanalNotificacion sms = new SMS();
        sms.enviarMensaje("Adios");
    }
}
