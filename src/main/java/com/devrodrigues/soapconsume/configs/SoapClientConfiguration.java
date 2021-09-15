package com.devrodrigues.soapconsume.configs;

import com.devrodrigues.soapconsume.datasources.soap.CalculeClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SoapClientConfiguration {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
        jaxb2Marshaller.setContextPath("com.devrodrigues.soapconsume");
        return jaxb2Marshaller;
    }

    @Bean
    public CalculeClient articleClient(Jaxb2Marshaller jaxb2Marshaller) {
        CalculeClient articleClient = new CalculeClient();
        articleClient.setDefaultUri("http://www.dneonline.com/calculator.asmx");
        articleClient.setMarshaller(jaxb2Marshaller);
        articleClient.setUnmarshaller(jaxb2Marshaller);
        return articleClient;
    }
}
