package module_test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library_Files.baseclass;
import Library_Files.utilityclass;
import Module1.adactin_home;
import Module1.login_adactin;


public class testclass extends baseclass
{
	//public WebDriver driver;
		//InitilizeBrowser()
		
	login_adactin Login;
	adactin_home Home;
	String TestCaseID;
		
		@BeforeClass
		public void OpenBrowser() 
		{
			InitilizeBrowser();
			
			//Create Object Of POM-I
			Login=new login_adactin(driver);
			
			//Create Object Of POM-II
			Home=new adactin_home(driver);
			
			
		}
			
		@BeforeMethod
		public void LoginToAPP() throws IOException 
		{
			//Enter UN-->PF
			Login.enterUsername(utilityclass.getDataFromPF("UserName"));  //Velocity
			
			//Enter PSW-->PF
			Login.enterPassword(utilityclass.getDataFromPF("Password"));   //C4472J 
		
			//Click Login Button
			Login.clickloginbutton();
			
		
		}
		
		@Test(priority=1)                          //Test Method/case
		public void VerifyUserName() throws EncryptedDocumentException, IOException 
		{
			TestCaseID="TC100";
			//ActualUserName  
		String	ActualUserName=Home.getUsername();  //Velocity!
				
			//ExpectedUsername
		String ExpectedUsername=utilityclass.getDatafromExcelsheet(2,1);  //Velocity!
		
		Assert.assertEquals(ActualUserName,ExpectedUsername);  //Velocity!   //Velocity!
		
		}
		
		@Test(priority=2)  
		

		public void GetTitleofApp() throws EncryptedDocumentException, IOException 
		{
			TestCaseID="TC101";
			String ActualTitle=driver.getTitle();  // Adactin.com - Search Hotel
			
			String ExpectedTitle=utilityclass.getDatafromExcelsheet(3, 1);  // Adactin.com - Search Hotel
		
			Assert.assertEquals(ActualTitle,ExpectedTitle); 
		}
		
		
		
		@Test(priority=3)
		public void BookAHotel() throws EncryptedDocumentException, IOException
		
		{
			TestCaseID="TC102";
			
			Home.SelectLocation(utilityclass.getDatafromExcelsheet(0, 2)); // Sydney
			Home.SelectHotel(utilityclass.getDatafromExcelsheet(1, 2)); //Hotel Sunshine
			Home.SelectRoomType(utilityclass.getDatafromExcelsheet(2, 2)); // Double
			Home.SelectNumberOfRooms(utilityclass.getDatafromExcelsheet(3, 2)); //4 - Four			Home.ChechInDates(utilityclass.getDatafromExcelsheet(4, 2)); //15-10-2023
			Home.ChechInDates(utilityclass.getDatafromExcelsheet(4, 2)); //15-10-2023
			Home.ChechOutDates(utilityclass.getDatafromExcelsheet(5, 2)); //18-10-2023
			Home.AdultPerRoom(utilityclass.getDatafromExcelsheet(6,2));  //2 - Two
			Home.ChildernPerRoom(utilityclass.getDatafromExcelsheet(7,2));//1 - One
			Home.SearchBtnClick();
			Home.RadioBtnClick();
			Home.ContinueBtn();
			Home.EnterFirstName(utilityclass.getDatafromExcelsheet(0, 3)); //Java
			Home.EnterLastName(utilityclass.getDatafromExcelsheet(1, 3)); //Selenium
			Home.EnterBillingAddress(utilityclass.getDatafromExcelsheet(2, 3)); //ABCD Road Pune
			Home.EnterCreditCardNo(utilityclass.getDatafromExcelsheet(3, 3)); //1234567890123450
			Home.EnterCreditCardType(utilityclass.getDatafromExcelsheet(4, 3));// VISA
			Home.SelectEDMonth(utilityclass.getDatafromExcelsheet(5, 3));//March
			Home.SelectEDYear(utilityclass.getDatafromExcelsheet(6, 3)); //2030

			Home.CVVNumber(utilityclass.getDatafromExcelsheet(7, 3));//1987
			Home.BookNowBtnClick();

		}
		
		@AfterMethod
		public void LogoutFromApp(ITestResult  Result) throws IOException 
		{
			
			if(Result.getStatus()==Result.FAILURE)
			{
				utilityclass.CaptureScreenshot(driver, TestCaseID);
			}
			Home.clicklogoutbutton();
			Home.clickloginagainlink();
			
		}
		
		@AfterClass
		public void CloseBrowser() 
		{
			driver.quit();
		}
		
		
	
}
		
		
		

		
	
		/*
		
		
		@Test                     //Test Method/case
		public void SearchHotel() 
		{
			Reporter.log("Running Method TC1: Search Hotel", true);
		}
		
		@AfterMethod
		public void LogoutFromApp() 
		{
			Reporter.log("Logout from App", true);
		}
		@AfterClass
		public void CloseBrowser()
		{
			Reporter.log("Close Browser",true);
		}
		
		
		
		*/
	