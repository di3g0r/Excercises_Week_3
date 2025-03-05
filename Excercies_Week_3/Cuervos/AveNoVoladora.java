package Excercies_Week_3.Cuervos;

class AveNoVoladora extends Ave {
    public AveNoVoladora(String nombre) {
        super(nombre);
    }

    public void caminar() {
        System.out.println(getNombre() + " esta caminando.");
    }
}

class Pinguino extends AveNoVoladora {
    public Pinguino() {
        super("Pinguino");
    }
}
