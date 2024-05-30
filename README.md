## Uso

 consiste nas seguintes classes e funcionalidades:

- **EmailController**: Este é o controlador responsável pelo envio de e-mails com diferentes opções. Você pode enviar e-mails simples, e-mails com anexos, e-mails com imagens e e-mails para múltiplos destinatários.
- **EmailTemplateController**: Este controlador é responsável pela criação e gerenciamento de templates de e-mail. Você também pode enviar e-mails utilizando esses templates.
- **EmailService**: Este é o serviço que implementa a lógica de envio de e-mails.
- **EmailTemplateService**: Este serviço implementa a lógica de criação, armazenamento e recuperação de templates de e-mail.
- EmailSenderAppApplication: Classe principal que inicializa a aplicação Spring Boot.

## Funcionalidades

- **Enviar E-mail Simples**: Esta funcionalidade permite o envio de um e-mail simples com destinatário, assunto e corpo do e-mail.
- **Enviar E-mail com Anexo**: Esta funcionalidade permite o envio de um e-mail com um arquivo anexado.
- **Enviar E-mail com Imagem**: Esta funcionalidade permite o envio de um e-mail com uma imagem incorporada.
- **Enviar E-mails para Múltiplos Destinatários**: Esta funcionalidade permite o envio de um e-mail para vários destinatários ao mesmo tempo.
- **Criar Template de E-mail**: Esta funcionalidade permite a criação e armazenamento de templates de e-mail.
- **Recuperar Template de E-mail**: Esta funcionalidade permite a recuperação de um template de e-mail armazenado.
- **Enviar E-mail com Template**: Esta funcionalidade permite o envio de um e-mail utilizando um template previamente criado.

## Como Usar

### Construção do Projeto

Execute o comando de construção do Maven (`mvn package`) para gerar o arquivo JAR. O Maven irá compilar seu código, resolver dependências e criar o arquivo JAR de acordo com a configuração especificada no arquivo `pom.xml`.

## Instruções de Inicialização

Para iniciar a aplicação, utilize a classe `EmailSenderAppApplication`. Esta classe é a responsável por disparar a aplicação Spring Boot.

## Configuração do Serviço de E-mail e Templates

Para configurar o serviço de e-mail e templates, você precisa implementar a lógica de envio de e-mails e a lógica de templates.

1. **EmailService**: Neste serviço, implemente a lógica de envio de e-mails conforme as necessidades de sua aplicação.
2. **EmailTemplateService**: Neste serviço, implemente a lógica de criação, armazenamento e recuperação de templates de e-mail conforme as necessidades de sua aplicação.

Essas implementações são vitais para o funcionamento correto do aplicativo e devem ser ajustadas de acordo com suas necessidades específicas.

# Guia de Utilização do EmailController e EmailTemplateController

Para enviar e-mails de diferentes tipos e utilizar templates, siga as seguintes instruções:

## Enviar E-mails

1. Utilize o `EmailController`. Este controlador tem vários métodos disponíveis que permitem o envio de diferentes tipos de e-mails.

## Criação e Envio de E-mails Utilizando Templates

1. Utilize o `EmailTemplateController`. Este controlador disponibiliza métodos que permitem a criação e o envio de e-mails utilizando templates previamente criados.

EXEMPLOS DE USO:![Exemplo 2](https://github.com/Componente-para-envio-de-emails/aplicacao/assets/94656946/2ca4199a-8811-40e6-a124-948ea3eb8384)
![Exemplo 3](https://github.com/Componente-para-envio-de-emails/aplicacao/assets/94656946/ddbb177b-fd7c-4f46-9fe6-112a69ecbfcf)
![Exemplo 4](https://github.com/Componente-para-envio-de-emails/aplicacao/assets/94656946/e94ca7f7-8936-4c00-a656-62a9fbbfc6fc)
![Exemplo 1](https://github.com/Componente-para-envio-de-emails/aplicacao/assets/94656946/2b41c1fa-d3c9-4550-9801-466009fe590b)
