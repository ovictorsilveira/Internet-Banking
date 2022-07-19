package internet.banking.cliente.repository;

import internet.banking.cliente.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface clientRepository extends JpaRepository<Client,Long> {

}
