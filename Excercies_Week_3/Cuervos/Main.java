package Excercies_Week_3.Cuervos;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ave Voladora");
        AveVoladora pollitoAmarillito = new AveVoladora("Sergio");
        pollitoAmarillito.volar();

        System.out.println("Ave No Voladora");
        AveNoVoladora pinguino = new AveNoVoladora("Gael");
        pinguino.caminar();
    }
}
