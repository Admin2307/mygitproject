package mavenTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testing2080803 {
	
	public WebDriver driver;
	
	@Test
	public void openMyBlog(){
		driver.get("https://www.softwaretestingmaterial.com");
	}
	@BeforeClass
	public void BeforeClass(){
		
		System.setProperty("webdriver.gecko.driver","C:\\selenium1\\Drivers");
		driver = new ChromeDriver();
	}
	
	@AfterClass
	public void afterClass(){
		driver.quit();
	}
	
		

}
