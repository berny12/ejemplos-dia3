/**
 * Fecha de creación: 18/02/2011 18:58:57
 *
 * Copyright (c) 2011 SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es información pueder ser mofificado, utilizado
 * haciendo referencia al autor intelectual.
 */
package com.synergyj.cursos.webservices.entidades.libreria;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * TODO [Descripcion de la clase]
 * @author Jorge Rodríguez Campos (jorge.rodriguez@synergyj.com)
 * @version 1.0
 */
public class TipoLibroAdapter extends XmlAdapter<JAXBTipoLibro, TipoLibro> {

	/**
	 * Logger para todas las instancias de la clase
	 */
	private static final Logger logger = LoggerFactory.getLogger(TipoLibroAdapter.class);

	/*
	 * (non-Javadoc)
	 * @see javax.xml.bind.annotation.adapters.XmlAdapter#marshal(java.lang.Object)
	 */
	@Override
	public JAXBTipoLibro marshal(TipoLibro tipoLibro) throws Exception {
		logger.debug("realizando mapeo para marshall");
		JAXBTipoLibro jaxbLibro = new JAXBTipoLibro();
		jaxbLibro.setTipoLibroID(tipoLibro.getId());
		return jaxbLibro;
	}

	/*
	 * (non-Javadoc)
	 * @see javax.xml.bind.annotation.adapters.XmlAdapter#unmarshal(java.lang.Object)
	 */
	@Override
	public TipoLibro unmarshal(JAXBTipoLibro jaxbTipoLibro) throws Exception {
		logger.debug("Realizando mapeo para unmarshall");
		TipoLibro tipoLibro;
		tipoLibro = TipoLibro.valueOf(jaxbTipoLibro.getTipoLibroID());
		return tipoLibro;
	}

}
