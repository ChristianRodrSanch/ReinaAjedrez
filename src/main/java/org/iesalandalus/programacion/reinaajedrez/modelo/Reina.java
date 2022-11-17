package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Reina {
private Color color;
private Posicion posicion;
public Color getColor() {
	return color;
}
public void setColor(Color color) {
	this.color = color;
}
public Posicion getPosicion() {
	return posicion;
}
public void setPosicion(Posicion posicion) {
	this.posicion = posicion;
}
public Reina () {
	setColor (Color.BLANCO);
	this.posicion = new Posicion(1,'d');
}
	
}
