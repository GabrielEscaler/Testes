package elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	
	private By username = By.name("usernameRegisterPage");
	private By email = By.name("emailRegisterPage");
	private By senha = By.name("passwordRegisterPage");
	private By confirmasenha = By.name("confirm_passwordRegisterPage");
	private By name = By.name("first_nameRegisterPage");
	private By lastname = By.name("last_nameRegisterPage");
	private By number = By.name("phone_numberRegisterPage");
	private By country = By.name("countryListboxRegisterPage");
	private By city = By.name("cityRegisterPage");
	private By address = By.name("addressRegisterPage");
	private By state = By.name("state_/_province_/_regionRegisterPage");
	private By cep = By.name("postal_codeRegisterPage");
	private By condicoes = By.name("i_agree");
	private By register = By.id("register_btnundefined");
	private By namelogin = By.name("username");
	private By senhalogin = By.name("password");
	private By entrar = By.id("sign_in_btnundefined");
	private By menu = By.id("menuUser");
	private By nomevalida = By.cssSelector("#menuUserLink > span");
	private By incorretovalida = By.cssSelector("#signInResultMessage");
	private By nomebranco = By.cssSelector("body > login-modal > div > div > div.login.ng-scope > sec-form > sec-view:nth-child(1) > div > label");
	
	public By getUsername() {
		return username;
	}
	public By getEmail() {
		return email;
	}
	public By getSenha() {
		return senha;
	}
	public By getConfirmasenha() {
		return confirmasenha;
	}
	public By getName() {
		return name;
	}
	public By getLastname() {
		return lastname;
	}
	public By getNumber() {
		return number;
	}
	public By getCountry() {
		return country;
	}
	public By getCity() {
		return city;
	}
	public By getAddress() {
		return address;
	}
	public By getState() {
		return state;
	}
	public By getCep() {
		return cep;
	}
	public By getCondicoes() {
		return condicoes;
	}
	public By getRegister() {
		return register;
	}
	public By getNamelogin() {
		return namelogin;
	}
	public By getSenhalogin() {
		return senhalogin;
	}
	public By getEntrar() {
		return entrar;
	}
	public By getMenu() {
		return menu;
	}
	public By getNomevalida() {
		return nomevalida;
	}
	public By getIncorretovalida() {
		return incorretovalida;
	}
	public By getNomebranco() {
		return nomebranco;
	}
	
	
	
	

}
