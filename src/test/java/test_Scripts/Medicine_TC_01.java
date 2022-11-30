package test_Scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.Medicine;

public class Medicine_TC_01 extends Base_Test {

	@Test(dataProvider="testData")
	public void PharmEasy(String [] testData) throws InterruptedException {
		Medicine Med= new Medicine(driver);
		Med.Click_Med();
		Med.Click_OrderViaP();
		Med.EnterValueInMedPath(testData[0]);		
		Med.Click_OrderMed();
		Med.Click_SelectPin();
		Med.EnterValueInPincode(testData[1]);
		Med.Click_CheckButton();
		Thread.sleep(2000);
		Med.EnterValueInMedNmae(testData[2]);
		Thread.sleep(2000);
		Med.Click_SearchClick();
		Thread.sleep(3000);
		Med.Click_AddToCart();
		Thread.sleep(2000);
		Med.Click_Quantity() ;
		Thread.sleep(2000);
		Med.Click_ViewCart();
		Thread.sleep(2000);
		Med.Click_Container();
		Thread.sleep(2000);
		Med.EnterValueInMobNo(testData[3]);
		Thread.sleep(2000);
		Med.Click_ButtonCon();
		Thread.sleep(2000);
		Med.Click_Clickon();
	
	}
	@DataProvider(name="testData")
	public String[][] getTestData() throws IOException {
		String[][] testdata=ReadExcel.getMultipleData("Sheet1");
		return testdata;
		}
	}

