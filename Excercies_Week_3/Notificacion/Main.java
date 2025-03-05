package Excercies_Week_3.Notificacion;

public class Main {
    public static void main(String[] args) {
        CanalNotificacion email = new CorreoElectronico();
        email.enviarMensaje("Cuerno de Chivo Azul4do");

        CanalNotificacion wpp = new WhatsApp();
        wpp.enviarMensaje("Sergio tec");

        CanalNotificacion sms = new SMS();
        sms.enviarMensaje("Colchones Wendy");
    }
}
