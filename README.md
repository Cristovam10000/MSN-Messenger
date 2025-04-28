📚 Projeto: Sistema de Mensagens Instantâneas
📋 Descrição
Este projeto simula o envio e recebimento de mensagens por diferentes aplicativos de mensagens instantâneas, como MSN Messenger, Facebook Messenger e Telegram.

Ele foi desenvolvido utilizando os pilares da Programação Orientada a Objetos (POO), destacando:

Encapsulamento (métodos protegidos como validarConectadoInternet e salvarHistoricoMensagem),

Abstração (classe abstrata ServicoMensagemInstantanea),

Herança (classes específicas como MSNMessenger, FacebookMessenger e Telegram),

Polimorfismo (uso de uma variável ServicoMensagemInstantanea para trabalhar com diferentes aplicativos).

O usuário digita qual aplicativo deseja utilizar, e o sistema realiza o envio e o recebimento de mensagens conforme a escolha.

🛠️ Estrutura de Pacotes e Classes
apps.ServicoMensagemInstantanea
Classe abstrata que define o contrato para envio e recebimento de mensagens, além de métodos utilitários protegidos.

apps.MSNMessenger, apps.FacebookMessenger, apps.Telegram
Classes concretas que implementam os comportamentos específicos de cada aplicativo.

apps.AppChossser
Classe responsável por capturar a escolha do usuário e retornar a instância correta do aplicativo.

ComputadorPedrinho
Classe principal (main) que inicializa o sistema, solicita a escolha do aplicativo e realiza a comunicação.

🚀 Como executar
Clone ou baixe o projeto.

Compile todos os arquivos .java.

Execute a classe ComputadorPedrinho.

Informe o aplicativo desejado no terminal:

msn para MSN Messenger

fbm para Facebook Messenger

tlg para Telegram

O sistema enviará e receberá mensagens conforme a escolha.

✨ Tecnologias usadas
Java 17+ (mas roda em qualquer Java 8+)

Padrões de projeto simples (como separação de responsabilidades)

Programação Orientada a Objetos pura

🧠 Conceitos aplicados
Encapsulamento:
Métodos que não devem ser expostos (validarConectadoInternet, salvarHistoricoMensagem) foram definidos como protected.

Abstração e Herança:
ServicoMensagemInstantanea abstrai o conceito de serviços de mensagens, e as classes concretas (MSNMessenger, FacebookMessenger, Telegram) herdam dela.

Polimorfismo:
ServicoMensagemInstantanea smi = new MSNMessenger(); permite usar diferentes apps no mesmo fluxo de execução, sem mudar o código que usa o objeto.

Separação de Responsabilidades:
A escolha do aplicativo (AppChossser) é isolada da lógica principal (ComputadorPedrinho).
