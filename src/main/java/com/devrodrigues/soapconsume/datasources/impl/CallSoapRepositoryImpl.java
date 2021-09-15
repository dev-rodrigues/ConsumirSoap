package com.devrodrigues.soapconsume.datasources.impl;

import com.devrodrigues.soapconsume.AddResponse;
import com.devrodrigues.soapconsume.datasources.soap.CalculeClient;
import com.devrodrigues.soapconsume.repositories.CallSoapRepository;
import org.springframework.stereotype.Repository;

@Repository
public class CallSoapRepositoryImpl implements CallSoapRepository {

    @Override
    public AddResponse calcule(int a, int b) {
        CalculeClient client = new CalculeClient();
        return client.call(a, b);
    }
}
