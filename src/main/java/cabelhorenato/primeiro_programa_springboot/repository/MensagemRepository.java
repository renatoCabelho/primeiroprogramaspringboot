package cabelhorenato.primeiro_programa_springboot.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MensagemRepository {

    public String obterMensagem(){
        return "Olá do repositório";
    }

}
