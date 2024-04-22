package edvaldooliveira.projetojavaspring.coreSpringFramework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootConfiguration
@RestController
public class HelloWordApplication {

    @Autowired
    @Qualifier("aplicationNome")
    private String aplicationNome;

    @GetMapping("/beans")
    public String aplicationNome(){
        return aplicationNome;
    }

}
