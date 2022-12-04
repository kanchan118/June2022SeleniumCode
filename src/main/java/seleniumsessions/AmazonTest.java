package seleniumsessions;

public class AmazonTest {

	public static void main(String[] args) throws Exception {
		
		String browser = "chrome";
		
		BrowserUtil brUtil = new BrowserUtil();
		brUtil.launchBrowser(browser);
		
		brUtil.launchUrl("https://www.amazon.in/");
		
		String url = brUtil.getPageUrl();
		if(url.contains("amazon")) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
		brUtil.closeBrowser();
	}

}
