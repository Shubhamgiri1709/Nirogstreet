package testScript;

import org.testng.annotations.Test;

import baseClass.BaseClass;
import pageObject.HomePage;

public class HomePageTest extends BaseClass{
	@Test
  public void searchpage() {
	  HomePage page = new HomePage(driver);
	  page.searchDoctor("Heart Problem");
	  page.searchbtn();
	  
  }
	@Test
	public void searchCountry() {
		HomePage page = new HomePage(driver);
		page.searchcountry();
		page.Select();
	}
	
	
	
	
}
