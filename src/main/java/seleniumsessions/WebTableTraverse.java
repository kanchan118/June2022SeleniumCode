package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableTraverse {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/html/html_tables.asp");

		int rowCount = getRowCount();
		System.out.println("rows: =" + rowCount);

		int columnCount = getColumnCount();
		System.out.println("columns: =" + columnCount);
//
//		// table[@id="customers"]/tbody/tr[2]/td[1]
//		// table[@id="customers"]/tbody/tr[4]/td[1]
//		// table[@id="customers"]/tbody/tr[7]/td[1]
//
//		String beforeXpath = "//table[@id=\"customers\"]/tbody/tr[";
//		String afterXpath = "]/td[1]";
//
//		for (int i = 2; i <= getRowCount() + 1; i++) {
//			String actXpath = beforeXpath + i + afterXpath;
//			//System.out.println(actXpath);
//			String text = driver.findElement(By.xpath(actXpath)).getText();
//			System.out.println(text);
//		}
//		
//		System.out.println("-----------------------");
//		
//		//
//		String cont_beforeXpath = "//table[@id=\"customers\"]/tbody/tr[";
//		String cont_afterXpath = "]/td[2]";
//
//		for (int i = 2; i <= getRowCount() + 1; i++) {
//			String actXpath = cont_beforeXpath + i + cont_afterXpath;
//			//System.out.println(actXpath);
//			String text = driver.findElement(By.xpath(actXpath)).getText();
//			System.out.println(text);
//		}
//		
//		System.out.println("-------------");
//		//
//		
//		String country_beforeXpath = "//table[@id=\"customers\"]/tbody/tr[";
//		String country_afterXpath = "]/td[3]";
//
//		for (int i = 2; i <= getRowCount() + 1; i++) {
//			String actXpath = country_beforeXpath + i + country_afterXpath;
//			//System.out.println(actXpath);
//			String text = driver.findElement(By.xpath(actXpath)).getText();
//			System.out.println(text);
//		}

//		getColumnData(1);
//		getColumnData(2);
//		getColumnData(3);
		// getTableData();

		// *[@id="customers"]/tbody/tr/td[1]
		// *[@id="customers"]/tbody/tr[2]/td[2]
		// *[@id="customers"]/tbody/tr[2]/td[3]

		getRowData(3, 3);

	}

	public static void getColumnData(int colNumber) {
		System.out.println("------------");

		String beforeXpath = "//table[@id=\"customers\"]/tbody/tr[";
		String afterXpath = "]/td[" + colNumber + "]";

		for (int i = 2; i <= getRowCount() + 1; i++) {
			String actXpath = beforeXpath + i + afterXpath;
			// System.out.println(actXpath);
			String text = driver.findElement(By.xpath(actXpath)).getText();
			System.out.println(text);
		}
	}

	public static void getRowData(int rowNumber, int colCount) {

		// table[@id="customers"]/tbody/tr["+rowNumber+"]/td["+colCount+"]

		// String xpath =
		// "//table[@id=\"customers\"]/tbody/tr["+rowNumber+"]/td["+colCount+"]";
		// List<WebElement> rowList =driver.findElements(By.xpath(xpath));

		for (int j = 1; j <= colCount; j++) {
			String xpath = "//table[@id=\"customers\"]/tbody/tr[" + rowNumber + "]/td[" + j + "]";
			String text = driver.findElement(By.xpath(xpath)).getText();
			System.out.println(text);
		}

	}

	public static void getTableData() {
		System.out.println("------------");
		for (int col = 1; col <= getColumnCount(); col++) {
			String beforeXpath = "//table[@id=\"customers\"]/tbody/tr[";
			String afterXpath = "]/td[" + col + "]";

			for (int i = 2; i <= getRowCount() + 1; i++) {
				String actXpath = beforeXpath + i + afterXpath;
				// System.out.println(actXpath);
				String text = driver.findElement(By.xpath(actXpath)).getText();
				System.out.println(text);
			}
		}

	}

	public static int getColumnCount() {
		return driver.findElements(By.xpath("//table[@id='customers']//th")).size();
	}

	public static int getRowCount() {

		int rows = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		return rows - 1;
	}

}
