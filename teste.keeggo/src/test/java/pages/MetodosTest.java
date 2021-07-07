package pages;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class MetodosTest extends Browser {

	/**
	 * Método para clicar
	 * 
	 * @param elemento
	 * @author Gabriel Escaler
	 */
	public void clicar(By elemento) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.out.println("-------  error ao clicar no elemento  -------" + e.getMessage());
		}

	}

	/**
	 * Método para clicar por texto
	 * 
	 * @param tag
	 * @param texto
	 * @author Gabriel Escaler
	 */
	public void clicarPortexto(String tag, String texto) {
		try {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//" + tag + "[text()=\"" + texto + "\"]")).click();
		} catch (Exception e) {
			System.out.println("-------  error ao abrir clicar no elemento  -------" + e.getMessage());
		}

	}

	/**
	 * Método para escrever
	 * 
	 * @param elemento
	 * @param texto
	 * @author Gabriel Escaler
	 */
	public void escrever(By elemento, String texto) {
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.out.println("-------  error ao escrever no elemento  -------" + e.getMessage());
		}

	}

	/**
	 * Metodo para validar se dois textos são iguais
	 * 
	 * @param elemento
	 * @param textoEsperado
	 * @author Gabriel Escaler
	 */
	public void validarTexto(By elemento, String textoEsperado) {
		try {
			Thread.sleep(3000);
			String textoCapturado = driver.findElement(elemento).getText();
			assertEquals(textoEsperado, textoCapturado);
		} catch (Exception e) {
			System.err.println("-------- error ao validar texto -------" + e.getMessage());
		}

	}

	/**
	 * Método para tirar screenshot
	 * 
	 * @param nomeSrc
	 * @throws IOException
	 * @author Gabriel Escaler
	 */
	public void screenshot(String nomeSrc) throws IOException {
		try {
			TakesScreenshot srcShot = ((TakesScreenshot) driver);
			File srcFile = srcShot.getScreenshotAs(OutputType.FILE);
			File destFile = new File("./Evidencias/" + nomeSrc + ".png");
			FileUtils.copyFile(srcFile, destFile);
		} catch (Exception e) {
			System.out.println("----- error no screenShot -----" + e.getMessage());
		}

	}

	/**
	 * Método para fechar todas as abas
	 * 
	 * @author Gabriel Escaler
	 */
	public void fechar() {
		try {
			driver.quit();
		} catch (Exception e) {
			System.out.println("-------  error ao fechar todas as abas  -------" + e.getMessage());
		}

	}

	/**
	 * Gerador de nome e mais 3 letras
	 * 
	 * @return
	 * @author Gabriel Escaler
	 */
	public String getNome(String nome) {
		String geradorNome = RandomStringUtils.randomAlphabetic(3);
		return nome + geradorNome;

	}

	/**
	 * Gerador de email com Keego e mais 3 letras
	 * 
	 * @return
	 * @author Gabriel Escaler
	 */
	public String getEmail(String email) {
		String geradorEmail = RandomStringUtils.randomAlphabetic(3);
		return geradorEmail + "@keeggo.com";

	}

}
