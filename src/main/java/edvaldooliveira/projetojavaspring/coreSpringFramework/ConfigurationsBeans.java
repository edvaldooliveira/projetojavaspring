package edvaldooliveira.projetojavaspring.coreSpringFramework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationsBeans {

    @Bean(name = "aplicationNome")
    public String aplicationNome(){
        return "Beans são instâncias de classes que são gerenciadas por um Spring Ioc container.";
    }


}
