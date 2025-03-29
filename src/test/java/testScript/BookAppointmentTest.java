package testScript;

import org.testng.annotations.Test;

import baseClass.BaseClass;
import pageObject.BookAppointment;


public class BookAppointmentTest extends  BaseClass {
	@Test
	public void  bookAppointment() throws InterruptedException {
		 BookAppointment book = new  BookAppointment(driver);
		 book.Book();
		 book.FullName("Shubham Anil Giri");
		 book.Mobile("7972571443");
		 book.Pincode("413511");
		 book.Problem("cough");
		 book.CheckBox();
		 book.Submit();
		 book.First("4");
		 book.Second("9");
		 book.Third("0");
		 book.Fourth("0");
		 book.Proceed();
	}

}
