/**
 * Fecha de creación: 19/02/2011 11:26:23
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
public class ViajeDetalle {

	private long viajeDetalleID;

	private String numeroAsiento;

	private Pasajero pasajero;

	/**
	 * @return viajeDetalleID
	 */
	public long getViajeDetalleID() {
		return viajeDetalleID;
	}

	/**
	 * @param viajeDetalleID para inicializar el atributo viajeDetalleID
	 */
	public void setViajeDetalleID(long viajeDetalleID) {
		this.viajeDetalleID = viajeDetalleID;
	}

	/**
	 * @return pasajero
	 */
	public Pasajero getPasajero() {
		return pasajero;
	}

	/**
	 * @param pasajero para inicializar el atributo pasajero
	 */
	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}

	/**
	 * @return numeroAsiento
	 */
	public String getNumeroAsiento() {
		return numeroAsiento;
	}

	/**
	 * @param numeroAsiento para inicializar el atributo numeroAsiento
	 */
	public void setNumeroAsiento(String numeroAsiento) {
		this.numeroAsiento = numeroAsiento;
	}

}
