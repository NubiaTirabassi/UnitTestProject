# Projeto de Testes Unitários

Este repositório contém uma coleção de testes unitários para diferentes classes Java. Os testes são implementados usando o framework JUnit 5.

## Estrutura do Projeto

O projeto está estruturado da seguinte forma:

projeto-testes-unitarios
│
├── src
│ ├── main
│ │ └── java
│ │ └── com
│ │ └── empresa
│ │ ├── Calculadora.java
│ │ ├── TestAssertions.java
│ │ └── Usuario.java
│ └── test
│ └── java
│ └── com
│ └── empresa
│ ├── CalculadoraTest.java
│ ├── TestAssertionsTest.java
│ └── UsuarioTest.java
│
└
## Descrição dos Testes

### UsuarioTest

- `testeCriarUsuarioValido`: Testa a criação de um usuário válido com todas as informações corretas.
- `testNaoPermitirUsuarioSemNome`: Testa se é lançada uma exceção quando o nome do usuário é nulo.
- `testNaoPermitirUsuarioSemEmail`: Testa se é lançada uma exceção quando o email do usuário é nulo.
- `testNaoPermitirUsuarioSemSenha`: Testa se é lançada uma exceção quando a senha do usuário é nula.

### CalculadoraTest

- `testSoma`: Testa o método de soma da Calculadora.
- `testSubtrair`: Testa o método de subtração da Calculadora.
- `testSomar`: Testa novamente o método de soma da Calculadora com diferentes cenários.
- `testDividirValoresInteiroPositivosRetornaInteiro`: Testa a divisão de valores inteiros positivos.
- `testDividirValoresInteiroPositivosRetornaNegativo`: Testa a divisão de valores inteiros positivos retornando um número negativo.
- `testDividirValorInteiroPositivoRetornaFloat`: Testa a divisão de valores inteiros positivos retornando um float.
- `testDividirValorInteiroNegativoRetornaInteiro`: Testa a divisão de valores inteiros negativos.
- `testDividirValorInteiroPositivoRetornaInteiro`: Testa a divisão de valores inteiros positivos.

### TestAssertionsTest

- `testEqualsIgnoreCase`: Testa se duas strings são iguais ignorando a diferença entre maiúsculas e minúsculas.
- `testAssertFalse`: Testa se uma condição é falsa.
- `testAssertEquals`: Testa se dois valores são iguais.
- `testAssertNull`: Testa se um objeto é nulo.
- `testAssertSame`: Testa se dois objetos referem-se ao mesmo objeto.
- `testAssertNotSame`: Testa se dois objetos não referem-se ao mesmo objeto.
- `testAssertArrayEquals`: Testa se dois arrays são iguais.

Este projeto foi desenvolvido para demonstrar boas práticas na implementação de testes unitários em Java usando o JUnit 5. 



