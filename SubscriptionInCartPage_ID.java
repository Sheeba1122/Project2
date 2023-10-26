package project2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SubscriptionInCartPage_ID {
	@FindBy(xpath="//*[@href='/view_cart']") WebElement cart;
	@FindBy(id="susbscribe_email") WebElement email;
	@FindBy(xpath="//*[contains(@class,'fa fa-arrow-circle-o-right')]") WebElement arrow;
}
