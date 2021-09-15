package com.devrodrigues.soapconsume.transportLayers;

import com.devrodrigues.soapconsume.interactors.CallSoapService;
import com.devrodrigues.soapconsume.transportLayers.data.Body;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ApiTest {

    private final CallSoapService service;

    public ApiTest(CallSoapService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Integer> callSoap(@RequestBody Body body) {
        var response = service.execute(body.getA(), body.getB());

        return ResponseEntity.ok(response);
    }
}
