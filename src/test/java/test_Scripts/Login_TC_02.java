package test_Scripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.LoginPage;
import pom_scripts.Medicine;
import pom_scripts.MedicineLogin;

public class Login_TC_02 extends Base_Test{

	@Test(dataProvider="testData")
	public void PharmEasy(String [] testData) throws InterruptedException {
		MedicineLogin log= new MedicineLogin(driver);
		log.Click_HelloLogin();
		log.EnterValueInMobNo(testData[0]);
		log.Click_ClickonOtp();
		log.SendOtp();
}
	@DataProvider(name="testData")
	public String[][]getTestData() throws IOException {
		String[][] testdata=ReadExcel.getMultipleData("Sheet2");
		return testdata;
		}
}
