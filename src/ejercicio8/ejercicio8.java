package ejercicio8;

import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);
	        int edad = 0, CantDeAnotados = 100, mayor = 0, menor = 0;
	        String nombre, EdadMoMe;

	        // nombre
	        System.out.println("Ingrese tu nombre completo");
	        nombre = entrada.nextLine();

	        while (nombre.isBlank()) {
	            System.err.println("Error: El nombre  no puede quedar vacío. Inténtelo de nuevo:");
	            nombre = entrada.nextLine();
	        }
	        System.out.println("Ingrese tu edad por favor");
	        edad = entrada.nextInt();

	        while (edad < 0 || edad > 100) {
	            System.err.println("Error:Edad no válida. Ingrese un valor entre 0 y 100:");
	            edad = entrada.nextInt();
	        }
	        if (edad <= 17) {
	            EdadMoMe = "menor";
	        } else {
	            EdadMoMe = "mayor";
	        }
	        for (int i = 1; i <CantDeAnotados; i++) {
	        }
	        System.out.println("\n--- Datos registrados correctamente ---");
	        System.out.println("Nombre completo: " + nombre);
	        System.out.println("edad: " + edad);
	        System.out.println("El alumno es (Mayor o Menor): " + EdadMoMe);
	        System.out.println("Cantidad de los alumnos anotados: "+CantDeAnotados);
	    }

	}