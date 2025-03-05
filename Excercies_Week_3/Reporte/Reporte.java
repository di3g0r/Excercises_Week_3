package Excercies_Week_3.Reporte;

import java.io.FileWriter;
import java.io.IOException;

class Reporte {
    private String titulo;
    private String autor;
    private String contenido;

    public Reporte(String titulo, String autor, String contenido) {
        this.titulo = titulo;
        this.autor = autor;
        this.contenido = contenido;
    }

    public String generarContenido() {
        System.out.println("Título: " + titulo + "\n" +
               "Autor: " + autor + "\n" +
               "Contenido:\n" + contenido);
               
        return "Título: " + titulo + "\n" +
               "Autor: " + autor + "\n" +
               "Contenido:\n" + contenido;
    }
}