package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MedicineLogin extends BasePage {

	public MedicineLogin(WebDriver driver) {
		
		super(driver);
		
	}
		@FindBy(xpath="//span[text()='Hello, Log in']")
		WebElement HelloLogin;
		public void Click_HelloLogin() {
			clickAction(HelloLogin);
		}
		
		@FindBy(xpath="//input[@id='mobile']")
		WebElement MobNo;
		public void EnterValueInMobNo(String MobileNo) {
			enter_value(MobNo, MobileNo);
		}
		
		@FindBy(xpath="//button[@type='submit']")
		WebElement ClickonOtp;
		public void Click_ClickonOtp() {
			clickAction( ClickonOtp);
		}
		
		@FindBy(xpath="//button[@type='submit']")
		WebElement SendOtp;
		public void SendOtp() {
			clickAction(SendOtp);
		}

		

}
