package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricInfoTable {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get(
				"https://www.espncricinfo.com/series/women-s-asia-cup-2022-23-1335753/india-women-vs-united-arab-emirates-women-8th-match-1335792/full-scorecard");

		Thread.sleep(4000);

		// getWckTakerName("Richa Ghosh");

//		List<WebElement> scoreList = driver
//				.findElements(By.xpath("//span[text()='Richa Ghosh']/ancestor::td/following-sibling::td"));
//
//		ArrayList<String> actualScoreList = new ArrayList<String>();
//
//		for (WebElement e : scoreList) {
//			String text = e.getText();
//			System.out.println(text);
//		}

		getWktKeeperScoreDetails("Richa Ghosh");

	}

	public static String getWckTakerName(String name) {

		String wkt_xpath = "//span[text()='" + name + "']/ancestor::td/following-sibling::td";
		String wktTakerName = driver.findElement(By.xpath(wkt_xpath)).getText();
		System.out.println(wktTakerName);
		return wktTakerName;

	}

	public static ArrayList<String> getWktKeeperScoreDetails(String name) {

		List<WebElement> scoreList = driver
				.findElements(By.xpath("//span[text()='" + name + "']/ancestor::td/following-sibling::td"));

		ArrayList<String> actualScoreList = new ArrayList<String>();

		for (WebElement e : scoreList) {
			String text = e.getText();
			System.out.println(text);
			actualScoreList.add(text);
		}

		return actualScoreList;
	}

}
