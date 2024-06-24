<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Projeto TarefaM24">
    <meta name="keywords" content="Java, JUnit, Eclipse, Git, GitHub">
    <meta name="author" content="Ana Alice Rodrigues">

</head>
<body>

<header>
    <h1>Projeto TarefaM24</h1>
   
</header>

<details>
    <summary>Índice</summary>
    <ol>
        <li><a href="#sobre-o-projeto">Sobre o projeto</a></li>
        <li><a href="#parte-tecnica">Parte Técnica</a></li>
        <li><a href="#estrutura-dos-arquivos">Estrutura dos Arquivos</a></li>
        <li><a href="#casos-de-uso">Casos de Uso</a></li>
        <li><a href="#ferramentas">Ferramentas</a></li>
        <li><a href="#contato">Contato</a></li>
        <li><a href="#aprendizado">Aprendizado</a></li>
        <li><a href="#como-executar">Como Executar</a></li>
    </ol>
</details>

<section id="sobre-o-projeto">
    <h2>Sobre o projeto</h2>
    <p>
        Este projeto consiste em uma aplicação Java para gerenciar clientes. Foi desenvolvido como parte da atividade prática de um curso, focando na utilização de JUnit para testes unitários.
    </p>
</section>

<section id="parte-tecnica">
    <h2>Parte Técnica</h2>
    <ul>
        <li>Classe Cliente: Criação da classe <code>Cliente</code> com atributos <code>nome</code> e <code>email</code>, incluindo getters e setters.</li>
        <li>Testes Unitários: Implementação da classe <code>TesteCliente</code> para testar os métodos da classe <code>Cliente</code>.</li>
        <li>Configuração de Dependências: Configuração do JUnit 5 no build path do projeto e no arquivo <code>module-info.java</code>.</li>
        <li>Versionamento: Inicialização de um repositório Git local, criação de um repositório no GitHub e push do código para o GitHub.</li>
    </ul>
</section>

<section id="estrutura-dos-arquivos">
    <h2>Estrutura dos Arquivos</h2>
    <ul>
        <li>
            <pre>
TarefaM24/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── br/
│   │           └── com/
│   │               └── ana/
│   │                   └── model/
│   │                       └── Cliente.java
│   └── test/
│       └── java/
│           └── br/
│               └── com/
│                   └── ana/
│                       └── test/
│                           └── TesteCliente.java
└── module-info.java
            </pre>
        </li>
    </ul>
</section>

<section id="casos-de-uso">
    <h2>Casos de Uso</h2>
    <ul>
        <li>Gerenciamento de Clientes: Criação, atualização e recuperação de informações de clientes.</li>
        <li>Testes Unitários: Implementação de testes unitários utilizando JUnit 5 para validar as funcionalidades da classe <code>Cliente</code>.</li>
    </ul>
</section>

<section id="ferramentas">
    <h2>Ferramentas</h2>
    <ul>
        <li><img src="https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white" alt="Badge Java"></li>
        <li><img src="https://img.shields.io/badge/JUnit-25A162?style=for-the-badge&logo=junit5&logoColor=white" alt="Badge JUnit"></li>
        <li><img src="https://img.shields.io/badge/Eclipse-2C2255?style=for-the-badge&logo=eclipse&logoColor=white" alt="Badge Eclipse"></li>
        <li><img src="https://img.shields.io/badge/Git-E44C30?style=for-the-badge&logo=git&logoColor=white" alt="Badge Git"></li>
        <li><img src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white" alt="Badge GitHub"></li>
    </ul>
</section>

<section id="contato">
    <h2>Contato</h2>
    <ul>
        <li><a href="https://linktr.ee/anaeanali5" target="_blank"><img src="https://img.shields.io/badge/Ana_Alice_Rodrigues-blue?style=for-the-badge" alt="Perfil de Ana Alice Rodrigues"></a></li>
    </ul>
</section>

<section id="aprendizado">
    <h2>Aprendizado</h2>
    <p>Durante o desenvolvimento deste projeto, aprendi a:</p>
    <ul>
        <li>Utilizar a IDE Eclipse para desenvolver e organizar um projeto Java.</li>
        <li>Implementar testes unitários utilizando o JUnit 5, incluindo a configuração de dependências no Eclipse.</li>
        <li>Utilizar o sistema de controle de versão Git para versionar o código e colaborar com outros desenvolvedores.</li>
        <li>Configurar e utilizar o GitHub para hospedar projetos e compartilhar código com a comunidade.</li>
    </ul>
</section>

<section id="como-executar">
    <h2>Como Executar</h2>
    <ol>
        <li><strong>Clonar o Repositório:</strong>
            <p>Execute o comando abaixo no terminal:</p>
            <code>git clone https://github.com/seu-usuario/TarefaM24.git</code>
            <code>cd TarefaM24</code>
        </li>
        <li><strong>Importar o Projeto no Eclipse:</strong>
            <p>- Abra o Eclipse.</p>
            <p>- Vá em <em>File</em> > <em>Import...</em> > <em>Existing Projects into Workspace</em>.</p>
            <p>- Selecione o diretório do projeto clonado e importe.</p>
        </li>
        <li><strong>Executar os Testes:</strong>
            <p>- Clique com o botão direito no arquivo <em>TesteCliente.java</em> e selecione <em>Run As</em> > <em>JUnit Test</em>.</p>
        </li>
    </ol>
</section>

</body>
</html>
