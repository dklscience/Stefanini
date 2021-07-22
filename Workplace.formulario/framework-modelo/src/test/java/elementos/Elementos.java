package elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	private By nome = By.id("name");
	private By email = By.id("email");
	private By msg = By.id("password");
	private By btnCadastrar = By.id("register");
	
	
	public By getNome() {
		return nome;
	}
	public By getEmail() {
		return email;
	}
	public By getMsg() {
		return msg;
	}
	public By getbtnCadastrar() {
		return btnCadastrar;
	}

}
