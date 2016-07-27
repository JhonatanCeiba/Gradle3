package org.gradle;

/*
 * Class
 */
public class Sencilla {
	/*
	 * This is a  comment
	 */
	public String saludo;
	public String nombre;
	
	/**
	  * Class comment...
	  * @param saludo
	  * @param nombre
	  */
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
