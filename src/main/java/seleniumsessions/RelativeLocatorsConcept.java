package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorsConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		// ele
		// left, right, below, above, near

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");

		//WebElement ele = driver.findElement(By.linkText("Whistler, Canada"));

		// right of the element --> tagname(p)

//		String rightIndex = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
//		System.out.println(rightIndex);
//		
//		//left of ele:
//		String leftRank = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
//		System.out.println(leftRank);
//		
//		//below of ele:
//		String belowCity = driver.findElement(with(By.tagName("p")).below(ele)).getText();
//		System.out.println(belowCity);
//		
//		//above of ele:
//		String aboveCity = driver.findElement(with(By.tagName("p")).above(ele)).getText();
//		System.out.println(aboveCity);
//		
//		//near of ele:
//		String nearEle = driver.findElement(with(By.tagName("p")).near(ele)).getAttribute("class");
//		System.out.println(nearEle);
//		
		getNearElements("Windsor, Canada");

	}

	public static void getNearElements(String cityName) {

		WebElement ele = driver.findElement(By.linkText(cityName));
		String rightIndex = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(rightIndex);
		String leftRank = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(leftRank);
		String belowCity = driver.findElement(with(By.tagName("p")).below(ele)).getText();
		System.out.println(belowCity);
		String aboveCity = driver.findElement(with(By.tagName("p")).above(ele)).getText();
		System.out.println(aboveCity);
//		String nearEle = driver.findElement(with(By.tagName("p")).near(ele)).getText();
//		System.out.println(nearEle);
		String nearEle = driver.findElement(with(By.tagName("p")).near(ele)).getAttribute("class");
		System.out.println(nearEle);

	}

}
