package swaglab_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import swaglab_pages.LoginPage;

public class AddtoCartPage extends BaseClass {

	@Test
	
	public void AddtoCartTest() {
		
		LoginPage lp = new LoginPage();
		lp.LoginFunction("standard_user", "secret_sauce");
		
		WebElement AddCart = driver.findElement(By.xpath("//a[@class=\"shopping_cart_link\"]"));
		AddCart.click();
		
		WebElement PageTitle = driver.findElement(By.className("title"));
		Assert.assertEquals(PageTitle.getText(), "Your Cart");
}
	
}