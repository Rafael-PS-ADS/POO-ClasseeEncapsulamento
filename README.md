# 💦 PetMachine - Desafio de POO

Este projeto é uma simulação de uma máquina de banho de petshop feita em Java, utilizando os princípios da **Programação Orientada a Objetos (POO)**.

## 🐶 Descrição do desafio

Implemente um sistema que simula o funcionamento de uma **máquina de banho para pets**, com as seguintes operações:

- Dar banho no pet
- Abastecer com água
- Abastecer com shampoo
- Verificar nível de água
- Verificar nível de shampoo
- Verificar se há pet na máquina
- Colocar pet na máquina
- Retirar pet da máquina
- Limpar máquina

### 🧼 Regras da máquina

- A máquina permite apenas **1 pet por vez**.
- Cada banho consome **10 litros de água** e **2 litros de shampoo**.
- A capacidade máxima da máquina é de **30L de água** e **10L de shampoo**.
- Caso o pet seja retirado da máquina **sem estar limpo**, será necessário **limpar a máquina** antes de outro pet entrar.
- A limpeza consome **3 litros de água** e **1 litro de shampoo**.
- O abastecimento adiciona **2 litros por vez**.

## 🧱 Tecnologias usadas

- Java 17+
- Programação Orientada a Objetos
- Scanner para entrada de dados

## 📂 Organização do projeto

- `Pet.java`: classe que representa o pet.
- `PetMachine.java`: lógica da máquina de banho.
- `Menu.java`: interface de texto para interação com o usuário.

## 🚀 Como executar

Compile e execute com qualquer IDE Java ou via terminal:

```bash
javac Menu.java
java Menu
