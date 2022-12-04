package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignments {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		By firstName = By.id("input-firstname");
		By lastname = By.id("input-lastname");
		By emailId = By.id("input-email");
		By telephone = By.id("input-telephone");
		By pwd = By.id("input-password");
		By pwdConfirm = By.id("input-confirm");
		By agreementCheckBox = By.xpath("//input[@name='agree']");
		By cntBtn = By.xpath("//input[@type='submit']");
		By regConfirm = By.tagName("h1");

		doSendKeysWithWait(firstName, 10, "Kanchan");
		doSendKeys(lastname, "Luha");
		doSendKeys(emailId, "kanchan@gmail.com");
		doSendKeys(telephone, "9728895647");
		doSendKeys(pwd, "test@123");
		doSendKeys(pwdConfirm, "test@123");
		doClick(agreementCheckBox);
		doClick(cntBtn);

		String confirmMsg = getElementTextWithWait(regConfirm, 10);

		if (confirmMsg.equals("Your Account Has Been Created!")) {
			System.out.println("Registration is successful");
		} else {
			System.out.println("Issue with registration");
		}

	}

	public static void doClick(By locator) {
		getElement(locator).click();
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static WebElement waitForElementPresence(By locator, int timeOut) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	public static void doSendKeysWithWait(By locator, int timeOut, String value) {
		waitForElementPresence(locator, timeOut).sendKeys(value);
	}

	public static String getElementTextWithWait(By locator, int timeOut) {
		return waitForElementPresence(locator, timeOut).getText();
	}

}
