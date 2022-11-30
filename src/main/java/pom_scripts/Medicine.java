package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Medicine extends BasePage{

	public Medicine(WebDriver driver) {
		super(driver);
			}
	
	@FindBy(xpath="//img[@class='c-PJLV c-PJLV-idPVSpt-css']")
	WebElement Med;
	public void Click_Med() {
		clickAction(Med);
	}

	@FindBy(xpath="//div[@class='OrderMedicine_ctaText__2qapI']")
	WebElement OrderViaP;
	public void Click_OrderViaP() {
		clickAction(OrderViaP);
	}
	
 	@FindBy(xpath="//input[@type='file']")
	WebElement MedPath;
	public void EnterValueInMedPath(String MedicinePath) {
		enter_value(MedPath, MedicinePath);
	}
	
	@FindBy(xpath="//a[@class='KSY3N']")
	WebElement OrderMed;
	public void Click_OrderMed() {
		clickAction(OrderMed);
	}
	
	@FindBy(xpath="//span[text()='Select Pincode']")
	WebElement SelectPin;
	public void Click_SelectPin() {
		clickAction(SelectPin);
	}
  
	@FindBy(xpath="//input[@class='Input_input__3uBA4 PincodeDrawer_pincodeInput__1UeP7']")
	WebElement Pincode;
	public void EnterValueInPincode(String EnterPincode) {
		enter_value(Pincode, EnterPincode);
	}
	
	@FindBy(xpath="//button[text()='Check']")
	WebElement CheckButton;
	public void Click_CheckButton() {
		clickAction(CheckButton);
	}

	@FindBy(xpath="//input[contains(@placeholder,'Search medicines')]")
	WebElement MedName;
	public void EnterValueInMedNmae(String EnterMedName) {
		enter_value(MedName, EnterMedName);
	}
	
	@FindBy(xpath="//div[@class='ClickableElement_clickable__3o0IV Typeahead_searchIcon__1Jquh']")
	WebElement SearchClick;
	public void Click_SearchClick() {
		clickAction(SearchClick);
	}
//	
	@FindBy(xpath="//button[text()='Add To Cart']")
	WebElement AddToCart;
	public void Click_AddToCart() {
		clickAction(AddToCart);
	}
//	
	@FindBy(xpath="//li[@data-value='5']")
	WebElement Quantity;
	public void Click_Quantity() {
		clickAction(Quantity);
	}
	
//	
	@FindBy(xpath="//span[text()='View Cart']")
	WebElement ViewCart;
	public void Click_ViewCart() {
	clickAction(ViewCart);
	}

	@FindBy(xpath="//button[@class='Button_container__1m-3V Button_default__17dhw Button_small__9yESA style_CTAButton__3bWtz Button_fullWidth__dJpgT']")
    WebElement Container;
	public void Click_Container() {
		clickAction(Container);
	}
	
	@FindBy(xpath="//input[@id='mobile']")
	WebElement MobNo;
	public void EnterValueInMobNo(String MobileNo) {
		enter_value(MobNo, MobileNo);
	}
	
	@FindBy(xpath="//button[@class='Button_container__1m-3V Button_default__17dhw Button_default__17dhw MobileScreen_buttonContainer__3u0o0']")
	WebElement ButtonCon; 
	public void Click_ButtonCon() {
		clickAction(ButtonCon);
	}
//	
	@FindBy(xpath="//button[@class='Button_container__1m-3V Button_outlined__1XXZJ Button_default__17dhw SelectDeliveryAddress_addNewButton__2zvYP Button_fullWidth__dJpgT']")
	WebElement Clickon;
	public void Click_Clickon() {
		clickAction(Clickon);
	}
//	
//	
	
	
	
	
	
	
	
	
	
}
