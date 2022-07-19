package internet.banking.cliente.http.controller;

import internet.banking.cliente.entity.Client;
import internet.banking.cliente.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Client salvar(@RequestBody Client client){
     return clientService.salvar(client);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Client> listClient(){
        return clientService.listClient();
    }
}
