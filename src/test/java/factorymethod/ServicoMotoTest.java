package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoMotoTest {
    @Test
    void deveEnviarMoto() {
        IServico servico = ServicoFactory.obterServico("Moto");
        assertEquals("Moto enviada", servico.enivar());
    }

    @Test
    void deveRecolherMoto() {
        IServico servico = ServicoFactory.obterServico("Moto");
        assertEquals("Moto recolhida", servico.recolher());
    }

}