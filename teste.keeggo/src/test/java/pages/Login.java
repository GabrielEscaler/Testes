package pages;

import elementos.Elementos;

public class Login {

	MetodosTest metodos = new MetodosTest();
	Elementos elementos = new Elementos();

	public void preencherLogin(String name, String password) {

		metodos.escrever(elementos.getNamelogin(), name);
		metodos.escrever(elementos.getSenhalogin(), password);
		metodos.clicar(elementos.getEntrar());

	}

}
