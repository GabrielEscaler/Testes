package pages;

import elementos.Elementos;

public class HomePage {
	
	MetodosTest metodos = new MetodosTest();
	Elementos el = new Elementos();
	
	public void abrirMenu() {
		
		metodos.clicar(el.getMenu());
		
		
	}

}
