package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumTopCasting {

	public static void main(String[] args) {

		//1. Chrome/FF/Safari/Edge
		//valid
		//ChromeDriver driver = new ChromeDriver();
		
		//2. WD - CD
		//run test cases locally
		//WebDriver driver = new ChromeDriver();
		
//		driver = new FirefoxDriver();
//		driver = new SafariDriver();
//		driver = new EdgeDriver();
		
		//3. valid but not useful
		//SearchContext driver = new ChromeDriver();
		
		//4. valid and useful
		//RemoteWebDriver driver = new ChromeDriver();
		
		//5. WD - RWD : valid and useful
		//to run test cases on remote machine -- cloud, server, grid, AWS
		//WebDriver driver = new RemoteWebDriver(null);
		
		//6. SearchContext -- RWD: valid but not useful
		
		
		
		
		

	}

}
