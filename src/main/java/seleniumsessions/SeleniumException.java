package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumException {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/");

		// WE + Action
//
//		WebElement ele = driver.findElement(By.name("search11"));
//		ele.sendKeys("macbook pro");
		// NoSuchElementException
		// ElementNotFoundException -- not in selenium

//		List<WebElement> footerList = driver.findElements(By.xpath("//footer//naveen"));
//		System.out.println(footerList.size());
		// return empty list -- size --> 0

		List<WebElement> list = driver.findElements(By.name("search"));
		System.out.println(list.size());

		if (list.size() == 1) {
			System.out.println("search element is present in the page");
		} else {
			System.out.println("no search or multiple search present on the page");
		}

	}
	
	public static boolean isSingleElementPresent(By locator) {
		List<WebElement> list = driver.findElements(locator);
		System.out.println(list.size());

		if (list.size() == 1) {
			System.out.println("search element is present in the page");
			return true;
		} else {
			System.out.println("no search or multiple search present on the page");
			return false;
		}
		
	}

}
