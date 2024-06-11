import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContaBancaria {
    @Given("Um cliente especial com saldo atual de {int} reais")
    public void um_cliente_especial_com_saldo_atual_de_reais(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        System.out.print(int1);
        throw new io.cucumber.java.PendingException();
    }

    @When("for solicitado um saque no valor de {int} reais")
    public void for_solicitado_um_saque_no_valor_de_reais(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        System.out.print(int1);
        throw new io.cucumber.java.PendingException();
    }

    public void deve_efetuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        System.out.print(int1);
        throw new io.cucumber.java.PendingException();
    }
    @Then("check more outcomes")
    public void check_more_outcomes() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("deve efetuar o saque e atualizar o saldo da conta para {int} reais")
    public void deveEfetuarOSaqueEAtualizarOSaldoDaContaParaReais(int arg0) {
        System.out.print(arg0);
    }

    @Given("Um cliente comum com saldo atual de {int} reais")
    public void umClienteComumComSaldoAtualDeReais(int arg0) {
        System.out.print(arg0);
    }

    @When("Solicitar um saque de {int} reais")
    public void solicitarUmSaqueDeReais(int arg0) {
        System.out.print(arg0);
    }

    @Then("não deve efetuar o saque e deve retornar a mensagem Saldo Insuficiente")
    public void nãoDeveEfetuarOSaqueEDeveRetornarAMensagemSaldoInsuficiente() {
        System.out.println("Saldo Insuficiente");
    }
}
