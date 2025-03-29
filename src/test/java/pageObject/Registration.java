package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Registration {
WebDriver driver;
	
	//constructor
   public Registration(WebDriver driver)
	 {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//Locator
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement loginbtn;
	
	@FindBy(xpath="//span[@class='text-primary1-500 font-bold']")
	WebElement registration;
	
	@FindBy(xpath="(//div[@class='select__input-container css-19bb58m'])[1]")
	WebElement role;
	
	@FindBy(xpath="//input[@id='fullName']")
	WebElement fullname;
	
	@FindBy(xpath="(//*[name()='path'])[6]")
	WebElement title;
	
	@FindBy(xpath="//input[@id='mobileNo']")
	WebElement mobile;
	
	@FindBy(xpath="//input[@id='pinCode']")
	WebElement pincode;
	
	@FindBy(xpath="(//div[contains(@class,'select__value-container select__value-container--has-value css-f4qb1w')])[3]")
	WebElement type;
	
	@FindBy(xpath="(//div[contains(@class,'min-h-9.5 w-full flex items-center px-3.5')])[1]")
	WebElement problem;
	
	@FindBy(xpath="(//*[name()='svg'][contains(@class,'undefined shrink-0')])[6]")
	WebElement search;
	
	
	
	@FindBy(xpath="(//button[normalize-space()='Register'])[1]")
	WebElement registerbtn;
	
	@FindBy(xpath="(//input[@aria-label='Please enter OTP character 1'])[1]")
	WebElement first;
	
	@FindBy(xpath="(//input[@aria-label='Please enter OTP character 2'])[1]")
	WebElement second;
	
	@FindBy(xpath="(//input[@aria-label='Please enter OTP character 3'])[1]")
	WebElement third;
	
	@FindBy(xpath="(//input[@aria-label='Please enter OTP character 4'])[1]")
	WebElement fourth;
	
	@FindBy(xpath="(//button[normalize-space()='Proceed'])[1]")
	WebElement proceed;
	
	public void Loginbtn() throws InterruptedException {
		loginbtn.click();
		Thread.sleep(2000);
	}
	
	public void registrationbtn() {
		registration.click();
	}
	
	public void Role(String ro) {
		role.click();
		Select sl = new Select(role);
		sl.selectByVisibleText(ro);
		
		
	}
	
	public void Title(String tt) {
		title.click();
		Select sl = new Select(title);
		sl.selectByVisibleText(tt);
		
		
	}
	
	public void Fullname(String name) {
		fullname.sendKeys(name);
		
	}
	

	public void mobile(String no) {
		fullname.sendKeys(no);
		
	}
	
	public void pincode(String code) {
		fullname.sendKeys(code);
		
	}
	
	public void Type(String str) {
		type.click();
		Select sl = new Select(type);
		sl.selectByVisibleText(str);
	}
	
	public void Problem(String pro) {
		problem.sendKeys(pro);
		
		
	}
	
	public void Search() {
		search.click();
	}
	
	public void Registerbtn() throws InterruptedException {
		registerbtn.click();
		Thread.sleep(5000);
		
	}
	
	
	public void First(String no1) {
		first.sendKeys(no1);
		
	}
	
	public void Second(String no2) {
		second.sendKeys(no2);
		
	}
	
	public void Third(String no3) {
		third.sendKeys(no3);
		
	}
	
	public void Fourth(String no4) {
		fourth.sendKeys(no4);
		
	}
	
	public void Proceed() {
		proceed.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
