# Branch de Testes 

Este projeto contém uma exemplificação das funcionalidades de Qualidade e Teste de Software,o repositório possui um conjunto de especificações para demonstrar as funções de Saque 
em um sistema de Caixa Eletrônico, utilizamos, Java, Maven e linguagem Gherkin para descrever os cenários de teste. As especificações foram elaboradas para serem utilizadas em testes automatizados.

# Funcionalidade: Cliente faz saque de dinheiro
Como um cliente, eu gostaria de sacar dinheiro em um caixa eletrônico, para que eu não tenha que esperar em uma fila do banco.

 ## Cenário 1: Cliente Especial com saldo negativo
    Scenario: Cliente especial com saldo negativo
    Given Um cliente especial com saldo atual de -200 reais
    When for solicitado um saque no valor de 100 reais
    Then deve efetuar o saque e atualizar o saldo da conta para -300 reais
    And check more outcomes
    
## Cenário 2: Cliente comum com saldo negativo
    Scenario Outline: Cliente comum com saldo negativo
    Given Um cliente comum com saldo atual de -200 reais
    When Solicitar um saque de 200 reais
    Then não deve efetuar o saque e deve retornar a mensagem Saldo Insuficiente
