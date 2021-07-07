package steps;

import java.io.IOException;

import elementos.Elementos;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.Browser;
import pages.HomePage;
import pages.Login;
import pages.MetodosTest;

public class LoginTest {
	
	Browser browser = new Browser();
	MetodosTest metodos = new MetodosTest();
	HomePage home = new HomePage();
	Login login = new Login();
	Elementos elementos = new Elementos();
	
	String nome;
	String email;

	@Dado("que eu esteja no sistema {string}")
	public void que_eu_esteja_no_sistema(String string) {
		
		browser.abrirNavegador(string);
		
	}

	@E("acessar o menu do usuario para fazer um login com dados invalidos")
	public void acessar_o_menu_do_usuario_para_fazer_um_login_com_dados_invalidos() {
		
		home.abrirMenu();
		
	}

	@Quando("preencher os campos de login com dados invalidos")
	public void preencher_os_campos_de_login_com_dados_invalidos() {
		
		login.preencherLogin("exemplo", "1230@1230");
		
		
	}

	@Entao("Não realizo login com sucesso")
	public void não_realizo_login_com_sucesso() throws IOException {
		
		metodos.validarTexto(elementos.getIncorretovalida(), "Incorrect user name or password.");
		metodos.screenshot("CT - Login dados invalidos");
		metodos.fechar();
	}

	@E("acessar o menu do usuario para fazer um login com dados em branco")
	public void acessar_o_menu_do_usuario_para_fazer_um_login_com_dados_em_branco() {
		
		home.abrirMenu();
		
	}

	@Quando("preencher os campos de login com dados em branco")
	public void preencher_os_campos_de_login_com_dados_em_branco() {
		
		login.preencherLogin("", "");
		
		
	}

	@Entao("Não realizo login")
	public void não_realizo_login() throws IOException {
		
		metodos.validarTexto(elementos.getNomebranco(), "Username field is required");
		metodos.screenshot("CT - Login em branco");
		metodos.fechar();
		
	}

	@E("acessar o menu do usuario para fazer um login com dados validos")
	public void acessar_o_menu_do_usuario_para_fazer_um_login_com_dados_validos() {
		
		home.abrirMenu();
		
	}

	@Quando("preencher os campos de login com dados validos")
	public void preencher_os_campos_de_login_com_dados_validos() {
		
		
		login.preencherLogin("GabAutomation", "Gabriel@7");
		
		
	}

	@Entao("Realizo login com sucesso")
	public void realizo_login_com_sucesso() throws IOException {
		
		metodos.validarTexto(elementos.getNomevalida(), "GabAutomation");
		metodos.screenshot("CT - Login valido");
		metodos.fechar();
		
	}

}
