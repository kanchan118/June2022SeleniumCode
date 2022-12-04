package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthPopUpHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		String userName = "admin";
		String password = "admin";

		driver.get("https://" + userName + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth");

		String msg = driver.findElement(By.xpath("//div[@id='content']//p")).getText();
		System.out.println(msg);

	}

}
