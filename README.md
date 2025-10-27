# Sistema de Gerenciamento de Departamento e Folha de Pagamento

Este projeto em Java simula um sistema simples para gerenciar um departamento, seus funcionários e calcular a folha de pagamento total.

## Estrutura do Projeto

O projeto é estruturado em três pacotes principais:

*   `application`: Contém a classe principal (`Program.java`) com a lógica de execução e interação com o usuário.
*   `entities`: Contém as classes de modelo de domínio que representam as entidades do negócio: `Department`, `Employee` e `Address`.

## Funcionalidades Principais

1.  **Cadastro de Departamento:** Permite a entrada do nome do departamento, dia de pagamento e informações de contato (`Address`).
2.  **Cadastro de Funcionários:** Permite a entrada do nome e salário de um número variável de funcionários, adicionando-os ao departamento.
3.  **Cálculo da Folha de Pagamento:** O método `payroll()` na classe `Department` calcula a soma total dos salários de todos os funcionários.
4.  **Relatório Estático (`showReport`):** Implementa um método estático para exibir um relatório completo do departamento, conforme a regra de negócio.

## Modificações Recentes

Foram realizadas correções e implementações para atender a requisitos de estrutura de código e correção de *bugs* de entrada:

### 1. Correção de Leitura de Entrada (`Program.java`)

Foi corrigido um problema de *buffer* do `Scanner` que impedia a leitura correta do nome do funcionário. O método `sc.nextLine()` foi inserido após a leitura de valores numéricos (`sc.nextInt()` e `sc.nextDouble()`) para consumir a quebra de linha pendente, garantindo que o nome seja lido corretamente.

### 2. Implementação do Método Estático `showReport` (`Program.java`)

Conforme o critério de projeto, foi implementado o método estático `public static void showReport(Department department)` na classe `Program`. Este método recebe o objeto `Department` e é responsável por exibir o relatório completo da folha de pagamento, incluindo:

*   Nome do Departamento e Folha de Pagamento Total.
*   Dia de Pagamento.
*   Lista de Nomes dos Funcionários.
*   Informações de Contato para Dúvidas.

### 3. Remoção do `toString` Incorreto (`Department.java`)

O método `toString()` incorreto na classe `Department`, que exibia apenas o último nome do funcionário, foi removido para evitar confusão e garantir que a exibição do relatório seja feita exclusivamente pelo método `showReport`.

## Como Executar

1.  Clone o repositório.
2.  Compile as classes Java.
3.  Execute a classe `application.Program`.
4.  Siga as instruções no console para inserir os dados do departamento e dos funcionários.

---
*Desenvolvido por Manus AI*

