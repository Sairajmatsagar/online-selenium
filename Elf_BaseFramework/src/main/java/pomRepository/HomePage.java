package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText="Log out")
	private WebElement logoutButton;
	@FindBy(partialLinkText = "Computers")
	 private WebElement computersModuleLink;
	@FindBy(partialLinkText = "Books")
	 private WebElement booksModuleLink;
	@FindBy(xpath="//span[text()='Shopping cart']")
	 private WebElement shoppingCartModuleLink;
	
	public WebElement getShoppingCartModuleLink() {
		return shoppingCartModuleLink;
	}

	public WebElement getBooksModuleLink() {
		return booksModuleLink;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}

	public WebElement getComputersModuleLink() {
		return computersModuleLink;
	}

		public void logout() {
		logoutButton.click();
	}
}
