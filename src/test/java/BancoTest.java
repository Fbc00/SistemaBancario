import banco.Cliente;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import banco.Banco;

import java.util.List;

public class BancoTest {


    @Test
    void criaBanco() {
        Banco banco = new Banco(1, "Banco do Brasil");
        assertEquals(banco.getId(), 1);
        assertEquals(banco.getNome(), "Banco do Brasil");
    }

    @Test
    void listServicos() {
        Banco banco = new Banco(1, "Banco do Brasil");
        assertEquals(banco.ListServicos(), List.of("Conta", "ContaPoupanca", "ContaCorrente", "CartaoCredito", "emprestimo"));
    }
}
