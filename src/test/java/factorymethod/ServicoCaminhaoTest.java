package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoCaminhaoTest {
    @Test
    void deveEnviarCaminhao() {
        IServico servico = ServicoFactory.obterServico("Caminhao");
        assertEquals("Caminhão enviado", servico.enivar());
    }

    @Test
    void deveRecolherCaminhao() {
        IServico servico = ServicoFactory.obterServico("Caminhao");
        assertEquals("Caminhão recolhido", servico.recolher());
    }

}