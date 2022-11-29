# LabShoppingList
LAB Supermarket

# Descrição

## 1 INTRODUÇÃO
A LAB Supermarket está contratando novos desenvolvedores para o seu quadro de colaboradores, com o intuito de expandir os negócios. Os gestores entendem que antes de finalizar as contratações, é necessário executar um desafio prático onde o futuro colaborador deverá criar o back-end de um sistema de lista de compras. É hora de ficar feliz, pois você foi escolhido para criar a API Rest do LabShoppingList.

## 2 REQUISITOS DA APLICAÇÃO

A aplicação que deverá ser realizada individualmente, deve contemplar os seguintes requisitos:

1.	Criação de modelo relacional

![ModeloRelacionalLabSupermarket](https://user-images.githubusercontent.com/102738744/204414358-10642214-db97-4547-a4f1-95e97ec96fa0.png)


2.	Utilização correta do GitHub e escrita do Readme.md
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
-	Utilização de Git com GitHub
-	Uso do banco de dados PostgreSQL
-	Criação de modelagem do banco de dados com Draw.io, DBDesigner ou ERD Tool do pgAdmin
-	Criação de documentação com Swagger

	Cadastro de categoria:
-	Não permitir cadastro duplicado
-	Não permitir cadastro com campos inválidos

Campos necessários:

*	Identificador da categoria: Único, autogerado
*	Nome da categoria: Única, tipo texto, preenchimento obrigatório
* Descrição da categoria: Tipo texto, preenchimento não obrigatório

	Listagem de categorias:
-	Listar todas as categorias cadastradas com seus respectivos campos

	Deleção de categoria:
-	Deletar uma categoria por identificador
-	Não permitir deleção caso a categoria esteja em uso

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
