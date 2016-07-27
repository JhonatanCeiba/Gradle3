package org.gradle;

/*
 * Class
 */
public class Sencilla {
	public String saludo;
	public String nombre;
	
	public Sencilla (String saludo, String nombre)
	{
		this.setNombre(nombre);
		this.setSaludo(saludo);
	}

	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
