🏪 Sistema de Gerenciamento de Estoque

🚀 Projeto desenvolvido durante a faculdade, utilizando Java e PostgreSQL.

Este sistema permite o cadastro, atualização, remoção e listagem de produtos, ajudando na gestão de estoque de uma loja.

🛠️ Tecnologias Utilizadas
✔️ Java (JDK 17+)
✔️ PostgreSQL
✔️ JavaFX (Interface gráfica)
✔️ JDBC (Conexão com banco de dados)

📌 Funcionalidades
✅ Cadastro de produtos (nome, preço, quantidade, fornecedor)
✅ Atualização de informações dos produtos
✅ Exclusão de produtos do estoque
✅ Consulta de estoque em tempo real

🚀 Como Rodar o Projeto

1️⃣ Pré-requisitos
Antes de iniciar, instale os seguintes programas:

JDK 17+

PostgreSQL


2️⃣ Clonar o repositório
Abra o terminal e execute:

git clone https://github.com/JRALVESLIMA/projetoEscolar.git

Depois, entre na pasta do projeto:

cd projetoEscolar

3️⃣ Configurar o banco de dados

Crie o banco de dados no PostgreSQL rodando o seguinte comando:

CREATE DATABASE estoque_db;

Atualize os dados de conexão no código

No projeto, acesse o arquivo:

📂 src/main/java/com/loja/utils/Database.java

Substitua os valores de usuário e senha pelos seus dados do PostgreSQL:

private static final String USER = "seu_usuario";  // Coloque seu usuário do PostgreSQL

private static final String PASSWORD = "sua_senha";  // Coloque sua senha do PostgreSQL

Crie a tabela no banco de dados

No pgAdmin ou no terminal do PostgreSQL, execute o seguinte comando SQL:


CREATE TABLE produtos (
    
    id SERIAL PRIMARY KEY,
    
    nome VARCHAR(255) NOT NULL,
    
    preco DECIMAL(10,2) NOT NULL,
    
    quantidade INT NOT NULL,
    
    fornecedor VARCHAR(255)

);

4️⃣ Rodar o projeto

Abra o IntelliJ IDEA ou Eclipse

Importe o projeto caso ainda não esteja aberto

Verifique as dependências

Se estiver usando Maven, rode:

bash


mvn clean install

Execute a classe principal

Encontre o arquivo Main.java

Clique com o botão direito e selecione Run 'Main' ou simplesmente aperte Shift + F10 no IntelliJ.

Se tudo estiver correto, o sistema será executado e começará a interagir com o banco de dados! 🚀
