package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementsSectionLinks {	

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

//		List<WebElement> sectionsLinks = driver.findElements(By.className("list-group-item"));
//		
//		System.out.println(sectionsLinks.size());
//		
//		for(WebElement e : sectionsLinks) {
//			System.out.println(e.getText());
//		}

		By righSecsLinks = By.className("list-group-item");

		ElementUtil eleUtil = new ElementUtil(driver);
		List<String> textList = eleUtil.getelementTextlist(righSecsLinks);
		System.out.println(textList);
		if (textList.contains("Order History")) {
			System.out.println("PASS");
		}

	}

}
