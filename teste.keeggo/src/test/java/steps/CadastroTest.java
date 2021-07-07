package steps;

import java.io.IOException;

import elementos.Elementos;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.Browser;
import pages.Cadastro;
import pages.HomePage;
import pages.MetodosTest;

public class CadastroTest {
	
	Browser browser = new Browser();
	MetodosTest metodos = new MetodosTest();
	HomePage home = new HomePage();
	Cadastro cad = new Cadastro();
	Elementos elementos = new Elementos();
	
	String nome;
	String email;
	
	@Dado("que eu esteja no site {string}")
	public void que_eu_esteja_no_site(String string) {
		
		browser.abrirNavegador(string);
	    
	}

	@E("acessar o menu do usuario para criar uma conta")
	public void acessar_o_menu_do_usuario_para_criar_uma_conta() {
	   
		home.abrirMenu();
		metodos.clicarPortexto("a", "CREATE NEW ACCOUNT");
		
	}

	@Quando("preencher e enviar formulario de cadastro")
	public void preencher_e_enviar_formulario_de_cadastro() throws IOException, InterruptedException {
	    
		this.nome = metodos.getNome("Keeggo");
		this.email = metodos.getEmail("@keeggo");
		cad.preencherCadastro(this.nome, this.email, "Gabriel@7", "Gabriel@7", "Gabriel", "Escaler", "11992263398", "Brazil", "São Paulo", "Rua Marcos Grotti Vidal", "SP", "03547-030");
		Thread.sleep(3000);
		metodos.clicar(elementos.getRegister());
	}

	@Entao("Realizo cadastro com sucesso")
	public void realizo_cadastro_com_sucesso() {
		
		metodos.validarTexto(elementos.getNomevalida(), this.nome);
	    metodos.fechar();
	}

}
