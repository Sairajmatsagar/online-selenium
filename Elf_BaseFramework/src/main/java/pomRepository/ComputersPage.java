package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputersPage {
	public ComputersPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//img[@title='Show products in category Desktops']")
	private WebElement desktopModuleLink;
	@FindBy(xpath="//img[@title='Show products in category Notebooks']")
	private WebElement noteBookModuleLink;
	@FindBy(xpath="//img[@title='Show products in category Accessories']")
	private WebElement accessoriesModuleLink;
	public WebElement getDesktopModuleLink() {
		return desktopModuleLink;
	}
	public WebElement getNoteBookModuleLink() {
		return noteBookModuleLink;
	}
	public WebElement getAccessoriesModuleLink() {
		return accessoriesModuleLink;
	}
}

