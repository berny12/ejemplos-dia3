/**
 * Fecha de creacion: 19/02/2011 11:20:51
 *
 * Copyright (c) 2011 SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es informacion pueder ser mofificado, utilizado
 * haciendo referencia al autor intelectual.
 */
package com.synergyj.cursos.webservices.entidades.viajes;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;


/**
 * TODO [Descripcion de la clase]
 * @author Jorge Rodriguez Campos (jorge.rodriguez@synergyj.com)
 * @version 1.0
 */
/*
 * agregamos la anotacion de root para esta clase in cambiar namespace
 */
//@XmlRootElement(name="ViajeJAXB")
//@XmlRootElement(name="ViajeJAXB" ,namespace="http://otronamespace.com/webservices")
/*
 * se quito el namspace para usar el de package-info
 */
@XmlRootElement(name="ViajeJAXB")
//para que solo acceses por field
@XmlAccessorType(XmlAccessType.FIELD)
public class Viaje {

	/*
	 * anotacion para que la propiedad no sea serializada en el xsd
	 */
	@XmlTransient
	private long viajeID;

	
	
	private Date fechaSalida;

	private Lugar origen;

	private Lugar destino;

	private MedioTransporte medioTransporte;

	private EstatusViaje estatus;
	
	/*
	 * agregamos una wrapper a la lista
	 */
	@XmlElementWrapper(name="lista")
	private List<ViajeDetalle> listaDetalle;
	
	/**
	 * @return viajeID
	 */
	public long getViajeID() {
		return viajeID;
	}

	/**
	 * @param viajeID para inicializar el atributo viajeID
	 */
	public void setViajeID(long viajeID) {
		this.viajeID = viajeID;
	}

	/**
	 * @return fechaSalida
	 */
	/*
	 * para declarar un elelemtno del nodo
	 */
	//@XmlElement(name="fechaProxima", required=true )
	public Date getFechaSalida() {
		return fechaSalida;
	}

	/**
	 * @param fechaSalida para inicializar el atributo fechaSalida
	 */
	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	/**
	 * @return origen
	 */
	public Lugar getOrigen() {
		return origen;
	}

	/**
	 * @param origen para inicializar el atributo origen
	 */
	public void setOrigen(Lugar origen) {
		this.origen = origen;
	}

	/**
	 * @return destino
	 */
	public Lugar getDestino() {
		return destino;
	}

	/**
	 * @param destino para inicializar el atributo destino
	 */
	public void setDestino(Lugar destino) {
		this.destino = destino;
	}

	/**
	 * @return medioTransporte
	 */
	public MedioTransporte getMedioTransporte() {
		return medioTransporte;
	}

	/**
	 * @param medioTransporte para inicializar el atributo medioTransporte
	 */
	public void setMedioTransporte(MedioTransporte medioTransporte) {
		this.medioTransporte = medioTransporte;
	}

	/**
	 * @return estatus
	 */
	public EstatusViaje getEstatus() {
		return estatus;
	}

	/**
	 * @param estatus para inicializar el atributo estatus
	 */
	public void setEstatus(EstatusViaje estatus) {
		this.estatus = estatus;
	}

	/**
	 * @return listaDetalle
	 */
	public List<ViajeDetalle> getListaDetalle() {
		return listaDetalle;
	}

	/**
	 * @param listaDetalle para inicializar el atributo listaDetalle
	 */
	public void setListaDetalle(List<ViajeDetalle> listaDetalle) {
		this.listaDetalle = listaDetalle;
	}
}
