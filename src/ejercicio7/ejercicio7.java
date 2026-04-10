package ejercicio7;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
         int cantProducto = entrada.nextInt(); 
         
      String producto = entrada.next();
      
		 do {
		System.out.println("Ingrese un producto: ");
		
		System.out.println("Ingrese la cantidad: ");
		
			
		System.out.println("El ultimo producto ingresado fue: "+ producto +" y su cantidad era "+ cantProducto);
			
		
		if (cantProducto < 5) {
			
			System.err.println("Alerta ⚠️⚠⚠️ : Este producto  se encuentra en stock bajo⚠️⚠️⚠️: ");
			
			
		}	
		else if (cantProducto == 5) {
			
			System.out.println("este producto se encuentra en un stock normal: ");
			
			}
		
		}while(cantProducto < 0 || cantProducto > 130);
		System.err.println("🚫 Error: la cantidad de "+ producto +"no es valida. Ingrese un valor entre 0 y 130. ");
		  
		  System.out.println("Ingrese el nombre del producto: ");
	        String nombre = entrada.nextLine();
	}
		}
