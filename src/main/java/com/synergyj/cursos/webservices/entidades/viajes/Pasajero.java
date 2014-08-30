/**
 * Fecha de creación: 19/02/2011 11:25:08
 *
 * Copyright (c) 2011 SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es información pueder ser mofificado, utilizado
 * haciendo referencia al autor intelectual.
 */
package com.synergyj.cursos.webservices.entidades.viajes;

/**
 * TODO [Descripcion de la clase]
 * @author Jorge Rodríguez Campos (jorge.rodriguez@synergyj.com)
 * @version 1.0
 */
public class Pasajero {

	private long pasajeroID;

	private String nombre;

	private String apellidoPaterno;

	private String apellidoMaterno;

	private int edad;

	private String telefono;

	private String numeroIdentificacion;

	/**
	 * @return pasajeroID
	 */
	public long getPasajeroID() {
		return pasajeroID;
	}

	/**
	 * @param pasajeroID para inicializar el atributo pasajeroID
	 */
	public void setPasajeroID(long pasajeroID) {
		this.pasajeroID = pasajeroID;
	}

	/**
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre para inicializar el atributo nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return apellidoPaterno
	 */
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	/**
	 * @param apellidoPaterno para inicializar el atributo apellidoPaterno
	 */
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	/**
	 * @return apellidoMaterno
	 */
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	/**
	 * @param apellidoMaterno para inicializar el atributo apellidoMaterno
	 */
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	/**
	 * @return edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad para inicializar el atributo edad
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono para inicializar el atributo telefono
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return numeroIdentificacion
	 */
	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	/**
	 * @param numeroIdentificacion para inicializar el atributo numeroIdentificacion
	 */
	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

}
