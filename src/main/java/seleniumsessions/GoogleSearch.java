package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.google.co.in/");

//		driver.findElement(By.name("q")).sendKeys("selenium");
//		Thread.sleep(3000);
//		
//		List<WebElement> suggList = driver.findElements(By.xpath("//div[@class='pcTkSc']"));
//		System.out.println(suggList.size()-1);
//		
//		for(WebElement e : suggList) {
//			String text = e.getText();
//			System.out.println(text);
//			if(text.contains("selenium testing")) {
//				e.click();
//				break;
//			}
//		}
		By searchKey = By.name("q");
		By suggestions = By.xpath("//div[@class='pcTkSc']");
		googleSearch(searchKey, "selenium", suggestions, "selenium testing");
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static void googleSearch(By searchlLcator, String searchKey, By suggLocator, String value)
			throws InterruptedException {

		getElement(searchlLcator).sendKeys(searchKey);
		Thread.sleep(3000);

		List<WebElement> suggList = getElements(suggLocator);
		System.out.println(suggList.size() - 1);

		for (WebElement e : suggList) {
			String text = e.getText();
			System.out.println(text);
			if (text.contains(value)) {
				e.click();
				break;
			}
		}
	}

}
