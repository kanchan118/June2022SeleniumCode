package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleFrame {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		//frame
		//iframe
		
		//driver.switchTo().frame(2);		
		//driver.switchTo().frame("main");
		
		List<WebElement> frameList = driver.findElements(By.tagName("frame"));
		System.out.println(frameList.size());
		
		WebElement frameMain =driver.findElement(By.name("main"));
		
		driver.switchTo().frame(frameMain);
		
		String header = driver.findElement(By.xpath("/html/body/h2")).getText();
		System.out.println(header);
		
		

	}

}
