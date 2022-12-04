package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FooterLinks {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/");
//
//		List<WebElement> footerList =driver.findElements(By.xpath("//footer//a"));
//		System.out.println(footerList.size());
//		
//		for(WebElement e : footerList) {
//			String text = e.getText();
//			System.out.println(text);
//		}

		By footer = By.xpath("//footer//a");
		ArrayList<String> actFooterList = getFooterList(footer);
		
		if(actFooterList.contains("Contact Us")) {
			System.out.println("PASS");
		}

	}

	public static ArrayList<String> getFooterList(By locator) {

		List<WebElement> footerList = driver.findElements(locator);
		System.out.println(footerList.size());

		ArrayList<String> eleTextList = new ArrayList<String>();

		for (WebElement e : footerList) {
			String text = e.getText();
			System.out.println(text);
			eleTextList.add(text);
		}
		return eleTextList;
	}

}
