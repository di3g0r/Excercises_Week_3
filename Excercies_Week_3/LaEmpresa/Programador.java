package Excercies_Week_3.LaEmpresa;

// Programador solo implementa lo que necesita
class Programador implements Trabajador, Comedor {
    @Override
    public void trabajar() {
        System.out.println("El programador esta escribiendo codigo.");
    }

    @Override
    public void comer() {
        System.out.println("El programador esta comiendo.");
    }
}
