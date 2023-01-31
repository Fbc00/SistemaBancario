import banco.Banco;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestesBanco {

    @Test
    public void criaBanco() {
        Banco banco = new Banco(1, "Banco do Brasil");
        assertEquals(banco.getId(), 1);
        assertEquals(banco.getNome(), "Banco do Brasil");
    }
}
