package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;
import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {
	private Consola() {
	}

	public static void mostrarMenu() {
		System.out.println("1. Crear Reina por defecto");
		System.out.println("2.Crear reina eligiendo el color");
		System.out.println("3.Mover");
		System.out.println("4.Salir");
	}

	public static int elegirOpcionMenu() {
		int opcionMenu;
		do {
			System.out.print("elige una opcion del menú:");
			opcionMenu = Entrada.entero();
		} while (opcionMenu < 1 || opcionMenu > 4);
		switch (opcionMenu) {
		case 1:
			System.out.println("1.-Crear Reina por defecto");
			break;
		case 2:
			System.out.println("2.-Crear reina eligiendo el color");
			break;
		case 3:
			System.out.println("3.-Mover");
			break;
		case 4:
			System.out.println("4.-Salir");
			break;
		}
		return opcionMenu;
	}

	public static Color elegirColor() {
		Color color = null;
		int opcionColor;
		do {
			System.out.println("1.Blanco");
			System.out.println("2.Negro");
			System.out.print("Introduce el color de la reina: ");
			opcionColor = Entrada.entero();
		} while (opcionColor < 1 || opcionColor > 2);
		
		switch (opcionColor) {
		case 1:
			color = Color.BLANCO;
			break;
		case 2:
			color = Color.NEGRO;
		}
		
		return color;
	}
	public static void mostrarMenuDirecciones() {
		System.out.println("Esta son las direcciones");
		System.out.println("1.Moverte al Norte");
		System.out.println("2.Moverte al Noreste");
		System.out.println("3.Moverte al Este");
		System.out.println("4.Moverte al Sureste");
		System.out.println("5.Moverte al Sur");
		System.out.println("6.Moverte al Suroeste");
		System.out.println("7.Moverte al Oeste");
		System.out.println("8.Moverte al Noreste");

	}

	public static Direccion elegirDireccion() {
		Direccion direccion = null;
		int elegirDireccion;
		do {
			System.out.print("Elige la direccion de tu reina");
			elegirDireccion = Entrada.entero();
		} while (elegirDireccion < 1 || elegirDireccion > 8);
		switch (elegirDireccion) {
		case 1:
			System.out.println("Has elegido el norte");
			direccion = Direccion.NORTE;
			break;
		case 2:
			System.out.println("Has elegido el noroeste");
			direccion = Direccion.NOROESTE;
			break;
		case 3:
			System.out.println("Has elegido el este");
			direccion = Direccion.ESTE;
			break;
		case 4:
			System.out.println("Has elegido el sureste");
			direccion = Direccion.SURESTE;
			break;
		case 5:
			System.out.println("Has elegido el sur");
			direccion = Direccion.SUR;
			break;
		case 6:
			System.out.println("Has elegido el suroeste");
			direccion = Direccion.SURESTE;
			break;
		case 7:
			System.out.println("Has elegido el oeste");
			direccion = Direccion.OESTE;
			break;
		case 8:
			System.out.println("Has elegido el noroeste");
			direccion = Direccion.NOROESTE;
			break;
		}
		return direccion;

	}

	public static int elegirPasos() {
		int pasos;
		System.out.print("Eligue cuantos pasos te quieres mover(1 al 7): ");
		pasos = Entrada.entero();
		return pasos;
	}

	public static void despedirse() {
		
		System.out.println("Adios mi rey :3");
	}
}
