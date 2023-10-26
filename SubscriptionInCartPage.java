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

public class SubscriptionInCartPage {
	public FirefoxDriver driver;
	
	@BeforeTest
	public void launchapp() {
	System.setProperty("webdriver.FireFox", "C:\\Program Files\\Mozilla Firefox\\Firefox.exe");
	driver = new FirefoxDriver();
	driver.get("https://automationexercise.com");
	driver.manage().window().maximize(); 
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void subscriptionInCart() {
		boolean homepage = driver.findElement(By.xpath("//*[text()=' Home']")).isEnabled();
		System.out.println(homepage + ": " + driver.findElement(By.xpath("//*[text()=' Home']")).getText());
		SubscriptionInCartPage_ID p =PageFactory.initElements(driver, SubscriptionInCartPage_ID.class);
		p.cart.click();
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(10000, 10000);");
		boolean subscription = driver.findElement(By.xpath("//*[text()='Subscription']")).isEnabled();
		System.out.println(subscription + ": " + driver.findElement(By.xpath("//*[text()='Subscription']")).getText());
		p.email.sendKeys("testcheck789@gmail.com");
		p.arrow.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
