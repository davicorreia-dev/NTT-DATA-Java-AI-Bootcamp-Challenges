# Desafio: Correção de Código de E-commerce

Você está corrigindo o código de um sistema de e-commerce que calcula o valor final de um pedido, considerando desconto por cupom e cashback. O código atual está com erros de lógica e sintaxe, e sua missão é identificar e corrigir esses erros para garantir que os valores sejam calculados corretamente.

---

## 🧠 Regras de Negócio

- Se o cupom inserido for `"DESC10"`, aplicar **10% de desconto** sobre o valor dos produtos.
- Se o valor dos produtos **com desconto** for **maior ou igual a R$150**, o cliente recebe **R$15 de cashback**.
- O **valor final** do pedido é:  
  **valor com desconto - cashback**.

💡 Uma opção para te ajudar durante o processo de depuração é o uso do **GitHub Copilot**, que pode sugerir correções de código.

---

## 📥 Entrada

A entrada é composta por dois valores:

- `double productsValue`: valor total dos produtos comprados.  
- `String couponCode`: código do cupom inserido pelo cliente.

---

## 📤 Saída

Exibir o **valor final do pedido**, com **duas casas decimais**, e o **valor de cashback**, se houver.

---

## 🧪 Exemplos

A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas:

| Valor dos Produtos | Cupom    | Valor Final         | Cashback          |
|--------------------|----------|---------------------|-------------------|
| R$ 200.00          | DESC10   | R$ 165.00           | R$ 15.00          |
| R$ 120.00          | DESC10   | R$ 108.00           | R$ 0.00           |
| R$ 160.00          | NENHUM   | R$ 145.00           | R$ 15.00          |

---