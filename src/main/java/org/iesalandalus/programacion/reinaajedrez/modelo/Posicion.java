package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Posicion {
	private int fila;
	private char columna;

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
		if (fila < 1) {
			throw new IllegalArgumentException("El valor de la fila es menor que el mínimo permitido.");
		} else if (fila > 8) {
			throw new IllegalArgumentException("El valor de la fila es mayor que el mínimo permitido.");
		}
	}

	public char getColumna() {
		return columna;
	}

	public Posicion(Posicion posicion) {
		if (posicion == null) {
			throw new IllegalArgumentException("El valor de la fila es menor que el mínimo permitido.");
		} else {
			setFila(posicion.fila);
			setColumna(posicion.columna);
		}

	}

	public void setColumna(char columna) {
		this.columna = columna;
		if (columna < 'a') {
			throw new IllegalArgumentException("El valor de la columna es menor que el mínimo permitido.");
		} else if (columna > 'h') {
			throw new IllegalArgumentException("El valor de la fila es mayor que el mínimo permitido.");
		}
	}
}