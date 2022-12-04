package seleniumsessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlerWithTwoWindows {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);

		List<WebElement> footerList = driver.findElements(By.xpath("(//div[@class='orangehrm-login-footer-sm']/a)"));
		driver.findElement(By.xpath("(//div[@class='orangehrm-login-footer-sm']/a)[1]")).click();

		Set<String> handles = driver.getWindowHandles();

		List<String> handleList = new ArrayList<String>(handles);
		
		String parentWindowId = handleList.get(0);
		
		
		

	}

}
