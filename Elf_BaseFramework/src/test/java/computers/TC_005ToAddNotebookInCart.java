package computers;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import pomRepository.ComputersPage;
import pomRepository.DesktopPage;
import pomRepository.NotebookPage;

public class TC_005ToAddNotebookInCart extends Base_Class {
@Test(groups={"smoke"})
	public void ToAddNotebookInCart() {
		homePage.getComputersModuleLink().click();
		String actualTitle=driver.getTitle();
	    Assert.assertEquals("Demo Web Shop. Computers", actualTitle);
	    Reporter.log("Computer page displayed successfully",true);
	    ComputersPage computerPage=new ComputersPage(driver);
	    computerPage.getNoteBookModuleLink().click();
	    String actualTitleNotebookPage=driver.getTitle();
	    Assert.assertEquals("Demo Web Shop. Notebooks", actualTitleNotebookPage);
	    Reporter.log("Notebook page displayed successfully",true);
	    NotebookPage notebookPage=new NotebookPage(driver);
	    notebookPage.getLaptop141_inch().click();
	    String cheapComputerTitle=driver.getTitle();
	    Assert.assertEquals("Demo Web Shop. 14.1-inch Laptop", cheapComputerTitle);
	    Reporter.log("click on build computer done successfully",true);
	    notebookPage.getAddToCart().click();
	    Reporter.log("product is added successfully in cart");
	}

}
