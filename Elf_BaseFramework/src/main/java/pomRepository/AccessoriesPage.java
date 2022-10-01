package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccessoriesPage {
	
	
	public AccessoriesPage(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//div[@data-productid='63']")
	 private WebElement accessories1;
    public WebElement getAccessories1() {
		return accessories1;
	}
   
 
 
 @FindBy(xpath="//input[@value='Add to cart']")
	private WebElement addToCart;
 
	public WebElement getAddToCart() {
		return addToCart;
	}
}
