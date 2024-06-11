import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
/**
 Classe responsável por declarar e implementar os métodos sugeridos pelo Cucumber
 @author Felipe Elias RA 224475
 **/

public class ContaBancaria {

    /**
     * Step: Given Um cliente especial com saldo atual de {int} reais
     * @param int1 Saldo do cliente
     * @return saldo Ou cucumber.PendingExeption();
     */
    @Given("Um cliente especial com saldo atual de {int} reais")
    public void um_cliente_especial_com_saldo_atual_de_reais(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        System.out.print(int1);
        throw new io.cucumber.java.PendingException();
    }
    /**
     *Step: When for solicitado um saque no valor de {int} reais
     * @param int1 Valor solicitado
     * @return {boolean} retorna {true} se pode realizar o saque ou {false}
     * */
    @When("for solicitado um saque no valor de {int} reais")
    public void for_solicitado_um_saque_no_valor_de_reais(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        System.out.print(int1);
        throw new io.cucumber.java.PendingException();
    }

    /**
     *
     * @param int1 Valor solicitado
     * @return void
     * */
    public void deve_efetuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        System.out.print(int1);
        throw new io.cucumber.java.PendingException();
    }
    /**
     * Step: Then check more outcomes
    *  Checa outcomes
     */
    @Then("check more outcomes")
    public void check_more_outcomes() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    /**
     * Step: Then eve efetuar o saque e atualizar o saldo da conta para {int} reais
     * @param arg0 Valor do Saque
     */
    @Then("deve efetuar o saque e atualizar o saldo da conta para {int} reais")
    public void deveEfetuarOSaqueEAtualizarOSaldoDaContaParaReais(int arg0) {
    }


    /**
     * Step: Given Um cliente comum com saldo atual de {int} reais
     * @param arg0 Saldo
     */
    @Given("Um cliente comum com saldo atual de {int} reais")
    public void umClienteComumComSaldoAtualDeReais(int arg0) {

    }

    /**
     * Step: When Solicitar um saque de {int} reais
     * @param arg0 Saldo
     */
    @When("Solicitar um saque de {int} reais")
    public void solicitarUmSaqueDeReais(int arg0) {
    }

    /**
     * Step: Then não deve efetuar o saque e deve retornar a mensagem Saldo Insuficiente
     */
    @Then("não deve efetuar o saque e deve retornar a mensagem Saldo Insuficiente")
    public void nãoDeveEfetuarOSaqueEDeveRetornarAMensagemSaldoInsuficiente() {
        System.out.println("Saldo Insuficiente");
    }
}
