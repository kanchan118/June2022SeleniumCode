package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownhandlingWithoutSelect {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/?");

		// select/option -- 232
		List<WebElement> optionList = driver.findElements(By.xpath("//select/option"));

		System.out.println(optionList.size());

		for (WebElement e : optionList) {
			String text = e.getText();
			System.out.println(text);
			if (text.equalsIgnoreCase("India")) {
				e.click();
				break;
			}
		}

		By country = By.xpath("//select/option");
		doSelectValueFromDropDown(country, "Germany");

	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static void doSelectValueFromDropDown(By locator, String value) {
		
		List<WebElement> optionList = getElements(locator);
		
		System.out.println(optionList.size());
		
		for(WebElement e : optionList) {
			String text = e.getText();
			System.out.println(text);
			if(text.equalsIgnoreCase(value)) {
				e.click();
				break;
				}	
			}


		}
}