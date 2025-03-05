package Excercies_Week_3.Cuervos;

import Excercies_Week_3.Cuervos.Ave;

class AveVoladora extends Ave {
    public AveVoladora(String nombre) {
        super(nombre);
    }

    public void volar() {
        System.out.println(getNombre() + " esta volando.");
    }
}

class Aguila extends AveVoladora {
    public Aguila() {
        super("Aguila");
    }
}