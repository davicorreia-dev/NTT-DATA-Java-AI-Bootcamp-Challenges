# 🛍️ Desafio: Rastreador de Gastos em E-commerce

Este desafio consiste no desenvolvimento de um sistema simples para registrar os valores das compras realizadas por um cliente ao longo de um único dia. A aplicação deve calcular o **total gasto** e a **média por compra**, considerando a entrada do número de compras e seus respectivos valores.

---

## 📋 Enunciado

Você está desenvolvendo um sistema para um **e-commerce** que deseja registrar os valores das compras realizadas por um cliente ao longo de um único dia. O sistema deve:

- Receber a quantidade total de compras realizadas (`N`)
- Solicitar o valor de cada uma das `N` compras
- Exibir o **total gasto no dia** com **duas casas decimais**
- Exibir a **média por compra** com **duas casas decimais**
- Se `N = 0`, exibir: `"Nenhuma compra registrada."`

---

## 📥 Entrada

- Um número inteiro `N`, representando a quantidade de compras realizadas.
- Em seguida, `N` números do tipo `double`, cada um representando o valor de uma compra.

---

## 📤 Saída

- O **total gasto** no dia com duas casas decimais
- A **média de valor por compra** com duas casas decimais
- Ou `"Nenhuma compra registrada."` caso `N` seja 0

---

## 💡 Exemplos

A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas.

| Entrada                        | Saída                         |
|-------------------------------|-------------------------------|
| `3`<br>`100.00`<br>`200.50`<br>`50.00` | `350.50`<br>`116.83`           |
| `1`<br>`79.90`                | `79.90`<br>`79.90`            |
| `0`                           | `Nenhuma compra registrada.`  |

