package ejercicio7;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String producto;
		int cantProducto;
		 do {
		System.out.println("Ingrese un producto: ");
		producto = entrada.nextLine();
		 while (producto.isBlank()) {
	            System.err.println("Error: El producto no puede quedar vacío. Inténtelo de nuevo:");
	            producto = entrada.nextLine();
	        }
		System.out.println("Ingrese la cantidad: ");
		cantProducto = entrada.nextInt(); 
			
		System.out.println("El ultimo producto ingresado fue: "+ producto +" y su cantidad era "+ cantProducto);
						
		if(cantProducto < 5 ) {	System.err.println("Alerta ⚠️⚠⚠️ : Este producto  se encuentra en stock bajo⚠️⚠️⚠️: ");
		} else {System.out.println("Este producto tiene stock");
		}
		
		}while(cantProducto < 0 || cantProducto > 130);
		 
		 if (cantProducto < 0 || cantProducto > 130) {
			 System.err.println("🚫 Error: la cantidad de "+ producto +"no es valida. Ingrese un valor entre 0 y 130. ");
		 }else {	  
		  System.out.println("Nombre de el Producto: " + producto );
		  System.out.println("La cantidad es:" + cantProducto);
		 }
	}
		}
