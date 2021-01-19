package com.cencosudscotiabank.conversionxml1.conversionxml1.controllers;


import com.cencosudscotiabank.conversionxml1.conversionxml1.models.Client;
import com.cencosudscotiabank.conversionxml1.conversionxml1.repository.Client1Repository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/v1.0")
@Slf4j
public class SendFirstXMLController {

    @Autowired
    private Client1Repository client1Repository;

    @PostMapping(value="/requestxml1", produces = MediaType.APPLICATION_XML_VALUE)
    public Client requestxml(@RequestBody Client client){
        client1Repository.save(client);
        log.info("Llamada al servicio " + client.getIdtrx());
        return client;
        //return data();
    }


 /*   private Client data() {
        Client client = new Client();
        client.setIdcom(5678);
        client.setIdtrx("AFTR8CC95C09CC8D");
        client.setTotal(9900);
        client.setNropagos(1);
        client.getRequests().add(new Request("juanito",34,1000d));
        client.getRequests().add(new Request("juanito",34,5000d));
        client.getRequests().add(new Request("juanito",34,9000d));
        return client;
    }*/

}
