/**
 * Fecha de creación: 30/07/2010, 17:58:32
 *
 * Copyright (c) 2010 SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es información pueder ser mofificado, utilizado
 * haciendo referencia al autor intelectual.
 */

package com.synergyj.cursos.webservices.lab7;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

import com.synergyj.cursos.webservices.entidades.libreria.Libro;
import com.synergyj.cursos.webservices.entidades.libreria.TipoLibro;

/**
 * Este test case muestra el uso de XMLAdapters .
 * @author Jorge Rodríguez Campos (jorge.rodriguez@synergyj.com)
 * @version 1.0
 */
public class XmlJavaAdapterTestCase {

	/**
	 * Logger para todas las instancias de la clase
	 */
	private static final Logger logger = LoggerFactory.getLogger(XmlJavaAdapterTestCase.class);

	/**
	 * Este metodo probara el marshalles
	 */
	@Test
	public void testMarshaller() {
		Libro libro = new Libro();
		try {

			libro.setNombre("La bella durmiente");
			libro.setEditorial("Wrox");
			libro.setTipoLibro(TipoLibro.FABULA);

			JAXBContext jaxbContext = JAXBContext.newInstance(Libro.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
			Schema schema = sf.newSchema(new File("esquemas/libreria/libreria.xsd"));
			jaxbMarshaller.setSchema(schema);
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			jaxbMarshaller.marshal(libro, baos);
			Assert.assertNotNull(baos);
			logger.debug("xml generado:");
			logger.debug(new String(baos.toByteArray()));

			logger.debug("Realizando unmarshall");
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			unmarshaller.setSchema(schema);
			libro = (Libro) unmarshaller
					.unmarshal(new ByteArrayInputStream(baos.toByteArray()));
			logger.debug("Datos del libro: {}", libro);

		} catch (JAXBException e) {

			logger.debug("Error  al realizar el marshall", e);
			Assert.fail();

		} catch (SAXException e) {

			logger.debug("Error  al realizar el marshall", e);

		}
	}
}
