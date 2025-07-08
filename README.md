# Sistema de Gerenciamento de Reservas de Hotel em Java

Este projeto implementa um sistema básico para gerenciar reservas de quartos de hotel, utilizando os princípios da Programação Orientada a Objetos (POO) em Java.

## 🚀 Conceitos de POO Abordados

* **Herança:** Demonstra a criação de classes especializadas (`QuartoSimples`, `QuartoLuxo`) a partir de uma classe base abstrata (`Quarto`).
* **Abstração:** A classe `Quarto` é abstrata e define um contrato comum para os diferentes tipos de quartos, incluindo o método abstrato `dadosHotel()`.
* **Polimorfismo:** O método `calcularDiaria()` é implementado de forma diferente em `QuartoLuxo` (incluindo taxas extras) e `QuartoSimples`, e o método `dadosHotel()` também exibe informações específicas para cada tipo de quarto.
* **Encapsulamento:** Os atributos das classes são privados e acessados através de métodos `getters` e `setters`.
* **Composição/Agregação:** A classe `Reserva` "tem um" `Quarto`, e a classe `GerenciadorReservas` "tem uma lista de" `Reserva`, mostrando como objetos podem ser construídos a partir de outros.
* **API de Data e Hora (`java.time`):** Utilização da API moderna de datas para calcular a duração das reservas.

## 📂 Estrutura do Projeto

O projeto está organizado no pacote `lista04.exercicio03` e inclui as seguintes classes:

* `Quarto.java`: Classe abstrata base para os quartos do hotel, com atributos e métodos comuns.
* `QuartoSimples.java`: Estende `Quarto`, representa um quarto simples.
* `QuartoLuxo.java`: Estende `Quarto`, representa um quarto de luxo com taxas extras.
* `Reserva.java`: Gerencia os detalhes de uma reserva, incluindo o quarto, datas de entrada e saída, e calcula o valor total.
* `GerenciadorReservas.java`: Classe que gerencia uma coleção de reservas, permitindo adicionar, cancelar e listar reservas.
* `Aplicativo.java`: Classe principal com o método `main` para demonstrar a funcionalidade do sistema.

## 🛠️ Como Compilar e Rodar

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/SeuUsuario/HotelReservationSystemJava.git](https://github.com/SeuUsuario/HotelReservationSystemJava.git)
    ```
2.  **Navegue até o diretório do projeto:**
    ```bash
    cd HotelReservationSystemJava
    ```
3.  **Compile os arquivos Java:**
    A partir da raiz do projeto (`HotelReservationSystemJava/`), execute:
    ```bash
    javac src/lista04/exercicio03/*.java -d out
    ```
    (Este comando compila todos os arquivos `.java` dentro do pacote e os coloca no diretório `out`).
4.  **Execute a aplicação:**
    ```bash
    java -cp out lista04.exercicio03.Aplicativo
    ```

## 📄 Exemplo de Saída

Ao executar o `Aplicativo.java`, você verá uma saída similar a esta no console:

Quarto Simples Numero: 101 Capacidade: 2 pessoas Valor da diária: 150.0 Data de entrada: 2025-07-10 Data de saída: 2025-07-13 Total de dias: 3 Valor total da reserva: R$ 450,00
Quarto Luxo Numero: 201 Capacidade: 3 pessoas Valor da diária: 325.0 Data de entrada: 2025-07-15 Data de saída: 2025-07-18 Total de dias: 3 Valor total da reserva: R$ 975,00
![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white)
