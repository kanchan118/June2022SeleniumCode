package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SVGElements {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		//SVG Element
		
		//button[@type='submit']//*[local-name()='svg']
		
		//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='states']//*[name()='g' and @class='state']
		
		//capture the id
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//driver.get("https://petdiseasealerts.org/forecast-map/#/");
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		
//		String map_xpath = "//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='states']//*[name()='g' and @class='state']";
//		
//		List<WebElement> statesList = driver.findElements(By.xpath(map_xpath));
//		System.out.println(statesList.size());
//		
//		for(WebElement e : statesList) {
//			String idVal=e.getAttribute("id");
//			System.out.println(idVal);
//		}
		
		searchProduct();
		
	}
	
	public static void searchProduct() {
		
		
		driver.findElement(By.name("q")).sendKeys("saree");
		driver.findElement(By.xpath("//button[@type='submit']//*[local-name()='svg']")).click();
	}

}
