package Excercies_Week_3.Cuervos;

// 1. Clase base más general
abstract class Ave {
    private String nombre;

    public Ave(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}