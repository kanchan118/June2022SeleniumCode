package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImages {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");

//		List<WebElement> imagesList = driver.findElements(By.tagName("img"));
//		System.out.println(imagesList.size());
//		
//		//src and alt 
//		
//		for(WebElement e : imagesList) {
//			String srcVal = e.getAttribute("src");
//			String altVal = e.getAttribute("alt");
//			
//			System.out.println(srcVal + " : " + altVal);
//			
//		}

		By images = By.tagName("img");
		By links = By.tagName("a");

		int totalLinks = getElementsCount(links);
		System.out.println(totalLinks);
		if (totalLinks > 200) {
			System.out.println("PASS");
		}

		int totalImages = getElementsCount(images);
		System.out.println(totalImages);

//		System.out.println("total links : " + getElementsCount(links));
//		System.out.println("total links : " + getElementsCount(images));
//		
		List<String> linkTextList = getelementTextlist(links);
		System.out.println(linkTextList);

	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);

	}

	public static int getElementsCount(By locator) {
		return getElements(locator).size();

	}

	public static List<String> getelementTextlist(By locator) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleListText = new ArrayList<String>();

		for (WebElement e : eleList) {
			String text = e.getText();
			if (text.length() != 0) {
				eleListText.add(text);
			}
		}

		return eleListText;
	}

}
