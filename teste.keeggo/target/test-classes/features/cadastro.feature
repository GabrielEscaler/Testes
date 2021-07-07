#language: pt
#Author: gabrielescaler@hotmail.com

@executa
Funcionalidade: Cadastrar cliente
  EU como usuario do sistema desejo realizar um cadastro para efetuar compras
  
  Fundo: Cadastrar no sistema de compras 
   Dado que eu esteja no site "http://advantageonlineshopping.com/#/"

 
   Cenario: Cadastrar um novo usuario    
    E acessar o menu do usuario para criar uma conta
    Quando preencher e enviar formulario de cadastro
    Entao Realizo cadastro com sucesso
   

 