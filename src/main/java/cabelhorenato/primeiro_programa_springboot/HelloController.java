package cabelhorenato.primeiro_programa_springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Olá Mundo! Bem Vindo ao SpringBoot";
    }

}
