package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFrameHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");

		driver.findElement(By.xpath("//img[@title='vehicle-registration-forms-and-templates']")).click();

		Thread.sleep(3000);

		driver.switchTo().frame("frame-one748593425");

		driver.findElement(By.id("RESULT_TextField-7")).sendKeys("naveen");

		driver.switchTo().defaultContent(); // back to the main page

	}

}
