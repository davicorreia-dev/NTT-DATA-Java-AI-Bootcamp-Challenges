# 🛠️ Desafio: Depuração do Módulo de Processamento de Pedidos

Você está encarregado de **depurar** um módulo de processamento de pedidos em um sistema de vendas. O código atual contém **erros de lógica e de sintaxe**, e sua missão é **corrigi-los** para que as regras de negócio funcionem corretamente.

---

## 📋 Regras de Negócio

- Se o valor dos itens (`itemsValue`) for **maior ou igual a R$200**, o **frete deve ser gratuito**.
- Se for a **primeira compra** do cliente (`firstPurchase`), aplicar **5% de desconto** sobre o valor dos itens.
- O **valor final** do pedido é:  
  `valor com desconto + frete` (ou `+ 0`, se o frete for gratuito).

💡 Uma opção para te ajudar durante o processo de depuração é o uso do **GitHub Copilot**, que pode sugerir correções de código.

---

## 📥 Entrada

A entrada é composta por:

- `double itemsValue`: valor total dos produtos comprados.  
- `double shipping`: valor do frete.  
- `boolean firstPurchase`: se é a primeira compra do cliente.

---

## 📤 Saída

Exibir o **valor final do pedido**, com **duas casas decimais**, após aplicar as regras de **desconto e frete**.

---

## 🧪 Exemplos

A tabela abaixo apresenta exemplos de entrada e suas respectivas saídas esperadas. Teste seu programa com esses casos e outros cenários:

| Valor dos Itens | Frete | Primeira Compra | Valor Final |
|------------------|--------|------------------|--------------|
| R$ 250.00        | R$ 20.00 | false           | R$ 250.00    |
| R$ 210.00        | R$ 30.00 | true            | R$ 199.50    |
| R$ 100.00        | R$ 15.00 | false           | R$ 115.00    |

---

