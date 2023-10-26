package project2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RemoveProductFromCart_ID {
	@FindBy(xpath="//*[@data-product-id='1']") WebElement product1;
	@FindBy(xpath="//*[@class='modal-dialog modal-confirm']//following::*[text()='View Cart']") WebElement viewcart;
	@FindBy(xpath="//*[@data-product-id='1']") WebElement deleteitem;
	@FindBy(xpath="//*[text()='Cart is empty!']") WebElement emptycart;
	
}
