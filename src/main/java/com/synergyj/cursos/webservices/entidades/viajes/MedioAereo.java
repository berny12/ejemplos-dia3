/**
 * Fecha de creación: 19/02/2011 11:23:28
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
public class MedioAereo extends MedioTerrestre {

	private String aerolinea;

	private int numeroAvion;

	private String claveAeropuertoSalida;

	private String claveAeropuertoLlegada;

	/**
	 * @return aerolinea
	 */
	public String getAerolinea() {
		return aerolinea;
	}

	/**
	 * @param aerolinea para inicializar el atributo aerolinea
	 */
	public void setAerolinea(String aerolinea) {
		this.aerolinea = aerolinea;
	}

	/**
	 * @return numeroAvion
	 */
	public int getNumeroAvion() {
		return numeroAvion;
	}

	/**
	 * @param numeroAvion para inicializar el atributo numeroAvion
	 */
	public void setNumeroAvion(int numeroAvion) {
		this.numeroAvion = numeroAvion;
	}

	/**
	 * @return claveAeropuertoSalida
	 */
	public String getClaveAeropuertoSalida() {
		return claveAeropuertoSalida;
	}

	/**
	 * @param claveAeropuertoSalida para inicializar el atributo claveAeropuertoSalida
	 */
	public void setClaveAeropuertoSalida(String claveAeropuertoSalida) {
		this.claveAeropuertoSalida = claveAeropuertoSalida;
	}

	/**
	 * @return claveAeropuertoLlegada
	 */
	public String getClaveAeropuertoLlegada() {
		return claveAeropuertoLlegada;
	}

	/**
	 * @param claveAeropuertoLlegada para inicializar el atributo claveAeropuertoLlegada
	 */
	public void setClaveAeropuertoLlegada(String claveAeropuertoLlegada) {
		this.claveAeropuertoLlegada = claveAeropuertoLlegada;
	}

}
