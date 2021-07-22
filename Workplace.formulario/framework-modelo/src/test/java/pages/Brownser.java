package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brownser {
 
	
	private static WebDriver driver;
	
	public static WebDriver adriver() {
		
		return driver;
	}
	
	public void abrirBrownser(String site) {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(site);
		driver.manage().window().maximize();
		
		
	}
	
	
}
