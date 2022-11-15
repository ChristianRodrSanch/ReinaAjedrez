package org.iesalandalus.programacion.reinaajedrez.modelo;

public enum Color {
Blanco("blanco"),
Negro("Negro");
	private String cadenaAMostrar;

	private Color(String cadenaAMostrar) {
		this.cadenaAMostrar = cadenaAMostrar;
	}
	@Override
	public String toString() {
		return String.format("cadenaAMostrar=%s",cadenaAMostrar);
	}
	
	
}
