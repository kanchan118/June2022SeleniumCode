package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationWithinLinks {

	public static void main(String[] args) throws Exception {

		// ********************Registration page By
		// locators*******************************

//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();

		BrowserUtil brUtil = new BrowserUtil();

		WebDriver driver = brUtil.launchBrowser("chrome");

		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		ElementUtil eleUtil = new ElementUtil(driver);

		By firstName = By.id("input-firstname");

		By lastName = By.cssSelector("input#input-lastname");

		By email = By.id("input-email");

		By phone = By.cssSelector("input#input-telephone");

		By pwd = By.id("input-password");

		By pwdConfirm = By.id("input-confirm");

		By regLink = By.linkText("Register");

		By forgotPwd = By.linkText("Forgotten Password");

		By myAccount = By.linkText("My Account");

		By addressBook = By.linkText("Address Book");

		By wishList = By.linkText("Wish List");

		By orderHistory = By.linkText("Order History");

		By downloads = By.linkText("Downloads");

		By recurringPayments = By.linkText("Recurring payments");

		By rewardPoints = By.linkText("Reward Points");

		By returns = By.linkText("Returns");

		By transactions = By.linkText("Transactions");

		By newsletter = By.linkText("Newsletter");

		eleUtil.doClick(regLink);
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());

		brUtil.quitBrowser();

//		eleUtil.doClick(regLink);
//		System.out.println(driver.getTitle());
//		driver.navigate().back();
//		Thread.sleep(3000);
//		System.out.println(driver.getTitle());
//
//		System.out.println("***************");

	}
}
