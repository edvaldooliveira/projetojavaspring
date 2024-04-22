package edvaldooliveira.projetojavaspring.coreSpringFramework.helloWord;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootConfiguration
@RestController
public class HelloWordApplication {


    @GetMapping("/hello")
    public String helloWord(){
        return "Edvaldo Ferreira de Oliveira";
    }

}
