package project2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCasePage {
	public FirefoxDriver driver;
	@FindBy(xpath="//*[@href='/test_cases']") WebElement textcasepage;
	
	@BeforeMethod
	public void launchapp() {
	System.setProperty("webdriver.FireFox", "C:\\Program Files\\Mozilla Firefox\\Firefox.exe");
	driver = new FirefoxDriver();
	driver.get("https://automationexercise.com");
	driver.manage().window().maximize(); 
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void testCasePage() {
		boolean homepage = driver.findElement(By.xpath("//*[text()=' Home']")).isEnabled();
		System.out.println(homepage + ": " + driver.findElement(By.xpath("//*[text()=' Home']")).getText());
		TestCasePage p = PageFactory.initElements(driver, TestCasePage.class);
		p.textcasepage.click();
		boolean testcases = driver.findElement(By.xpath("//*[@href='/test_cases']")).isEnabled();
		System.out.println(testcases + ": " + driver.findElement(By.xpath("//*[@href='/test_cases']")).getText());
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeApp() {
		driver.close();
	}
	
}
