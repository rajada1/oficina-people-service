package br.com.grupo99.peopleservice.application.service;

import br.com.grupo99.peopleservice.domain.model.Pessoa;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Serviço de publicação de eventos.
 * No ambiente Docker local, apenas loga os eventos sem enviar para fila.
 */
@Service
public class EventPublishingService {

    private static final Logger log = LoggerFactory.getLogger(EventPublishingService.class);

    public void publicarPessoaCriada(Pessoa pessoa) {
        log.info("Evento: Pessoa criada - ID: {}, Nome: {}", pessoa.getId(), pessoa.getName());
    }

    public void publicarPessoaAtualizada(Pessoa pessoa) {
        log.info("Evento: Pessoa atualizada - ID: {}, Nome: {}", pessoa.getId(), pessoa.getName());
    }

    public void publicarPessoaDeletada(Pessoa pessoa) {
        log.info("Evento: Pessoa deletada - ID: {}, Nome: {}", pessoa.getId(), pessoa.getName());
    }
}
