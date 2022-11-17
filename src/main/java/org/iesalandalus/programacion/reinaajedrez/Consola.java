package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {
	private Consola() {
	}

	public static void mostraMenu() {
		System.out.println("1. Crear Reina por defecto");
		System.out.println("2.Crear reina eligiendo el color");
		System.out.println("3.Mover");
		System.out.println("4.Salir");
	}

public static int elegirOpcionMenu() {
	int opcionMenu;
 do {  
	 System.out.println("elege una opcion del menú anterior");
	 opcionMenu= Entrada.entero();
 } while (opcionMenu <1 || opcionMenu >4);
 System.out.println("La opcion elegida no es valida");
 switch (opcionMenu) {
 case 1:
   System.out.println("Crear Reina por defecto");
   break;
 case 2:
   System.out.println("Crear reina eleigiendo el color");
   break;
 case 3:
   System.out.println("Mover");
   break;
 case 4:
   System.out.println("Salir");
   break;
 }
 
 }
return opcionMenu;
}