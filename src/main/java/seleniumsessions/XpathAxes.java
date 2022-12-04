package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAxes {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");

		driver.findElement(By.name("username")).sendKeys("kanchan118");
		driver.findElement(By.name("password")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		Thread.sleep(3000);

		driver.switchTo().frame("mainpanel");

		driver.findElement(By.linkText("CONTACTS")).click();

		Thread.sleep(3000);

//		selectContact("Ruby Gardner");
//		selectContact("Naveen K");

		// a[text()='Ruby Gardner']/parent::td/following-sibling::td

//		List<WebElement> contactList = driver
//				.findElements(By.xpath("//a[text()='Ruby Gardner']/parent::td/following-sibling::td"));
//
//		for (WebElement e : contactList) {
//			String text = e.getText();
//			if (text.length() != 0) {
//				System.out.println(text);
//			}
//		}

		getUserInfo("Naveen K");

	}

	public static void selectContact(String name) {

		String con_xpath = "//a[text()='" + name + "']/parent::td/preceding-sibling::td/input[@type='checkbox']";
		driver.findElement(By.xpath(con_xpath)).click();

	}

	public static List<String> getUserInfo(String name) {

		List<WebElement> contactList = driver
				.findElements(By.xpath("//a[text()='" + name + "']/parent::td/following-sibling::td"));

//		for (WebElement e : contactList) {
//			String text = e.getText();
//			if (text.length()!= 0) {
//				System.out.println(text);
//			}
		List<String> contValues = new ArrayList<String>();
		for (int i = 0; i < contactList.size() - 1; i++) {

			String text = contactList.get(i).getText();
			System.out.println(text);
			contValues.add(text);
		}
		return contValues;
	}

}
