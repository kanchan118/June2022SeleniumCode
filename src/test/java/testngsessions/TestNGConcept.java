package testngsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGConcept {

	// global pre conditions
	// pre conditions
	// test steps
		// data
		// assert -- exp vs act
		// status
	// post steps
	
	/**
	 * 
	 * BS -- connectWithDB
	   BT -- createTestUser
	   BC -- launchBrowser
	   
			BM -- login to app
			add to cart
			AM -- logout
			
			BM -- login to app
			payment test
			AM -- logout
			
			BM -- login to app
			search test
			AM -- logout
		
		AC -- close browser
		AT -- delete user
		AS -- disconnect with DB
	 */

	@BeforeSuite
	public void connectWithDB() {
		System.out.println("BS -- connectWithDB");
	}

	@BeforeTest
	public void createTestUser() {
		System.out.println("BT -- createTestUser");
	}

	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC -- launchBrowser");
	}

	@BeforeMethod
	public void login() {
		System.out.println("BM -- login to app");
	}

	@Test
	public void searchTest() {
		System.out.println("search test");
	}

	@Test
	public void addToCartTest() {
		System.out.println("add to cart");
	}

	@Test
	public void paymentTest() {
		System.out.println("payment test");
	}

	@AfterMethod
	public void logout() {
		System.out.println("AM -- logout");
	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("AC -- close browser");
	}

	@AfterTest
	public void deleteUser() {
		System.out.println("AT -- delete user");
	}

	@AfterSuite
	public void disconnectWithDB() {
		System.out.println("AS -- disconnect with DB");
	}

}
