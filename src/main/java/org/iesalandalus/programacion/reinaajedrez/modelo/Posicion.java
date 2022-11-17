package org.iesalandalus.programacion.reinaajedrez.modelo;

import java.util.Objects;

public class Posicion {
	private int fila;
	private char columna;

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
		if (fila < 1) {
			throw new IllegalArgumentException("ERROR: Fila no válida.");
		} else if (fila > 8) {
			throw new IllegalArgumentException("ERROR: Fila no válida.");
		}
	}

	public char getColumna() {
		return columna;
	}

	public Posicion(Posicion posicion) {
		if (posicion == null) {
			throw new NullPointerException("ERROR: No es posible copiar una posición nula.");
		} else {
			setFila(posicion.fila);
			setColumna(posicion.columna);
		}

	}

	@Override
	public int hashCode() {
		return Objects.hash(columna, fila);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Posicion other = (Posicion) obj;
		return columna == other.columna && fila == other.fila;
	}

	@Override
	public String toString() {
		return String.format("fila=%s, columna=%s", fila, columna);
	}

	private void setColumna(char columna) {
		this.columna = columna;
		if (columna < 'a') {
			throw new IllegalArgumentException("ERROR: Columna no válida.");
		} else if (columna > 'h') {
			throw new IllegalArgumentException("ERROR: Columna no válida.");
		}
	}

	public Posicion(int fila, char columna) {
		setFila(fila);
		setColumna(columna);
	}
}