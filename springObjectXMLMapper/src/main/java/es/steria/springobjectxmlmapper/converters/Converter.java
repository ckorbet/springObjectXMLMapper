package es.steria.springobjectxmlmapper.converters;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;

import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;

import es.steria.springobjectxmlmapper.beans.CustomerCompany;
import es.steria.springobjectxmlmapper.beans.CustomerInfo;

public class Converter implements Serializable {

	private static final Logger LOGGER = LoggerFactory.getLogger(Converter.class);

	private static final long serialVersionUID = 1L;

	private static final String FILE_NAME = "info.xml";

	private CustomerInfo info = new CustomerInfo();

	private Marshaller marshaller;
	private Unmarshaller unmarshaller;

	public final void setMarshaller(final Marshaller marshaller) {
		this.marshaller = marshaller;
	}

	public final void setUnmarshaller(final Unmarshaller unmarshaller) {
		this.unmarshaller = unmarshaller;
	}

	public final void saveCustomerInfo() throws IOException {
		FileOutputStream os = null;
		try {
			os = new FileOutputStream(FILE_NAME);
			info.setName("John");
			info.setId(234l);
			info.setValid(true);
			info.setCompany(new CustomerCompany("CUSTOMER COMPANY", 987564, Boolean.TRUE));
			LOGGER.info("Creado nuevo CustomerInfo");
			LOGGER.info("MARSHALLER: Haciendo marshalling de " + this.info.toString());
			this.marshaller.marshal(info, new StreamResult(os));
			LOGGER.info("MARSHALLER: Marshalling finalizado correctamente. Creado archivo info.xml desde objecto " + this.info.toString());
		} finally {
			if (os != null) {
				os.close();
			}
		}
	}

	public final void loadCustomerInfo() throws IOException {
		FileInputStream is = null;
		try {
			is = new FileInputStream(FILE_NAME);
			LOGGER.info("UNMARSHALLER: Haciendo unmarshalling de " + FILE_NAME);
			this.info = (CustomerInfo) this.unmarshaller.unmarshal(new StreamSource(is));
			LOGGER.info("UNMARSHALLER: Unmarshalling finalizado correctamente. Creado objeto " + this.info.toString() + " creado desde archivo info.xml");
		} finally {
			if (is != null) {
				is.close();
			}
		}
	}

}
