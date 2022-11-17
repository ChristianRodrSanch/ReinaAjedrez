package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;
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
			System.out.println("elige una opcion del menú anterior");
			opcionMenu = Entrada.entero();
		} while (opcionMenu < 1 || opcionMenu > 4);
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
		return opcionMenu;
	}

	public static void mostrarMenuDirecciones() {
		System.out.println("Esta son las direcciones");
		System.out.println("1.Moverte al NORTE");
		System.out.println("2.Moverte al NORESTE");
		System.out.println("3.Moverte al ESTE");
		System.out.println("4.Moverte al SURESTE");
		System.out.println("5.Moverte al SUR");
		System.out.println("6.Moverte al SUROESTE");
		System.out.println("7.Moverte al OESTE");
		System.out.println("8.Moverte al NOROESTE");

	}

	public static Direccion elegirDireccion() {
		Direccion direccion= null;
		int elegirDireccion;
		do { 
			System.out.println("Elige una direccion del menu de direcciones");
			elegirDireccion=Entrada.entero();
		} while (elegirDireccion < 1 || elegirDireccion > 8);
		System.out.println("La direccion elegida no es valida vuelve a elegir");
		switch(elegirDireccion) {
		case 1:
			System.out.println("Norte");
			direccion=Direccion.NORTE;
			break;
		case 2:
			System.out.println("NOROESTE");
			direccion=Direccion.NOROESTE;
			break;
		case 3:
			System.out.println("ESTE");
			direccion=Direccion.ESTE;
			break;
		case 4:
			System.out.println("SURESTE");
			direccion=Direccion.SURESTE;
			break;
		case 5:
			System.out.println("SUR");
			direccion=Direccion.SUR;
			break;
		case 6:
			System.out.println("SUROESTE");
			direccion=Direccion.SURESTE;
			break;
		case 7: 
			System.out.println("OESTE");
			direccion=Direccion.OESTE;
			break;
		case 8:
			System.out.println("NOROESTE");
			direccion=Direccion.NOROESTE;
			break;
		}
		return direccion;

	}
	public static  int elegirPasos() {
		int pasos;
		System.out.println("Eligue cuantos pasos te quieres mover");
		pasos = Entrada.entero();
		return pasos;
	}
	public static void despedirse() {
	System.out.println("Adios mi rey");	
	}
	

}