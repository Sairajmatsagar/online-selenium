package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DesktopPage {
public DesktopPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//div[@class='product-item']")
private WebElement desktop1;
public WebElement getDesktop1() {
	return desktop1;
}
@FindBy(xpath="//input[@value='Add to cart']")
private WebElement addToCart;
public WebElement getAddToCart() {
	return addToCart;
}
@FindBy(id="products-orderby")
private WebElement sortByDropDown;
@FindBy(id="products-pagesize")
private WebElement displayDropDown;
@FindBy(id="products-viewmode")
private WebElement viewAsDropDown;
public WebElement getViewAsDropDown() {
	return viewAsDropDown;
}
public void setViewAsDropDown(WebElement viewAsDropDown) {
	this.viewAsDropDown = viewAsDropDown;
}
public WebElement getDisplayDropDown() {
	return displayDropDown;
}
public WebElement getSortByDropDown() {
	return sortByDropDown;
}
}
