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
    Scenario: Cliente comum com saldo negativo
    Given Um cliente comum com saldo atual de -200 reais
    When Solicitar um saque de 200 reais
    Then não deve efetuar o saque e deve retornar a mensagem Saldo Insuficiente
# Demonstração do Projeto
Antes de iniciar o cucumber nos Scenarios, criei préviamente a classe ContaBancaria, o que não ocasionou no erro de missing class
# Primeira Run
Cucumber pede para implementar os métodos e Steps que faltam na classe criada ContaBancaria
![step-missing](https://github.com/FelipeCherry3/af_bdd_FelipeElias_224475/assets/118016424/e454a820-0488-47d5-b03f-e29eac0d6d50)

# Implementação
![implementacao](https://github.com/FelipeCherry3/af_bdd_FelipeElias_224475/assets/118016424/50317a7e-35c1-4d66-8f55-db29dbd9cbea)

# Outros Prints
![skipp-step](https://github.com/FelipeCherry3/af_bdd_FelipeElias_224475/assets/118016424/fedbe75f-58e3-44de-845e-14af60341c94)
![steps-missing2](https://github.com/FelipeCherry3/af_bdd_FelipeElias_224475/assets/118016424/c5016a42-28d5-415e-9aa2-8e5b1fa4c8b1)
