/*
 * Clase Asignatura
 * Fatima Navarro 24044
 * Fecha: 25/07/2024
 */

 public class Asignatura {
    //Atributos
    private String nombre;
    private double promedio;

    //Constructor
    public Asignatura(String nombre, double promedio) {
        this.nombre = nombre;
        this.promedio = promedio;
    }
    
    //Metodos
    public String getNombre() {
        return nombre;
    }

    public double getPromedio() {
        return promedio;
    }
}
