package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver",
				//"C:\\Users\\kanch\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();				
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");

		System.out.println(driver.getTitle());
		
		driver.quit();

	}

}
