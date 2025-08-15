## Atividade de Programação 2 (POO) – Cadastro e Cálculo de Impostos

*Data da atividade: 14/08/2025*
*Disciplina: Programação 2 (POO)*

**Descrição:**

Este projeto foi desenvolvido como uma atividade da disciplina de Programação 2. Ele utiliza os conceitos de **Programação Orientada a Objetos (POO)** para modelar contribuintes e calcular seus respectivos impostos.

### Funcionalidades

O sistema permite:

* **Cadastro de contribuintes** de dois tipos:
    * **Indivíduo:** Com nome, renda anual e gastos com saúde.
    * **Empresa:** Com nome, renda anual e número de funcionários.
* **Cálculo do imposto devido** por cada contribuinte, seguindo as regras fornecidas.

### Conceitos de POO Utilizados

* **Herança**
* **Polimorfismo**
* **Classes abstratas**

### Tecnologias

* Java (JDK 17+ recomendado)

### Estrutura do Projeto

```
src/
├─ entities/
│  ├─ TaxPayer.java        # Classe abstrata
│  ├─ Individual.java      # Subclasse de TaxPayer
│  └─ Company.java         # Subclasse de TaxPayer
└─ application/
└─ Main.java            # Classe principal para execução
```


### Como Executar

1.  **Clone o repositório:**
    ```bash
    git clone <URL-do-repositório>
    ```

2.  **Compile os arquivos Java:**
    ```bash
    javac src/entities/*.java src/application/Main.java
    ```

3.  **Execute o programa:**
    ```bash
    java -cp src application.Main
    ```
    Em seguida, siga as instruções no console para cadastrar os contribuintes e visualizar os impostos.

### Exemplo de Saída
```
Enter the number of tax payers: 2
Tax payer #1 data:
Individual or company (i/c)? i
Name: Maria
Anual income: 50000
Health expenditures: 2000
Tax payer #2 data:
Individual or company (i/c)? c
Name: EmpresaX
Anual income: 400000
Number of employees: 25

TAXES PAID:
Maria: $ 11500,00
EmpresaX: $ 56000,00

TOTAL TAXES: $ 67500,00
```


---

**Autor:** Felipe Gabriel
*Atividade referente à disciplina de Programação 2 (POO), 14/08/2025.*
