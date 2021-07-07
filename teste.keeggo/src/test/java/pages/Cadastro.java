package pages;

import java.io.IOException;

import elementos.Elementos;

public class Cadastro {

	MetodosTest metodos = new MetodosTest();
	Elementos elementos = new Elementos();

	public void preencherCadastro(String username, String email, String senha, String confirmasenha, String name,
			String lastname, String number, String country, String city, String address, String state, String cep)
			throws IOException, InterruptedException {
		
		metodos.escrever(elementos.getUsername(), username);
		metodos.escrever(elementos.getEmail(), email);
		metodos.escrever(elementos.getSenha(), senha);
		metodos.escrever(elementos.getConfirmasenha(), confirmasenha);
		metodos.screenshot("CT - Cadastro");
		metodos.escrever(elementos.getName(), name);
		metodos.escrever(elementos.getLastname(), lastname);
		metodos.escrever(elementos.getNumber(), number);
		metodos.escrever(elementos.getCountry(), country);
		metodos.escrever(elementos.getCity(), city);
		metodos.escrever(elementos.getAddress(), address);
		metodos.escrever(elementos.getState(), state);
		metodos.escrever(elementos.getCep(), cep);
		metodos.clicar(elementos.getCondicoes());
		
		

	}

}
