package com.devrodrigues.soapconsume.repositories;

import com.devrodrigues.soapconsume.AddResponse;

public interface CallSoapRepository {

    AddResponse calcule(int a, int b);
}
