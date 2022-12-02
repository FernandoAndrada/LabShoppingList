# LabShoppingList
LAB Supermarket

# Descrição

## 1 INTRODUÇÃO
A LAB Supermarket está contratando novos desenvolvedores para o seu quadro de colaboradores, com o intuito de expandir os negócios. Os gestores entendem que antes de finalizar as contratações, é necessário executar um desafio prático onde o futuro colaborador deverá criar o back-end de um sistema de lista de compras. É hora de ficar feliz, pois você foi escolhido para criar a API Rest do LabShoppingList.

## 2 REQUISITOS DA APLICAÇÃO

A aplicação que deverá ser realizada individualmente, deve contemplar os seguintes requisitos:

1.	Criação de modelo relacional

![image](https://user-images.githubusercontent.com/102738744/205293637-6ebc64a2-a438-474e-b3a1-2c5520677221.png)



2.	Utilização correta do GitHub e escrita do Readme.md

![image](https://user-images.githubusercontent.com/102738744/205294410-d0c0a31d-7fa0-4473-beb2-45d671ee309d.png)


3.	Cadastro de categoria
4.	Listagem de categorias
5.	Deleção de categoria
6.	Cadastro de produto
7.	Listagem de produtos
8.	Edição de produto por identificador
9.	Deleção de um produto por identificador
10.	Listagem de valor total comprado
11.	Documentação de código

## 3 REQUISITOS DAS FUNCIONALIDADES
A aplicação realizada individualmente deverá seguir os requisitos apresentados à seguir.

Requisito geral da aplicação:

- ○	Utilização de Spring: Boot, MVC, Data
-	Criação de API Rest

![apiLabShoppingList](https://user-images.githubusercontent.com/102738744/205293743-30e29175-44cd-461c-8e2f-d39c67b09090.png)


-	Utilização de Git com GitHub
-	Uso do banco de dados PostgreSQL
-	Criação de modelagem do banco de dados com Draw.io, DBDesigner ou ERD Tool do pgAdmin
-	Criação de documentação com Swagger

![image](https://user-images.githubusercontent.com/102738744/205294937-cb105386-c987-4152-991a-949d66d4d3e9.png)


	Cadastro de categoria:
-	Não permitir cadastro duplicado
-	Não permitir cadastro com campos inválidos

Campos necessários:

*	Identificador da categoria: Único, autogerado
*	Nome da categoria: Única, tipo texto, preenchimento obrigatório
* Descrição da categoria: Tipo texto, preenchimento não obrigatório

	Listagem de categorias:
-	Listar todas as categorias cadastradas com seus respectivos campos

![image](https://user-images.githubusercontent.com/102738744/205295582-b9fc2f26-98b7-447a-8726-d5a34dd72b94.png)


	Deleção de categoria:
-	Deletar uma categoria por identificador
-	Não permitir deleção caso a categoria esteja em uso

![image](https://user-images.githubusercontent.com/102738744/205295222-455509f2-2b1f-4c5f-8e60-bdb29c554961.png)



  Cadastro de produto:
-	Não permitir cadastro duplicado
-	Não permitir cadastro com campos inválidos

	Campos necessários:
  
*	Identificador do produto: Único, autogerado
*	Identificador da categoria: Utilizar categoria válida e já criada
*	Nome do produto: Tipo texto, preenchimento obrigatório
*	Valor do produto: Tipo numérico, preenchimento obrigatório
*	Status do produto: Comprado ou não comprado

	Listagem de produtos:
  
-	Listar todos os produtos cadastrados com seus respectivos campos

*	Edição de produto:
- Editar as informações do produto por identificador
  
  Deleção de produto:

-Deletar um produto por identificador

	Listagem de valor total:
-	Listar o valor total comprado
-	Utilizar o status para calcular

	Documentação de código:
-	Documentar todos os endpoints criados utilizando Swagger 
