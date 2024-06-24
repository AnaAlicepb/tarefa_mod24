package br.com.ana.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import br.com.ana.model.Cliente;

public class TesteCliente {

    @Test
    public void testaNomeCliente() {
        Cliente cliente = new Cliente("João", "joao@example.com");
        assertEquals("João", cliente.getNome());
    }
}
