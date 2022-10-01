package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookPage {

	public BookPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@data-productid='13']")
	private WebElement book1;
	@FindBy(xpath = "//div[@data-productid='45']")
	private WebElement book2;
	public WebElement getBook1() {
		return book1;
	}
	public WebElement getBook2() {
		return book2;
	}
	@FindBy(xpath = "//input[@value='Add to cart']")
	private WebElement addToCart;

	public WebElement getAddToCart() {
		return addToCart;
	}
	@FindBy(id="products-orderby")
	private WebElement sortDropDown; 

	public WebElement getSortDropDown() {
		return sortDropDown;
	}

	@FindBy(id="products-pagesize")
	private WebElement displayDropDown; 

	@FindBy(id="products-viewmode")
	private WebElement viewAsDropDown;

	public WebElement getDisplayDropDown() {
		return displayDropDown;
	}

	public WebElement getViewAsDropDown() {
		return viewAsDropDown;
	} 
}
