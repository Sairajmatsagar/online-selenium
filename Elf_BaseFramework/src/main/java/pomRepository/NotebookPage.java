package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NotebookPage {

	
		public NotebookPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath="//div[@class='product-item']")
		private WebElement laptop141_inch;
		
		public WebElement getLaptop141_inch() {
			return laptop141_inch;
		}
		@FindBy(xpath="//input[@value='Add to cart']")
		private WebElement addToCart;
		public WebElement getAddToCart() {
			return addToCart;
		}
		
}
