# 💰 Sistema Bancário em Java

Este projeto simula um **sistema bancário simples**, utilizando conceitos de orientação a objetos em Java. Ele permite a criação de **contas correntes** e **contas poupança**, com funcionalidades como **depósito, saque, transferência**, e impressão de **extratos bancários**.

## 📌 Funcionalidades

- ✅ Criação de clientes e contas bancárias
- ✅ Conta Corrente com limite de crédito (R$500 por padrão)
- ✅ Conta Poupança com operações tradicionais
- ✅ Saque, depósito e transferência entre contas
- ✅ Impressão de extrato com informações do cliente
- ✅ Banco contendo múltiplas contas

---

## 📦 Estrutura do Projeto

```

src/
├── Main.java               // Classe principal para testes
├── Banco.java              // Representa o banco e gerencia as contas
├── Cliente.java            // Representa o cliente da conta
├── Conta.java              // Classe abstrata base
├── ContaCorrente.java      // Implementa conta com limite
├── ContaPoupanca.java      // Implementa conta poupança tradicional

````

---

## 🛠️ Tecnologias Utilizadas

- **Java 17+**
- **Lombok** (para simplificar getters e setters)
- IDE recomendada: **IntelliJ IDEA** ou **Eclipse**

> 📌 Certifique-se de instalar o plugin do Lombok na sua IDE.

---

## 🚀 Como Executar

1. **Clone o repositório:**

```bash
git clone https://github.com/seu-usuario/sistema-bancario-java.git
cd sistema-bancario-java
````

2. **Abra o projeto em sua IDE Java favorita.**

3. **Execute a classe `Main.java`.**

---

## 🧪 Exemplo de Execução

```text
>>> Extrato inicial da Conta Corrente:
Extrato da Conta Corrente: 0.0
Saldo Limite: 500.0
Cliente: Rafael
----------------------

>>> Sacando R$100 da Conta Corrente:
Extrato da Conta Corrente: -100.0
Saldo Limite: 400.0

>>> Depositando R$600 na Conta Corrente:
Extrato da Conta Corrente: 500.0
Saldo Limite: 500.0

>>> Transferindo R$200 para Conta Poupança:
Transferência realizada com sucesso!

>>> Extrato final da Conta Poupança:
\\Extrato da Conta Poupança\\
Saldo: 200.0
Cliente: Rafael Poupanca
```

---

## 🤝 Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir **issues**, propor melhorias ou enviar **pull requests**.

---
