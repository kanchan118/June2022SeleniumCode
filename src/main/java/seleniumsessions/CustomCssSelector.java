package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomCssSelector {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");

		// css selector:

		// id --> #id
		// htmltag#id
		// class --> .class
		// htmltag.class

		// #username
		// input#username
		By email = By.cssSelector("#username");
		// .login-email
		// input.login-email
		// button.login-submit

		// button.login-submit#loginBtn
		// button#loginBtn.login-submit

		// .c1.c2.c3...cn
		// .form-control.private-form__control.login-email
		// .form-control.login-email
		// input.form-control.private-form__control.login-email

		// .c1.c2.c3...#id
		// input.form-control.private-form__control#username
		// input#username.form-control.private-form__control

		// other attributes:
		// htmltag[attr='value']
		// input[value ='Login'] -- css
		// input[@value ='Login'] -- xpath

		// htmltag[attr1='value'][attr2='value']
		// input[value ='Login'][type='submit'] -- css
		// input[@value ='Login' and @type='submit'] -- xpath

		// input[name ='email'][type='text'][id='input-email']
		// input[name ='email'][type='text']#input-email

		// input[id*=email] -- * means contains
		// input[placeholder*='E-Mail'] -- for dynamic attributes

		// input[placeholder^='E-Mail'] -- ^ stands for startswith
		// input[placeholder$='Address'] -- $ stands for endswith

		// parent to child:
		// form#hs-login div -- 20 (space returns direct + indirect child elements)
		// form#hs-login>div -- 8 (> returns direct child elements)

		// select#Form_getForm_Country>option

		// child to parent: NA
		// backward traversing: NA not available / allowed
		// preceding-sibling : NA

		// following-sibling:
		// label[for='input-email']+input

		// COMMA in css:
		// input#username,input#password,button#loginBtn,small#password-description

		List<WebElement> manFieldsList = driver.findElements(
				By.cssSelector("input#username,input#password,button#loginBtn,small#password-description"));
		
		System.out.println(manFieldsList.size());
		if(manFieldsList.size()==4) {
			System.out.println("PASS");
		}
		
		//not in css:
		
		//form-control private-form__control login-email
		//form-control private-form__control login-password m-bottom-3

		// input.form-control.private-form__control:not(.login-email)
		// input.form-control.private-form__control:not(#username)
		// xpath vs css:

		// 1. syntax : complex simple
		// 2. backward: yes no
		// 3. text: yes no
		// 4. siblings yes limited -- following/forward sibling
		// 5. webtable: yes limited
		// 6. parent to child: yes yes
		// 7. performance: good good

		// index
		// comma
		// not
		// Relative Locators  - Sel 4.x
		// SHADOW DOM
		// SVG

	}

}
