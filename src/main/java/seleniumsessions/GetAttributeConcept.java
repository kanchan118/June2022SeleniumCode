package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttributeConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

//		String attrVal = driver.findElement(By.id("input-email")).getAttribute("placeholder");
//		
//		System.out.println(attrVal);

		// WebElement emailId = driver.findElement(By.id("input-email"));

//		emailId.sendKeys("test@gmail.com");
////		String text = emailId.getText();
//		String text = emailId.getAttribute("value");
//		System.out.println(text);

		By emailId = By.id("input-email");
		By registerlink = By.linkText("Register");
		By logo = By.className("img-responsive");

		String text1 = doGetAttribute(emailId, "placeholder");
		String text2 = doGetAttribute(registerlink, "href");
		String text3 = doGetAttribute(logo, "src");
		String text4 = doGetAttribute(logo, "title");

		System.out.println(text1);
		System.out.println(text2);
		System.out.println(text3);
		System.out.println(text4);
	}

	// orangehrm - get text entered using value attribute

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static String doGetAttribute(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);

	}

}
