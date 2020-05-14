package practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Googlepage1 {
	
	public WebDriver driver;
	
	public void TC01() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NupurChatterjee\\Documents\\selenium drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.quit();
		
	}
	
	

}
