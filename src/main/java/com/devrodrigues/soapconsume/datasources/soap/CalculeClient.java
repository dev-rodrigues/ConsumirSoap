package com.devrodrigues.soapconsume.datasources.soap;

import com.devrodrigues.soapconsume.Add;
import com.devrodrigues.soapconsume.AddResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class CalculeClient extends WebServiceGatewaySupport {

    public AddResponse call(int a, int b) {
        Add add = new Add();
        add.setIntA(a);
        add.setIntB(b);
        return (AddResponse) getWebServiceTemplate().marshalSendAndReceive(add);
    }
}
