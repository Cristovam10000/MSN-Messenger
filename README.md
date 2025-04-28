# 📚 Projeto: Sistema de Mensagens Instantâneas

## 📋 Descrição
Este projeto simula o envio e recebimento de mensagens por diferentes aplicativos de mensagens instantâneas, como **MSN Messenger**, **Facebook Messenger** e **Telegram**.

Ele foi desenvolvido utilizando os pilares da **Programação Orientada a Objetos (POO)**, destacando:

- **Encapsulamento** (métodos protegidos como `validarConectadoInternet` e `salvarHistoricoMensagem`)
- **Abstração** (classe abstrata `ServicoMensagemInstantanea`)
- **Herança** (classes específicas como `MSNMessenger`, `FacebookMessenger` e `Telegram`)
- **Polimorfismo** (uso de uma variável `ServicoMensagemInstantanea` para trabalhar com diferentes aplicativos)

O usuário digita qual aplicativo deseja utilizar, e o sistema realiza o envio e o recebimento de mensagens conforme a escolha.

---

## 🛠️ Estrutura de Pacotes e Classes

- **apps.ServicoMensagemInstantanea**  
  Classe abstrata que define o contrato para envio e recebimento de mensagens, além de métodos utilitários protegidos.

- **apps.MSNMessenger**, **apps.FacebookMessenger**, **apps.Telegram**  
  Classes concretas que implementam os comportamentos específicos de cada aplicativo.

- **apps.AppChooser**  
  Classe responsável por capturar a escolha do usuário e retornar a instância correta do aplicativo.

- **ComputadorPedrinho**  
  Classe principal (`main`) que inicializa o sistema, solicita a escolha do aplicativo e realiza a comunicação.

---

## 🚀 Como Executar

1. Clone ou baixe o projeto.
2. Compile todos os arquivos `.java`.
3. Execute a classe `ComputadorPedrinho`.
4. Informe o aplicativo desejado no terminal:

```bash
msn  → para MSN Messenger
fbm  → para Facebook Messenger
tlg  → para Telegram
