package com.iampfac.hth.spring.mvc.xml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.xml.MarshallingHttpMessageConverter;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
public class WebAppConfigurer extends WebMvcConfigurerAdapter {

	private MarshallingHttpMessageConverter xmlConverter;

	@Bean
	public Marshaller xmlMarshaller() {
		final Jaxb2Marshaller bean = new Jaxb2Marshaller();
		bean.setPackagesToScan("com.iampfac.hth.spring.mvc.xml");
		return bean;
	}

	@Bean
	public MarshallingHttpMessageConverter xmlConverter(
			final Marshaller xmlMarshaller) {
		return new MarshallingHttpMessageConverter(xmlMarshaller);
	}

	@Override
	public void configureMessageConverters(
			List<HttpMessageConverter<?>> converters) {
		converters.add(xmlConverter);
	}

	@Autowired
	public void setXmlConverter(
			final MarshallingHttpMessageConverter xmlConverter) {
		this.xmlConverter = xmlConverter;
	}

}
