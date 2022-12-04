package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowser {

	static WebDriver driver;

	public static void main(String[] args) {

		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\kanch\\Downloads\\chromedriver_win32\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver();//launch chrome browser

		// cross browser logic:

		String browser = "chrome";

		switch (browser.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\kanch\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			break;

		case "firefox":
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\kanch\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			
			break;

		default:
			System.out.println("provide valid browser name");
			break;
		}

		driver.get("https://www.google.com");// enter url
		String title = driver.getTitle();// get the title
		System.out.println("page title: " + title);

		String url = driver.getCurrentUrl();
		System.out.println(url);

		// close the browser:
		driver.quit();

	}

}
