package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowDomElementHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(5000);

		driver.switchTo().frame("pact");

		// driver.findElement(By.id("tea")).sendKeys("masala tea");

		// document.querySelector("#snacktime").shadowRoot.querySelector("#tea")

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement tea = (WebElement) js
				.executeScript("return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\")");

		tea.sendKeys("masala tea");

	}

}
