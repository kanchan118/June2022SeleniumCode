package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestWithDataDriven {

	// data driven approach
	// testNG dataprovider

	WebDriver driver;

	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

	}

	@DataProvider
	public Object[][] getNegativeLoginData() {
		return new Object[][] {

				{ "naveen@gmail.com", "test123" }, 
				{ "naveenanimation20@gmail.com", "test12322" }, 
				{ " ", "12123" },
				{ "tom@gmail.com", "@#@#@#" }, 
				{ " ", " " }
		};
	}

	@Test(dataProvider = "getNegativeLoginData")
	public void loginNegativeTest(String username, String password) {
		// System.out.println("login credential : username - " + username +" password - "
		// + password);
		Assert.assertEquals(doLogin(username, password), true);

	}

	public boolean doLogin(String username, String password) {

		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		return driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).isDisplayed();

//		String errMsg = driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).getText();
//		System.out.println(errMsg);

//		if(errMsg.contains("No match for E-Mail Address and/or Password")) {
//			return true;
//		}else {
//			return false;
//		}

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
