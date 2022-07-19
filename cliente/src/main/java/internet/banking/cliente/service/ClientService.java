package internet.banking.cliente.service;
import internet.banking.cliente.entity.Client;
import internet.banking.cliente.repository.clientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private clientRepository clientRepository;

    public Client salvar(Client client){
        return clientRepository.save(client);
    }

    public List<Client> listClient(){
        return clientRepository.findAll();
    }


}
