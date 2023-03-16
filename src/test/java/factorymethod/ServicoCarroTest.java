package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoCarroTest {

    @Test
    void deveEnviarCarro() {
        IServico servico = ServicoFactory.obterServico("Carro");
        assertEquals("Carro enviado", servico.enivar());
    }

    @Test
    void deveRecolherCarro() {
        IServico servico = ServicoFactory.obterServico("Carro");
        assertEquals("Carro recolhido", servico.recolher());
    }

}