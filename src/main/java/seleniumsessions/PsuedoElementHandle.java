package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PsuedoElementHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		Thread.sleep(5000);

		String fn_JScript = "return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"), '::before').getPropertyValue('content')";
		checkElementIsMandatory(fn_JScript);

		String ln_JScript = "return window.getComputedStyle(document.querySelector(\"label[for='input-lastname']\"), '::before').getPropertyValue('content')";
		checkElementIsMandatory(ln_JScript);

		String email_JScript = "return window.getComputedStyle(document.querySelector(\"label[for='input-email']\"), '::before').getPropertyValue('content')";
		checkElementIsMandatory(email_JScript);

		String telephone_JScript = "return window.getComputedStyle(document.querySelector(\"label[for='input-telephone']\"), '::before').getPropertyValue('content')";
		checkElementIsMandatory(telephone_JScript);

		String pwd_JScript = "return window.getComputedStyle(document.querySelector(\"label[for='input-password']\"), '::before').getPropertyValue('content')";
		checkElementIsMandatory(pwd_JScript);

		String pwdConfirm_JScript = "return window.getComputedStyle(document.querySelector(\"label[for='input-confirm']\"), '::before').getPropertyValue('content')";
		checkElementIsMandatory(pwdConfirm_JScript);

	}

	public static boolean checkElementIsMandatory(String jsScript) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		String man_text = js.executeScript(jsScript).toString();

		// System.out.println(man_text);

		if (man_text.contains("*")) {
			System.out.println("Ele is mandatory");
			return true;
		} else {
			System.out.println("Ele is not mandatory");
			return false;
		}

	}

}
