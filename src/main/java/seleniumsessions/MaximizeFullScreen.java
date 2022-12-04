package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MaximizeFullScreen {

	public static void main(String[] args) throws Exception {

//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		// driver.manage().window().fullscreen();
		
		BrowserUtil brUtil = new BrowserUtil();
		
		brUtil.launchBrowser("chrome");
		brUtil.launchUrl("http://www.google.com");
		brUtil.closeBrowser();

	}

}
