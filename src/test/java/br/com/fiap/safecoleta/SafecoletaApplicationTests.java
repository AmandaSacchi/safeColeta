package br.com.fiap.safecoleta;

import br.com.fiap.safecoleta.service.AgendamentoColetaService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import br.com.fiap.safecoleta.repository.AgendamentoColetaRepository;
import br.com.fiap.safecoleta.repository.CaminhaoRepository;

@SpringBootTest
class SafecoletaApplicationTests {

    @MockBean
    private AgendamentoColetaRepository agendamentoColetaRepository;

    @MockBean
    private CaminhaoRepository caminhaoRepository;

    @Autowired
    private AgendamentoColetaService agendamentoColetaService;

}
