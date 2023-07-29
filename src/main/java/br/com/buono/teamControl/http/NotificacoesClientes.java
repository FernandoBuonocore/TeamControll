package br.com.buono.teamControl.http;

import br.com.buono.teamControl.dto.ClientDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/notification", produces = "application/json")
public class NotificacoesClientes {

    @Value("${project.name}")
    private String valueApplication;

    @GetMapping("/findClients")
    public void findClients(ClientDto clientDto){
        System.out.println(valueApplication);
    }

}
