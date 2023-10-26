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

public class SubscriptionInPage {
	public FirefoxDriver driver;
	@FindBy(id="susbscribe_email") WebElement email;
	@FindBy(xpath="//*[contains(@class,'fa fa-arrow-circle-o-right')]") WebElement arrow;
	
	
	@BeforeTest
	public void launchapp() {
	System.setProperty("webdriver.FireFox", "C:\\Program Files\\Mozilla Firefox\\Firefox.exe");
	driver = new FirefoxDriver();
	driver.get("https://automationexercise.com");
	driver.manage().window().maximize(); 
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void subscription() {
		boolean homepage = driver.findElement(By.xpath("//*[text()=' Home']")).isEnabled();
		System.out.println(homepage + ": " + driver.findElement(By.xpath("//*[text()=' Home']")).getText());
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(60000, 60000);");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		boolean subscription = driver.findElement(By.xpath("//*[text()='Subscription']")).isEnabled();
		System.out.println(subscription + ": " + driver.findElement(By.xpath("//*[text()='Subscription']")).getText());
		SubscriptionInPage p =PageFactory.initElements(driver, SubscriptionInPage.class);
		p.email.sendKeys("testcheck789@gmail.com");
		je.executeScript("window.scrollBy(60000, 60000);");
		p.arrow.click();
		je.executeScript("window.scrollBy(60000, 60000);");
		boolean successmsg =driver.findElement(By.xpath("//*[contains(@class,'alert-success alert')]")).isDisplayed();
		if(successmsg=true) {
			System.out.println(successmsg + ": "+ driver.findElement(By.xpath("//*[contains(@class,'alert-success alert')]")).getText());
			}
		else {
			System.out.println("Not displayed");
		}
		
		
	}
		@AfterTest
		public void closeApp() {
		driver.close();
	}
}
