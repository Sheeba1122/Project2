package project2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RemoveProductFromCart {
	public FirefoxDriver driver;
	
	
	@BeforeMethod
	public void launchapp() {
	System.setProperty("webdriver.FireFox", "C:\\Program Files\\Mozilla Firefox\\Firefox.exe");
	driver = new FirefoxDriver();
	driver.get("https://automationexercise.com");
	driver.manage().window().maximize(); 
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(priority=2)
	public void addTocart() {
		boolean homepage = driver.findElement(By.xpath("//*[text()=' Home']")).isEnabled();
		System.out.println(homepage + ": " + driver.findElement(By.xpath("//*[text()=' Home']")).getText());
		RemoveProductFromCart_ID p =PageFactory.initElements(driver, RemoveProductFromCart_ID.class);
		p.product1.click();
		p.viewcart.click();
		boolean cartpage = driver.findElement(By.xpath("//*[text()='Shopping Cart']")).isEnabled();
		System.out.println(cartpage + "Cart Page is Displayed ");
		p.deleteitem.click();
		System.out.println(p.emptycart.isDisplayed() + p.emptycart.getText());
	}
	@AfterTest
	public void closeApp() {
		driver.close();
	}
	
	
	
	
	
	
	
	
}
