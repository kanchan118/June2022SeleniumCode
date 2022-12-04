package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QuitVsCloseSessionID {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kanch\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();// launch chrome browser
		driver.get("https://www.google.com");// enter url
		String title = driver.getTitle();// get the title
		System.out.println("page title: " + title);

		// close the browser
		// driver.quit();
		driver.close();
		// System.out.println(driver.getTitle());

		driver = new ChromeDriver();
		driver.get("https://www.google.com");// enter url
		System.out.println(driver.getTitle());
		// NoSuchSessionException: Session ID is null. Using WebDriver after calling
		// quit()?
		driver.quit();

	}

}