package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
public ShoppingCartPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//input[@value='2412193']")
private WebElement checkBox1;
@FindBy(xpath="//th[contains(text(),'Remove')]")
private WebElement removeModuleLink;
@FindBy(xpath="//select[@class='country-input valid']")
private WebElement contryDropdown;
@FindBy(xpath="//select[@class='state-input valid']")
private WebElement stateDropdown;
public WebElement getContryDropdown() {
	return contryDropdown;
}
public WebElement getStateDropdown() {
	return stateDropdown;
}
public WebElement getCheckBox1() {
	return checkBox1;
}
public WebElement getRemoveModuleLink() {
	return removeModuleLink;
}
}
