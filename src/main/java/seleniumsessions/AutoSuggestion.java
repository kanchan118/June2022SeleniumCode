package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestion {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");

		driver.findElement(By.id("search_query_top")).sendKeys("dress");
		Thread.sleep(4000);

// 		List<WebElement> searchSuggList = driver.findElements(By.xpath("//div[@class='ac_results']//li"));

//		for (WebElement e : searchSuggList) {
//			String text = e.getText();
//			System.out.println(text);
//			if (text.contains("Printed Dress")) {
//				e.click();
//				break;
//			}
//		}

//		driver.findElement(By.xpath("//li[text()='Casual Dresses > Printed ']")).click();

		dosearch("li", "Casual Dresses > Printed ");

		String searchPageHeader = driver.findElement(By.tagName("h1")).getText();

		if (searchPageHeader.equalsIgnoreCase("Printed Dress")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

	}

	public static void dosearch(String tagName, String text) {
		By suggLocator = By.xpath("//" + tagName + "[text()='" + text + "']");
		driver.findElement(suggLocator).click();
	}

}
