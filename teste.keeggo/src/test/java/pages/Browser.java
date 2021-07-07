package pages;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	
	static WebDriver driver;
	
	 /* Abrir nevagador com o chrome
	 * 
	 * @author Gabriel Escaler
	 * @param site
	 */
	public void abrirNavegador(String site) {
		try {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(site);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		} catch (Exception e) {
			System.out.println("-------  error ao abrir navegador  -------" + e.getMessage());
		}
		System.out.println("--------- START TEST ----------");
	}

}
