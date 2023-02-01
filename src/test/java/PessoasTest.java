import Pessoas.Pessoa;
import banco.Cliente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoasTest {

    @Test
    void criaCliente() {
        Cliente cliente = new Cliente("João", "123456789", "2002-12-03", "passsagem nazaré", 1);
        Assertions.assertEquals(cliente.getNome(), "João");
    }

    @Test
    void clienteEpessoa() {
        Cliente cliente = new Cliente("João", "123456789", "2002-12-03", "passsagem nazaré", 1);
        Assertions.assertTrue(cliente instanceof Pessoa);
    }
}
