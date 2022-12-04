package seleniumsessions;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {

	private WebDriver driver;

	/**
	 * this method is used to initialize the driver on the basis of browser name
	 * 
	 * @param browser
	 * @throws exception
	 */

	public WebDriver launchBrowser(String browser) {

		switch (browser.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
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
		return driver;

	}

	public void launchUrl(String url) throws Exception {

		if (url == null) {
			System.out.println("url is null");
			throw new Exception("URLISNULL");
		}

		if (url.length() == 0) {
			System.out.println("url is blank");
			throw new Exception("URLBLANKEXCEPTION");
		}

		// http(s) -- homework
		if (url.indexOf("http") != 0 && url.indexOf("https") != 0) {
			System.out.println("http(s) is missing in url");
			throw new Exception("missing http(s)");
		}

		driver.get(url);
	}

	public void launchUrl(URL url) throws Exception {

		String newURL = String.valueOf(url);

		if (newURL == null) {
			System.out.println("url is null");
			throw new Exception("URLISNULL");
		}

		if (newURL.length() == 0) {
			System.out.println("url is blank");
			throw new Exception("URLBLANKEXCEPTION");
		}

		// http(s) -- homework
		if (newURL.indexOf("http") != 0 || newURL.indexOf("https") != 0) {
			System.out.println("http(s) is missing in url1");
			throw new Exception("missing http(s)");
		}

		driver.navigate().to(url);
	}

	public String getPageTitle() {
		String title = driver.getTitle();
		System.out.println("page title : " + title);

		if (title != null) {
			return title;
		} else {
			System.out.println("getting null title...");
			return null;
		}

	}

	public String getPageUrl() {
		String url = driver.getCurrentUrl();
		System.out.println("page url : " + url);

		if (url != null) {
			return url;
		} else {
			System.out.println("getting null url...");
			return null;
		}

	}

	public void closeBrowser() {
		if (driver != null) {
			driver.close();
			System.out.println("browser is closed ..");
		}
	}

	public void quitBrowser() {
		if (driver != null) {
			driver.quit();
			System.out.println("browser is closed ..");
		}
	}
	
}
