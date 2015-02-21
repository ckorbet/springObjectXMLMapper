package es.steria.springobjectxmlmapper.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import es.steria.springobjectxmlmapper.converters.Converter;

public class Application {

	private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

	public static void main(final String[] args) {

		final ConfigurableApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");

		final Converter converter = (Converter) context.getBean("converterBean");

		try {
			converter.saveCustomerInfo();
			converter.loadCustomerInfo();
		} catch (final Exception ioe) {
			LOGGER.error("", ioe);
		}
		context.close();
	}

}
