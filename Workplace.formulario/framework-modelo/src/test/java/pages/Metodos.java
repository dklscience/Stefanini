package pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;



public class Metodos extends Brownser {

	public void escrever(By elemento, String texto) {

		adriver().findElement(elemento).sendKeys(texto);
	}

	public void clicar(By elemento) {

		adriver().findElement(elemento).click();
	}

	public void screenshot(String nomeSrc) throws IOException {

	TakesScreenshot srcShot = ((TakesScreenshot)adriver());
	File scrFile = srcShot.getScreenshotAs(OutputType.FILE);
	File destFile = new File("./Evidencias/"+nomeSrc+".png");
	FileUtils.copyFile(scrFile, destFile);
		
	
	}
	
	public void validarCampo(String Title) {
		
		String paginaAtual = adriver().getTitle();
		
	}

}