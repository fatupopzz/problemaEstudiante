/*
 * Ejercicio estudiante
 * Fatima Navarro 24044
 * 25/7/2024
 * Programacion orientada a objetos
 */

import java.util.Scanner;

public class Main {
    private static Semestre semestre;
    private static Scanner scanner;

    public static void main(String[] args) {
        semestre = new Semestre();
        scanner = new Scanner(System.in);
        // deja ingresar 5 asignaturas
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre de la asignatura " + (i + 1) + ":");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese el promedio de la asignatura " + nombre + ":");
            double promedio = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer
            semestre.setAsignatura(i, new Asignatura(nombre, promedio));
        }
        // menu de opciones para que el usuario elija que hacer.
        int opcion;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mostrar promedio general");
            System.out.println("2. Mostrar la clase en la que mejor le está yendo");
            System.out.println("3. Mostrar alertas de asignaturas con promedio menor que 10");
            System.out.println("4. Mostrar mensaje de felicitación si el promedio general es superior a 90");
            System.out.println("5. Mostrar todas las asignaturas con su respectivo promedio");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            // que hace cada opcion 
            switch (opcion) {
                case 1:
                    System.out.println("Promedio general: " + semestre.calcularPromedioGeneral());
                    break;
                case 2:
                    Asignatura mejor = semestre.obtenerMejorClase();
                    System.out.println("La clase en la que mejor le está yendo es " + mejor.getNombre() + " con un promedio de " + mejor.getPromedio());
                    break;
                case 3:
                    semestre.mostrarAlertas();
                    break;
                case 4:
                    if (semestre.calcularPromedioGeneral() > 90) {
                        System.out.println("¡Felicidades! Su promedio general es superior a 90.");
                    } else {
                        System.out.println("Siga intentando, su promedio es de" + semestre.calcularPromedioGeneral());
                    }
                    break;
                case 5:
                    semestre.mostrarAsignaturas();
                    break;
                case 6:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 6);
    }
}
