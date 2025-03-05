package Excercies_Week_3.LaEmpresa;

// Un empleado nocturno sí necesita dormir en el trabajo
class Vigilante implements Trabajador, Durmiente {
    @Override
    public void trabajar() {
        System.out.println("El vigilante esta supervisando el area.");
    }

    @Override
    public void dormir() {
        System.out.println("El vigilante toma una siesta en su turno.");
    }
}
