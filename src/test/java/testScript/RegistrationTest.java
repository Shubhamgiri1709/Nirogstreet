package testScript;

import org.testng.annotations.Test;

import baseClass.BaseClass;
import pageObject.Registration;

public class RegistrationTest  extends BaseClass {
    @Test
	public void registrationTest() throws InterruptedException {
    	Registration res = new Registration(driver);
    	res.Loginbtn();
    	res.registrationbtn();
    	res.Role("Student");
    	res.Title("Mr. ");
    	res.Fullname("Shubham Anil Giri");
    	res.mobile("7972571443");
    	res.pincode("413511");
    	res.Type("Yoga");
    	res.Problem("Diabetes");
    	res.Search();
    	res.Registerbtn();
    	res.First("1");
    	res.Second("9");
    	res.Third("9");
    	res.Fourth("4");
    	res.Proceed();
    	
	}
}
