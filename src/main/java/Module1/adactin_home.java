
	package Module1;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


	public class adactin_home
	{
	
			//POM Class-II
			
			//1. Data members/Global Variables should be declared globally with access level private by using @Findby Annotation
			@FindBy(xpath="//input[@name='username_show']") private WebElement  UserShow;  //private WebElement UserShow=driver.findelement(By.xpath("//input[@name='username_show']"));	
			@FindBy(xpath="//a[text()='Logout']") private WebElement LogoutBtn; //private WebElement LogoutBtn=driver.findelement(By.xpath("//a[text()='Logout']"));	
			
			@FindBy(xpath="//a[text()='Click here to login again']") private WebElement Loginagain;
			
			
			//@FindBy(xpath="//a[text()='Click here to login again']") private WebElementLoginagain;
			@FindBy(xpath="//select[@id='location']") private WebElement Location;
			@FindBy(xpath="//select[@id='hotels']") private WebElement Hotels;
			@FindBy(xpath="//select[@id='room_type']") private WebElement RoomType;
			@FindBy(xpath="//select[@id='room_nos']") private WebElement NumberofRooms;
			@FindBy(xpath="//input[@id='datepick_in']") private WebElement CheckInDate;
			@FindBy(xpath="//input[@id='datepick_out']") private WebElement CheckOutDate;
			@FindBy(xpath="//select[@id='adult_room']") private WebElement AdultsperRoom;
			@FindBy(xpath="//select[@id='child_room']") private WebElement ChildrenperRoom;
			@FindBy(xpath="//input[@id='Submit']") private WebElement Searchbtn;
			@FindBy(xpath="//input[@id='radiobutton_0']") private WebElement Radiobtn;
			@FindBy(xpath="//input[@id='continue']") private WebElement ContinueBtn;
			@FindBy(xpath="//*[@id='first_name']") private WebElement FN;
			@FindBy(xpath="//*[@id='last_name']") private WebElement LN;
			@FindBy(xpath="//*[@id='address']") private WebElement BillingAddress;
			@FindBy(xpath="//*[@id='cc_num']") private WebElement CCN;
			@FindBy(xpath="//*[@id='cc_type']") private WebElement CCT;
			@FindBy(xpath="//*[@id='cc_exp_month']") private WebElement EDMonth;
			@FindBy(xpath="//select[@id='cc_exp_year']") private WebElement EDYear;
			@FindBy(xpath="//*[@id='cc_cvv']") private WebElement CVV;
			@FindBy(xpath="//*[@id='book_now']") private WebElement BookNowBtn;
				

			
			 //2. Initialize within a constructor with access level public using PageFactory Class
			public adactin_home(WebDriver driver)   //Information
			{
				PageFactory.initElements(driver,this);
			}
			
		//3. Utilize within a method with access level public
			 
			 public String getUsername()   
			 {
				String S1=UserShow.getAttribute("value");  //Hello Velocity!
				
				     String[]  A1=S1.split(" ");  //Hello[0]           Velocity![1]
				    
				     String Z1=A1[0];  //Hello[0]  
				      
				     String  ActualUN= A1[1]; //Velocity![1]
				     
		             return ActualUN;  //Velocity!
				     
			 }
			
			 public void clicklogoutbutton() 
			 {
				 LogoutBtn.click();
			 }
			
			 public void clickloginagainlink() 
			 {
				 Loginagain.click();
			 }
			 
			 public void SelectLocation(String loc)//Sydney
			 {
				 Select s1=new Select(Location);
				 s1.selectByVisibleText(loc);
			 }
			 public void SelectHotel(String ho)//Hotel Sunshine
			 {
				 Select s1=new Select(Hotels);
				 s1.selectByVisibleText(ho);
			 }
			 
			 public void SelectRoomType(String rt)
			 {
				 Select s1=new Select(RoomType);
				 s1.selectByVisibleText(rt);
				 
			 }
			 public void SelectNumberOfRooms(String rno)
			 {
				 Select s1=new Select(NumberofRooms);
				 s1.selectByVisibleText(rno);
			 }
			 public void ChechInDates(String cd)
			 {
				 CheckInDate.sendKeys(cd);
				 
			 }
			 public void ChechOutDates(String cod)
			 {
				 CheckOutDate.sendKeys(cod);
				 
				 
			 } public void AdultPerRoom(String apr)
			 {
				 Select S1=new Select(AdultsperRoom);
				 S1.selectByVisibleText(apr);
				 
			 }
			 public void ChildernPerRoom(String cr)
			 {
				 Select S1=new Select(AdultsperRoom);
				 S1.selectByVisibleText(cr);
				
			 }
			 
		public void SearchBtnClick()
		{
			Searchbtn.click();
		}
		public void RadioBtnClick()
		{
			Radiobtn.click();
		}
		public void ContinueBtn()
		{
			ContinueBtn.click();
		}
		
		public void EnterFirstName(String fn)
		{
			
			FN.sendKeys(fn);
		}
		
		public void EnterLastName (String ln)
		{
			LN.sendKeys(ln);
			
		}
		
		public void EnterBillingAddress(String ba)
		{
			BillingAddress.sendKeys(ba);
		}
		public void EnterCreditCardNo(String ccnno )
		{
			CCN.sendKeys(ccnno);
		}
		public void EnterCreditCardType(String cctype)
		{
			Select s1=new Select(CCT);
			s1.selectByVisibleText(cctype);
			
		}
		public void SelectEDMonth(String Edm)
		{
			Select s1=new Select(EDMonth);
			s1.selectByVisibleText(Edm);
		}
		 public void SelectEDYear(String EDY) //2030
		 {
			 Select S1=new Select(EDYear);
			 S1.selectByVisibleText(EDY);
		 }
	
		public void CVVNumber(String cvvno)
		{
			
			CVV.sendKeys(cvvno);
		}
		
		
		
		public void BookNowBtnClick()
		{
			BookNowBtn.click();
		}
		
		public void SearchHotelBtnclick()
		{
			Searchbtn.click();
		}
	}
	
	

