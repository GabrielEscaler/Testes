#language: pt
#Author: gabrielescaler@hotmail.com

@executa
Funcionalidade: Fazer login
  EU como usuario do sistema desejo realizar um login
  
  Fundo: Acessar o sistema de compras
   Dado que eu esteja no sistema "http://advantageonlineshopping.com/#/"

@executaNegativo1
   Cenario: Realizar login com dados invalidos    
    E acessar o menu do usuario para fazer um login com dados invalidos
    Quando preencher os campos de login com dados invalidos
    Entao Não realizo login com sucesso
 
 @executaNegativo2  
   Cenario: Realizar login com dados em branco
    E acessar o menu do usuario para fazer um login com dados em branco
    Quando preencher os campos de login com dados em branco
    Entao Não realizo login
 
 @executaPositivo  
    Cenario: Realizar login com dados validos
    E acessar o menu do usuario para fazer um login com dados validos
    Quando preencher os campos de login com dados validos
    Entao Realizo login com sucesso
    
    