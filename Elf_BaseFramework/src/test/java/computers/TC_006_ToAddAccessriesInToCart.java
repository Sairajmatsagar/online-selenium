package computers;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import pomRepository.AccessoriesPage;
import pomRepository.ComputersPage;
public class TC_006_ToAddAccessriesInToCart extends Base_Class {
@Test(groups={"smoke"})
public void toAddAccessriesInToCart() {
	homePage.getComputersModuleLink().click();
	String actualTitle=driver.getTitle();
    Assert.assertEquals("Demo Web Shop. Computers", actualTitle);
    Reporter.log("Computer page displayed successfully",true);
    ComputersPage computerPage=new ComputersPage(driver);
    computerPage.getAccessoriesModuleLink().click();
    String actualTitleAccessoriesPage=driver.getTitle();
    Assert.assertEquals("Demo Web Shop. Accessories", actualTitleAccessoriesPage);
    Reporter.log("Accessories page displayed successfully",true);
    
    AccessoriesPage accessoriesPage=new AccessoriesPage(driver);
   
    accessoriesPage.getAccessories1().click();
    String tcpTitle=driver.getTitle();
    Assert.assertEquals("Demo Web Shop. TCP", tcpTitle);
    Reporter.log("click on tcpdone successfully",true);
    accessoriesPage.getAddToCart().click();
    Reporter.log("product is added successfully in cart");
}
}
