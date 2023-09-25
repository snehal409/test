package Library_Files;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class utilityclass
{
	//Name: Snehal
			//Date: 14/9/2023
			//Day: Thursday
			//To fetch data from Properties File
	@Test                      //UserName   Password
	public static String getDataFromPF(String key) throws IOException 
	{
		
		//To reach upto Property File
	FileInputStream file=new FileInputStream("C:\\Users\\shree\\eclipse-workspace\\maven_Project\\PropertyFile.properties");
		
	//Create Object of Properties Class
	Properties Prop=new Properties();
	
	//To Open property File
	  Prop.load(file);
	
	//To fetch data/value from Property File
	String  Value1=Prop.getProperty(key);   //UserName---->Velocity    
	                                       //Password---->C4472J
	  return Value1;  //Velocity   //U1YP1G 
	
	}
	
	    //Name: Snehal
		//Date: 14/9/2023
		//Day: Thursday
		//To fetch data from Excelsheet
	
	@Test                                             //1            //0
	public static String getDatafromExcelsheet(int  RowIndex, int CellIndex) throws EncryptedDocumentException, IOException 
	{
		
		//To reach upto Excelsheet
		FileInputStream file=new FileInputStream("C:\\Users\\shree\\eclipse-workspace\\maven_Project\\TestData\\file.xlsx");
		                                                                  //1                 //0
	String	Value2=WorkbookFactory.create(file).getSheet("Sheet2").getRow(RowIndex).getCell(CellIndex).getStringCellValue(); //Velocity!
		                                                                                                   //Adactin.com - Hotel Reservation System                  
		return Value2;  //Velocity!  // Adactin.com - Hotel Reservation System
	}

    //Name:Snehal
	//Date: 15/9/2023
		//Day: Friday
		//To Capture Screenshot of Failed Test Cases
	
	@Test                                                           //TC101
	public static void CaptureScreenshot(WebDriver driver, String TestCaseID) throws IOException
	{
        File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		System.out.println(Source);
		                                                        //TC101
		File Destination=new File("C:\\Users\\shree\\eclipse-workspace\\maven_Project\\screenshot\\"+TestCaseID+".jpg");
		
		FileHandler.copy(Source,Destination);
	}
	/* File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			System.out.println(Source);
			                                                        //TC101
			File Destination=new File("E:\\testing\\test1.jpg");
			
			FileHandler.copy(Source,Destination);*/
	
	
	
		
		
}