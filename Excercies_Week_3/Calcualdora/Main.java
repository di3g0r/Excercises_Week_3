package Excercies_Week_3.Calcualdora;

public class Main {
    public static void main(String[] args) {
        double precioOriginal = 100.0;

        CalculadoraDescuento calculadoraNormal = new CalculadoraDescuento(new DescuentoNormal());
        System.out.println("Descuento Normal si el Precio es 100 pesos: $" + calculadoraNormal.calcular(precioOriginal));

        // Cliente VIP
        CalculadoraDescuento calculadoraVIP = new CalculadoraDescuento(new DescuentoVIP());
        System.out.println("Descuento VIP si el Precio es 100 pesos: $" + calculadoraVIP.calcular(precioOriginal));

        // Cliente Premium
        CalculadoraDescuento calculadoraPremium = new CalculadoraDescuento(new DescuentoPremium());
        System.out.println("Descuento Premium si el Precio es 100 pesos: $" + calculadoraPremium.calcular(precioOriginal));
    }
}