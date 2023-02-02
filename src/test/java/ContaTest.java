import Servicos.conta.Conta;
import Servicos.conta.ContaCorrente;
import Servicos.conta.ContaPoupanca;
import banco.Banco;
import banco.Cliente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ContaTest {

    @Test
    void criaConta() {
        Banco banco = new Banco(1, "Banco do Brasil");
        Cliente cliente = new Cliente("João", "123456789", "2002-12-03", "passsagem nazaré", banco.generateId());
        Conta conta = new Conta(1, cliente, banco);

        Assertions.assertEquals(conta.getTitular(), banco.getCliente(cliente.getId()));
    }
    @Test
    void criaContaPoupanca() {
        Banco banco = new Banco(1, "Banco do Brasil");
        Cliente cliente = new Cliente("João", "123456789", "2002-12-03", "passsagem nazaré", banco.generateId());
        Conta conta = new ContaPoupanca(1, cliente, banco);

        Assertions.assertEquals(conta.getTitular(), banco.getCliente(cliente.getId()));
        Assertions.assertTrue(conta instanceof Conta);
    }
    @Test
    void criaContaCorrenteEsaca() {
        Banco banco = new Banco(1, "Banco do Brasil");
        Cliente cliente = new Cliente("João", "123456789", "2002-12-03", "passsagem nazaré", banco.generateId());
        Conta conta = new ContaCorrente(1, cliente, banco);
        conta.sacar(200.0);

        Assertions.assertEquals(conta.getTitular(), banco.getCliente(cliente.getId()));
        Assertions.assertTrue(conta instanceof Conta);
        Assertions.assertEquals(conta.getSaldo(), -200.0);

    }

    @Test
    void  transferir() {
        Banco banco = new Banco(1, "Banco do Brasil");
        Cliente cliente = new Cliente("João", "123456789", "2002-12-03", "passsagem nazaré", banco.generateId());
        Cliente cliente2 = new Cliente("João", "987654321", "2002-12-03", "passsagem nazaré", banco.generateId());
        Conta conta = new ContaCorrente(1, cliente, banco);
        Conta conta2 = new ContaPoupanca(2, cliente2, banco);

        conta.transferir(200.0, conta2);


        Assertions.assertEquals(conta.getSaldo(), -200.0);
        Assertions.assertEquals(conta2.getSaldo(), 200.0);

    }
}
