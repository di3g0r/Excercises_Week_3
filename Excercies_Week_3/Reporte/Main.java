package Excercies_Week_3.Reporte;

import Excercies_Week_3.Reporte.Reporte;
import Excercies_Week_3.Reporte.ReporteArchivo;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Reporte reporte = new Reporte("El Rancho", "Ariel Camacho", 
            "Aqui reportando");

        ReporteArchivo reporteArchivo = new ReporteArchivo();

        reporteArchivo.guardar(reporte, "reporte.txt");

        System.out.println("Reporte guardado exitosamente.");

        System.out.println(reporte);
    }
}

