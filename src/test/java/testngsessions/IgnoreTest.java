package testngsessions;

import org.testng.annotations.Test;

public class IgnoreTest {

	@Test(description = "searching a product test", priority=1)
	public void searchTest() {
		System.out.println("searchTest");
	}

	@Test(priority = 2)
	public void logoTest() {
		System.out.println("logoTest");
	}

	@Test(enabled = false, priority = 3, description = "making payment via cc")
	public void paymentTest() {
		System.out.println("paymentTest");
	}

}
