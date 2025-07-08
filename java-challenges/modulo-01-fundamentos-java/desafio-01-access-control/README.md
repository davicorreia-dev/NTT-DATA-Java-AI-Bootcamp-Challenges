# 📚 Desafio: Controle de Acesso à Sala de Livros Raros

Uma biblioteca está implementando um sistema automatizado para liberar o acesso à área de **livros raros**. O sistema deve permitir a entrada **somente** para visitantes **autorizados** e com **idade mínima de 18 anos**.

## ✅ Objetivo

Desenvolver um programa que:
- Receba se o visitante possui autorização (`true` ou `false`)
- Receba a idade do visitante (número inteiro)
- Exiba mensagens de acordo com as regras de acesso

## 🔧 Requisitos Técnicos

- Uso de operadores lógicos (`&&`, `||`, `!`)
- Estruturas condicionais (`if`, `else if`, `else`)
- Tipos primitivos (`boolean`, `int`)
- Uso de `System.out.println()` para exibir a saída (se estiver em Java, por exemplo)

## 🎯 Regras de Negócio

O programa deve retornar:

| Condição                                   | Mensagem               |
|-------------------------------------------|------------------------|
| Autorizado e idade ≥ 18                   | `Acesso permitido`     |
| Não autorizado (independente da idade)    | `Acesso negado`        |
| Autorizado, mas idade < 18                | `Idade insuficiente`   |

---

## 💡 Exemplos de Entrada e Saída

| Entrada         | Saída               |
|----------------|---------------------|
| `true`, `20`    | Acesso permitido     |
| `false`, `25`   | Acesso negado        |
| `true`, `16`    | Idade insuficiente   |

---

