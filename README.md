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

<div align="center">
<img src ="https://user-images.githubusercontent.com/102738744/205294410-d0c0a31d-7fa0-4473-beb2-45d671ee309d.png"  height="125" width="200">
</div>


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

<div align="center", background-shadow = "0px 0px 30px #737599">
<img src ="https://user-images.githubusercontent.com/102738744/205293743-30e29175-44cd-461c-8e2f-d39c67b09090.png" align="center" height="350" width="175">
</div>

-	Utilização de Git com GitHub

-	Uso do banco de dados PostgreSQL
-	Criação de modelagem do banco de dados com Draw.io, DBDesigner ou ERD Tool do pgAdmin
-	Criação de documentação com Swagger

<div align="center">
<img src ="https://user-images.githubusercontent.com/102738744/205294937-cb105386-c987-4152-991a-949d66d4d3e9.png"  height="350" width="190">
</div>

*	Cadastro de categoria:
-	Não permitir cadastro duplicado

<div align="center">
<img src ="https://user-images.githubusercontent.com/102738744/205304206-c1916458-9b3a-44bb-957b-5f5d905bf7a0.png"  height="350" width="380">
</div>

-	Não permitir cadastro com campos inválidos

Campos necessários:

*	Identificador da categoria: Único, autogerado
*	Nome da categoria: Única, tipo texto, preenchimento obrigatório
* Descrição da categoria: Tipo texto, preenchimento não obrigatório

	Listagem de categorias:
-	Listar todas as categorias cadastradas com seus respectivos campos

<div align="center">
<img src ="https://user-images.githubusercontent.com/102738744/205295582-b9fc2f26-98b7-447a-8726-d5a34dd72b94.png"  height="300" width="200">
</div>


-	Deleção de categoria:
-	Deletar uma categoria por identificador

<div align="center">
<img src ="https://user-images.githubusercontent.com/102738744/205307781-30190467-9868-49a5-839e-3dc3e927abf7.png"  height="300" width="380">
</div>

-	Não permitir deleção caso a categoria esteja em uso



  Cadastro de produto:
-	Não permitir cadastro duplicado

<div align="center">
<img src ="https://user-images.githubusercontent.com/102738744/205310164-f3ea9578-3719-44f7-87d9-47a242b9bce6.png"  height="380" width="380">
</div>


-	Não permitir cadastro com campos inválidos

	Campos necessários:
  
*	Identificador do produto: Único, autogerado
*	Identificador da categoria: Utilizar categoria válida e já criada
*	Nome do produto: Tipo texto, preenchimento obrigatório
*	Valor do produto: Tipo numérico, preenchimento obrigatório
*	Status do produto: Comprado ou não comprado


Listagem de valor total:


-	Listagem de produtos:
  
-	Listar todos os produtos cadastrados com seus respectivos campos

<div align="center">
<img src ="https://user-images.githubusercontent.com/102738744/205310164-f3ea9578-3719-44f7-87d9-47a242b9bce6.png"  height="380" width="380">
</div>

*	Edição de produto:
- Editar as informações do produto por identificador
  
* Deleção de produto:

-	Listar o valor total comprado
-	Utilizar o status para calcular


Deletar um produto por identificado


	Documentação de código:
-	Documentar todos os endpoints criados utilizando Swagger 

<div align="center">
<img src ="https://user-images.githubusercontent.com/102738744/205310369-37f41133-b9b6-4945-b409-b782613488ac.png"  height="450" width="300">
</div>
