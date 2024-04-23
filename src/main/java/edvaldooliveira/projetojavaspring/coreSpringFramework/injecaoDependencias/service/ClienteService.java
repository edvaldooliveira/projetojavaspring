package edvaldooliveira.projetojavaspring.coreSpringFramework.injecaoDependencias.service;

import edvaldooliveira.projetojavaspring.coreSpringFramework.injecaoDependencias.model.Cliente;
import edvaldooliveira.projetojavaspring.coreSpringFramework.injecaoDependencias.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    private ClienteRepository repository;

    @Autowired
    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public void salvarCliente(Cliente cliente){
       this.repository.persistir(cliente);
   }

  public void validarCliente(Cliente cliente){
        //validar cliente
  }



}
