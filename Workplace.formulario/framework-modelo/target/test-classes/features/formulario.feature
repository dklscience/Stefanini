#language: pt
#Author: douglas.monteiro

@executa
Funcionalidade: Validar formulario
  Eu como usuario quero enviar um formulario para realizar um cadastro

  
  Esquema do Cenario: Enviar formulario 
  
    Dado que eu esteja no formulario
    Quando eu preencher e enviar o formulario
    Entao sou cadastrado com sucesso

