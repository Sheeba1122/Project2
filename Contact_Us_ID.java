package project2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Contact_Us_ID {
	@FindBy(xpath="//*[@href='/contact_us']") WebElement contactus;
	@FindBy(xpath="//*[@class='btn btn-success']") WebElement homepage;
	
}
