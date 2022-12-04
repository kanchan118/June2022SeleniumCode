package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverBasics {

	public static void main(String[] args) {

		// open browser : chrome
		// launch url : google.com
		// get the title
		// verify the title : act vs exp
		// close the browser

		// download chromedriver.exe file - configure it

		// automation steps:
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kanch\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();// launch chrome browser
		driver.get("https://www.google.com");// enter url
		String title = driver.getTitle();// get the title
		System.out.println("page title: " + title);

		// verification point : act vs exp result //checkpoint

		if (title.equalsIgnoreCase("Google")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		String url = driver.getCurrentUrl();
		System.out.println(url);

		String source = driver.getPageSource();
		//System.out.println(source);

		if (source.contains("Copyright The Closure Library Authors")) {
			System.out.println("Pass");

		}
	
		//close the browser
		driver.quit();
		//driver.close();
		
	}

}
