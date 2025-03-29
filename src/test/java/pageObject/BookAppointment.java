package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAppointment {

	WebDriver driver;

	public BookAppointment(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='text-sm font-semibold text-gray-600 cursor-pointer']")
	WebElement book;
	

	@FindBy(xpath = "(//input[@id='fullName'])[2]")
	WebElement fullname;
	
	@FindBy(xpath = "(//input[@id='mobile'])[2]")
	WebElement mobile;
	
	@FindBy(xpath = "(//input[@id='pincode'])[2]")
	WebElement pincode;
	
	@FindBy(xpath = "(//textarea[@id='queryPrompt'])[2]")
	WebElement problem;
	
	@FindBy(xpath = "//div[@class='w-6 h-6 rounded-sm-0.5 overflow-hidden flex flex-shrink-0 justify-center items-center']")
	WebElement checkbox;
	
	@FindBy(xpath = "(//button[contains(@type,'submit')][normalize-space()='Book Now'])[2]")
	WebElement submit;
	
	@FindBy(xpath = "(//input[@aria-label='Please enter OTP character 1'])[1]")
	WebElement first;
	
	@FindBy(xpath = "(//input[@aria-label='Please enter OTP character 2'])[1]")
	WebElement second;
	
	@FindBy(xpath = "(//input[@aria-label='Please enter OTP character 3'])[1]")
	WebElement third;
	
	@FindBy(xpath = "(//input[@aria-label='Please enter OTP character 4'])[1]")
	WebElement fourth;
	
	@FindBy(xpath = "(//button[normalize-space()='Proceed'])[1]")
	WebElement proceed;
	
	public void Book() {
		book.click();
	}
	
	public void FullName(String name) {
		fullname.sendKeys(name);
	}
	
	public void Mobile(String no) {
	mobile.sendKeys(no);
	}
	
	public void Pincode(String code) {
		pincode.sendKeys(code);
		}
	
	
	public void Problem(String pro) {
		problem.sendKeys(pro);
		}
	
	public void CheckBox() {
		checkbox.click();
		}
	
	public void Submit() throws InterruptedException {
		submit.click();
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
	 
	public void Proceed() throws InterruptedException {
		Thread.sleep(5000);
		proceed.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
