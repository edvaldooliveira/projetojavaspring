package edvaldooliveira.projetojavaspring.coreSpringFramework.injecaoDependencias.repository;

import edvaldooliveira.projetojavaspring.coreSpringFramework.injecaoDependencias.model.Cliente;
import org.springframework.stereotype.Repository;

@Repository
public class ClienteRepository {
    public void persistir(Cliente cliente){
        // acessa a base e salvar o cliente
    }
}
