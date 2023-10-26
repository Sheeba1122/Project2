package project2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScrollUpUsingArrow {
	public FirefoxDriver driver;
	@FindBy(id="scrollUp") WebElement scrollup;
	
	public void launchapp() {
	System.setProperty("webdriver.FireFox", "C:\\Program Files\\Mozilla Firefox\\Firefox.exe");
	driver = new FirefoxDriver();
	driver.get("https://automationexercise.com");
	driver.manage().window().maximize(); 
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void scrollUpWithArrow() throws Exception{
		boolean homepage = driver.findElement(By.xpath("//*[text()=' Home']")).isEnabled();
		System.out.println(homepage + ": " + driver.findElement(By.xpath("//*[text()=' Home']")).getText());
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(60000, 60000);");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		boolean subscription = driver.findElement(By.xpath("//*[text()='Subscription']")).isEnabled();
		System.out.println(subscription + ": " + driver.findElement(By.xpath("//*[text()='Subscription']")).getText());
		ScrollUpUsingArrow p = PageFactory.initElements(driver, ScrollUpUsingArrow.class);
		p.scrollup.click();
		String[] header = {"Full-Fledged practice website for Automation Engineers"};
		for(String text : header) {
			System.out.println(text);
		}
		}
	@AfterTest
	public void closeApp() {
		driver.close();
	}
}
