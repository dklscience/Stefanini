package tests;

import java.io.IOException;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.Formulario;
import pages.Metodos;

public class Steps {
	
	Metodos metodos = new Metodos();
	Formulario form = new Formulario();
	

@Dado("que eu esteja no formulario")
public void que_eu_esteja_no_formulario() {
	
	metodos.abrirBrownser("http://prova.stefanini-jgr.com.br/teste/qa/");
   
}

@Quando("eu preencher e enviar o formulario")
public void eu_preencher_e_enviar_o_formulario() throws IOException {
	form.preencherFormulario("Douglas Monteiro", "email@emeio.com.br", "12345678");
    
}

@Entao("sou cadastrado com sucesso")
public void sou_cadastrado_com_sucesso() {
	
	
	
	
metodos.validarCampo("Cadastro de usuários");
	
	
   
}






}
