package project2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search_Product_ID {
	@FindBy(xpath="//*[@href='/products']") WebElement productpage;
	@FindBy(xpath="//*[@id='search_product']") WebElement searchtextbox;
	@FindBy(xpath="//*[@id='submit_search']") WebElement searchbtn;
}
