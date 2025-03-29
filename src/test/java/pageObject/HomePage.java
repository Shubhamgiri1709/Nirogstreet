package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='doctorSearch']")
	WebElement searchBox;

	@FindBy(xpath = "//div[@class='inputContainer w-full h-full']//div//*[name()='svg']")
	WebElement searchButton;
	
	@FindBy(xpath = "//div[@class='select__value-container select__value-container--has-value css-f4qb1w']")
	WebElement selectcountry;
	
	@FindBy(xpath = "(//div[@class=\"select__single-value css-vv14hp-singleValue\"])[1]")
	WebElement select;
	
	
	
	

	public void searchDoctor(String doctorName) {
		searchBox.sendKeys(doctorName);
		
	}
	
	public void searchbtn() {
		searchButton.click();
	}
	
	public void searchcountry() {
		selectcountry.click();
		
	}
	
	public void Select() {
		select.click();
	}
}
