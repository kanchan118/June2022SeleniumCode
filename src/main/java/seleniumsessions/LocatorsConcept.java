package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		// 1. id: unique
		// By.id("test");

		// 2. name:
//		driver.findElement(By.name("email")).sendKeys("test@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("test@123");

		// 100 ---> id = username --1 ele
		// 100 --> name = test -- 5 ele

		// By.type - NA

		// 3. className: can be duplicate most of the time for different elements
		// driver.findElement(By.className("form-control")).sendKeys("naveen");

		// 4. link Text: only for links
		// htmltag = <a>
		// anchor tag

		// driver.findElement(By.linkText("Login")).click();

		// 5. partialLinkText only for links
		// Forgotten username
		// Forgotten password
		// hi this is my login link
//		driver.findElement(By.partialLinkText("Forgotten")).click();
//		driver.findElement(By.partialLinkText("my login")).click();
//		
		// 6. xpath: address of the web element on the page (DOM)
		// xpath is not an attribute
		// driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("naveen");
		// driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();

		// 7. css selector:
		// its not an attribute
		// driver.findElement(By.cssSelector("#input-lastname")).sendKeys("testing");

		// 8. tag name:
		// html tag: not an attribute
		// driver.findElement(By.tagName("input")).sendKeys("testing");
		// String header = driver.findElement(By.tagName("h1")).getText();
		// System.out.println(header);

		By header = By.tagName("h1");
		By recPayment = By.linkText("Recurring payments");
		By warnMsg = By.className("alert");
		
		By checkBox = By.name("agree");
		By continueBtn = By.cssSelector("input.btn");

		String actHeader = doGetText(header);
		if (actHeader.equals("Register Account")) {
			System.out.println("correct header");
		} else {
			System.out.println("incorrect header");
		}
		
		System.out.println(doGetText(recPayment));
		
		doClick(continueBtn);
		System.out.println(doGetText(warnMsg));

		//
//		get the alert messages and error message

		ElementUtil eleUtil = new ElementUtil(driver);

		// ********************Registration page By
		// locators*******************************

		By firstName = By.id("input-firstname");

		By lastName = By.cssSelector("input#input-lastname");

		By email = By.id("input-email");

		By phone = By.cssSelector("input#input-telephone");

		By pwd = By.id("input-password");

		By pwdConfirm = By.id("input-confirm");

		By regLink = By.linkText("Register");

		By forgotPwd = By.linkText("Forgotten Password");

		By myAccount = By.linkText("My Account");

		By login = By.linkText("Login");

		eleUtil.doSendKeys(firstName, "Kanchan");
		eleUtil.doSendKeys(lastName, "Luha");
		eleUtil.doSendKeys(email, "Kanchan@gmail.com");
		eleUtil.doSendKeys(phone, "9658455514");
		eleUtil.doSendKeys(pwd, "Kanchan@123");
		eleUtil.doSendKeys(pwdConfirm, "Kanchan@123");

		eleUtil.doClick(login);

	}

	public static String doGetText(By locator) {
		return getElement(locator).getText();

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

	public static void doClick(By locator) {
		getElement(locator).click();

	}

}
