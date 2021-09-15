package com.devrodrigues.soapconsume.interactors;

import com.devrodrigues.soapconsume.repositories.CallSoapRepository;
import org.springframework.stereotype.Service;

@Service
public class CallSoapService {

    private final CallSoapRepository repository;

    public CallSoapService(CallSoapRepository repository) {
        this.repository = repository;
    }

    public int execute(int a, int b) {
        var response = repository.calcule(a, b);
        return response.getAddResult();
    }
}
