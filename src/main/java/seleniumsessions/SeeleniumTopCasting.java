package seleniumsessions;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeeleniumTopCasting {

	public static void main(String[] args) {
		
		
		//1. chrome/FF/Safari/Edge
		//ChromeDriver driver = new ChromeDriver();
		
		//valid
		//2. 
		//run test cases locally
		//WebDriver driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		
		//3. valid but not useful
		//SearchContext driver = new ChromeDriver();
		//driver.findElement(null);
		
		//4. Valid and useful
		//RemoteWebDriver driver = new ChromeDriver();
		
		//5.  WD - RWD : valid and useful
		//to run test cases on remote machine -- cloud , server, grid, AWS
		//WebDriver driver = new RemoteWebDriver("https://192.190.10.11/wd/hub", capabilities);
		
		//6. SC -- RWD : valid not useful
		//SearchContext driver = new RemoteWebDriver(null, null);
		
		//7. Chromium -- Chrome : valid but not useful
		
		

	}

}
