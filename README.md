# Controle de Banhos - Petshop

Este projeto foi desenvolvido como parte do desafio do Bootcamp Santander 2025, com o objetivo de simular o controle de banhos em um petshop utilizando conceitos de Programação Orientada a Objetos em Java.

## Desafio Proposto

O desafio consistia em criar um sistema para gerenciar uma máquina de banhos de pets, implementando as seguintes operações:

- Dar banho no pet
- Abastecer a máquina com água
- Abastecer a máquina com shampoo
- Verificar nível de água
- Verificar nível de shampoo
- Verificar se há pet no banho
- Colocar pet na máquina
- Retirar pet da máquina
- Limpar a máquina

### Regras de Negócio

- A máquina de banho deve permitir somente **1 pet por vez**.
- Cada banho realizado consome **10 litros de água** e **2 litros de shampoo**.
- A máquina tem capacidade máxima de **30 litros de água** e **10 litros de shampoo**.
- Se o pet for retirado da máquina **sem estar limpo**, será necessário **limpar a máquina** para permitir a entrada de outro pet.
- A limpeza da máquina consome **3 litros de água** e **1 litro de shampoo**.
- O abastecimento de água e shampoo adiciona **2 litros por vez**.

## Minha Solução

Implementei o projeto utilizando três classes principais:

- **Pet**: representa o animal, com nome e estado de limpeza.
- **PetMachine**: representa a máquina de banho, controlando os níveis de água, shampoo, estado de limpeza e o pet presente.
- **App**: classe principal, responsável pelo menu interativo e pela integração das operações.

O menu permite ao usuário executar todas as operações do desafio, sempre respeitando as regras de negócio. O sistema impede, por exemplo, colocar um novo pet na máquina se ela estiver suja, ou realizar banho sem recursos suficientes.

### Fluxo de Uso

1. **Coloque um pet na máquina** informando o nome.
2. **Dê banho** no pet (consome recursos).
3. **Retire o pet** da máquina.
   - Se o pet não estiver limpo, será necessário limpar a máquina antes de colocar outro pet.
4. **Abasteça água ou shampoo** quando necessário.
5. **Limpe a máquina** para permitir a entrada de um novo pet, caso necessário.

### Observações

- O sistema informa sempre que uma operação não pode ser realizada, explicando o motivo (ex: falta de água, máquina suja, etc).
- O controle de recursos e estados é feito de forma rigorosa, simulando um cenário real de um petshop.

## Como Executar

1. Compile os arquivos Java presentes na pasta `src`:
   ```sh
   javac -d bin src/*.java
   ```
2. Execute o programa:
   ```sh
   java -cp bin App
   ```

## Considerações Finais

Este projeto foi uma excelente oportunidade para praticar abstração, encapsulamento e controle de fluxo em Java, além de simular um cenário prático do dia a dia de um petshop.

Gratidão pela oportunidade de participar do Bootcamp Santander 2025!
