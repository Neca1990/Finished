package zavrsni;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;




public class Testing {
	
	private static WebDriver driver;
	public static final String URL = "https://www.humanity.com/wizard-setup2/";
	public static final String URL2 = "https://faraway113.humanity.com/app/dashboard/";
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\ChromeDriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void odlazakNaStranicu() {
		driver.navigate().to(HomePage.URL);
		String actual = driver.getCurrentUrl();
		String expected = HomePage.URL;
		driver.manage().window().maximize();
		CreateAccount1.Cookies(driver);
		driver.manage().deleteAllCookies();
		Assert.assertEquals(actual, expected);
	}
	@Test (priority = 1)
	public void StartMyFreeTrial() {
		String FullName = "Michael Jackson";
		String Email = "oneandonly@gmail.com";
		CreateAccount1.FullName(driver,FullName);
		CreateAccount1.Email(driver, Email);
		CreateAccount1.SubmitBtn(driver);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String actual = driver.getCurrentUrl();
		String expected = URL;		
		Assert.assertEquals(actual, expected);
	}
	@Test (priority = 2)
	public void StartSchedulingToday() {
		String CompanyName = "Far away";
		String number = "0641234567";
		String password = "niko123";
		String password2 = "niko123";
		CreateAccount1.CompanyName(driver, CompanyName);
		CreateAccount1.Industry(driver);
		CreateAccount1.Functionalrole(driver);
		CreateAccount1.Phone(driver, number);	
		CreateAccount1.Password(driver, password);
		CreateAccount1.Password2(driver, password2);
		CreateAccount1.SubmitBtn2(driver);
		String actual = driver.getCurrentUrl();
		String expected = URL2;		
		Assert.assertEquals(actual, expected);
		
	}
	@Test (priority = 3)
	public void LogOut() throws InterruptedException {
		LogIn.SingOutBtn(driver);
		LogIn.SingOut(driver);
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		driver.navigate().to(HomePage.URL);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String actual = driver.getCurrentUrl();
		String expected = HomePage.URL;		
		Assert.assertEquals(actual, expected);
	}
	@Test (priority = 4)
	public void StartMyFreeTrialSecond() {
		String FullName = "The Best";
		String Email = "simplethebest@gmail.com";
		CreateAccount2.StartBtn(driver);
		CreateAccount2.FullName(driver,FullName);
		CreateAccount2.Email(driver, Email);
		CreateAccount2.SubmitBtn(driver);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String actual = driver.getCurrentUrl();
		String expected = URL;		
		Assert.assertEquals(actual, expected);
		
	}
	@Test (priority = 5)
	public void StartSchedulingTodaySecond() {
		String CompanyName = "Far away1";
		String number = "0641234567";
		String password = "niko123";
		String password2 = "niko123";
		driver.manage().deleteAllCookies();
		CreateAccount2.CompanyName(driver, CompanyName);
		CreateAccount2.Industry(driver);
		CreateAccount2.Functionalrole(driver);
		CreateAccount2.Phone(driver, number);
		CreateAccount2.Password(driver, password);
		CreateAccount2.Password2(driver, password2);
		CreateAccount2.SubmitBtn2(driver);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String URL22 = driver.getCurrentUrl().toString();
		String actual = driver.getCurrentUrl().toString();
		String expected = URL22;	
		Assert.assertEquals(actual, expected);
		driver.manage().deleteAllCookies();
	}
	@Test (priority = 4)
	public void AboutUS () throws Exception {
		driver.navigate().to(HomePage.URL);
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[6]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[6]/ul/li[1]/a")).click();
		takeSnapShot ("About US");  
		Assert.assertEquals("https://www.humanity.com/about", driver.getCurrentUrl());
		
		boolean isEmpty = true;
		try {
			driver.getCurrentUrl();
		} catch (Exception e) {
			isEmpty=false;
		}
		Assert.assertTrue(isEmpty, "[ERROR] niste na stranici");
	}
	@Test (priority = 5)
	public void LogIn() {
		driver.navigate().to(HomePage.URL);
		String Email= "pleasecomone@gmail.com";
		String Password = "niko123";
		LogIn.HomeLogIn(driver);
		LogIn.Email(driver, Email);
		LogIn.Password(driver, Password);
		LogIn.LogInBTN(driver);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String actual = driver.getCurrentUrl();
		String expected = URL2;
		Assert.assertEquals(actual, expected);
	}
	@Test (priority = 6)
	public void Elements() throws InterruptedException {
		SoftAssert sa = new SoftAssert();
		Thread.sleep(2000);
		Elements.ShiftPlaning(driver);
		String actual = driver.getCurrentUrl();
		String expected = Elements.URL_SHIFT;
		sa.assertEquals(actual, expected);
		
		Elements.TiemClock(driver);
		String actual1 = driver.getCurrentUrl();
		String expected1 = Elements.URL_TIME;
		sa.assertEquals(actual1, expected1);
	
		Elements.Leave(driver);
		Thread.sleep(3000);
		String actual2 = driver.getCurrentUrl();
		String expected2 = Elements.URL_LEAVE;
		sa.assertEquals(actual2, expected2);
		
		Elements.Training(driver);
		String actual3 = driver.getCurrentUrl();
		String expected3 = Elements.URL_TRAINING;
		sa.assertEquals(actual3, expected3);
		
		Elements.Staff(driver);
		Thread.sleep(2000);
		String actual4 = driver.getCurrentUrl();
		String expected4= Elements.URL_STAFF;
		sa.assertEquals(actual4, expected4);
		Elements.Availability(driver);
		Thread.sleep(9000);
		String actual5 = driver.getCurrentUrl();
		String expected5 = Elements.URL_AVAILABILITY;
		sa.assertEquals(actual5, expected5);
		Elements.Payroll(driver);
		Thread.sleep(7000);
		String actual6 = driver.getCurrentUrl();
		String expected6 = Elements.URL_PAYROLL;
		sa.assertEquals(actual6, expected6);
		Elements.Reports(driver);
		String actual7 = driver.getCurrentUrl();
		String expected7 = Elements.URL_REPORTS;
		sa.assertEquals(actual7, expected7);
		sa.assertAll();
	}
	@Test (priority = 7)
	public void AddSraff() throws InterruptedException {
		String Email= "radisaddadada@gmail.com";
		String FirstName = "Stefan";
		String LastName = "Popovic";
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		Elements.Staff(driver);
		Thread.sleep(2000);
		AddStaff.AddBtn(driver);
		Thread.sleep(2000);
		AddStaff.FirstName(driver, FirstName);
		Thread.sleep(2000);
		AddStaff.LastName(driver, LastName);
		Thread.sleep(2000);
		AddStaff.StaffEmail(driver, Email);
		Thread.sleep(2000);
		AddStaff.SaveBtn(driver);
		Thread.sleep(3000);
		AddStaff.SimplePositons(driver);
		Thread.sleep(3000);
		AddStaff.All(driver);
		Thread.sleep(5000);
		String actual = driver.findElement(By.id("7")).getText().toString();
		String expected = "Stefan Popovic";
		Assert.assertEquals(actual, expected);
	}
	@Test (priority = 8)
	public void ChangeEmployeeName() throws InterruptedException {
		String FirstName = "Nikola";
		String LastName = "Nikolic";
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		Elements.Staff(driver);
		Thread.sleep(2000);
		AddStaff.EmployeeName(driver);
		Thread.sleep(2000);
		AddStaff.EditeDetails(driver);
		Thread.sleep(2000);
		AddStaff.FirstNameChange(driver, FirstName);
		Thread.sleep(2000);
		AddStaff.LastNameChange(driver, LastName);
		Thread.sleep(2000);
		AddStaff.ARROW_DOWN(driver);
		Thread.sleep(4000);
		AddStaff.SaveEmployeeBtn(driver);
		Thread.sleep(2000);
		Elements.Staff(driver);
		String actual = driver.findElement(By.id("7")).getText().toString();
		String expected = "Nikola Nikolic";
		Assert.assertEquals(actual, expected);
	}
	@Test (priority = 9)
	public void UploadPicture() throws InterruptedException {
		Elements.Staff(driver);
		Thread.sleep(2000);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		AddStaff.EmployeeName(driver);
		Thread.sleep(2000);
		AddStaff.EditeDetails(driver);
		Thread.sleep(2000);
		AddStaff.EditeDetails(driver);
		Thread.sleep(2000);
		AddStaff.UploadPicture(driver);
		Thread.sleep(12000);
		Elements.Staff(driver);
		Thread.sleep(2000);
		String actual = driver.getCurrentUrl();
		String expected = Elements.URL_STAFF;
		Assert.assertEquals(actual, expected);
	}
	@Test (priority = 10)
	public void CorectLogin() throws InterruptedException {
	File f = new File("Data.xlsx"); 
	try {
		InputStream inp = new FileInputStream(f); 
		XSSFWorkbook wb = new XSSFWorkbook(inp); 
		Sheet sheet = wb.getSheetAt(0); 
	
		SoftAssert sa = new SoftAssert();
		Elements.Staff(driver);
		Thread.sleep(3000);
		for(int i = 0; i < 5; i++) {
			Row row = sheet.getRow(i); 
			Cell c1 =row.getCell(0);
			Cell c2 =row.getCell(1);
			Cell c3 =row.getCell(2);
			
			String FirstName = c1.toString();
			String LastName = c2.toString();
			String Email = c3.toString();
			
			AddStaff.AddBtn(driver);
			Thread.sleep(2000);
			AddStaff.FirstName(driver, FirstName);
			Thread.sleep(2000);
			AddStaff.LastName(driver, LastName);
			Thread.sleep(4000);
			AddStaff.StaffEmail(driver, Email);
			Thread.sleep(4000);
			AddStaff.SaveBtn(driver);
			Thread.sleep(3000);
			AddStaff.SimplePositons(driver);
			Thread.sleep(3000);
			Elements.Staff(driver);
			Thread.sleep(3000);
			String actual = driver.getCurrentUrl();
			String expected = Elements.URL_STAFF;
			sa.assertEquals(actual, expected);
		}
		sa.assertAll();
	}
	 catch (IOException e) {
		System.out.println("Nije pronadjen fajl!");
		e.printStackTrace();
	}
	}
	@Test (priority = 11)
	public void Lang() throws InterruptedException {
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		LanguageAndNotrification.SettingsBtn(driver);
		Thread.sleep(3000);
		LanguageAndNotrification.SlecetdLanguage(driver);
		Thread.sleep(3000);
		LanguageAndNotrification.ARROW_DOWN(driver);
		Thread.sleep(3000);
		LanguageAndNotrification.ViaEmailBtn(driver);
		Thread.sleep(3000);
		LanguageAndNotrification.ViaSMSBtn(driver);
		Thread.sleep(3000);
		LanguageAndNotrification.Via_mobileBtn(driver);
		Thread.sleep(3000);
		LanguageAndNotrification.ARROW_DOWN2(driver);
		Thread.sleep(3000);
		LanguageAndNotrification.SaveBtn(driver);
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		String actual = driver.findElement(By.xpath("//*[@id=\"_save_settings_button\"]")).getText().toString();
		String expected = "Sacuvaj Podesavanja";
		Assert.assertEquals(actual, expected);
	}
	@Test (priority = 12)
	public void ProfileSettings() throws InterruptedException {
		SoftAssert sa = new SoftAssert();
		String NickName = "Genije";
		String Address = "Topolska 18";
		LogIn.SingOutBtn(driver);
		Thread.sleep(3000);
		ProfileSettings.EditeBtn(driver);
		Thread.sleep(4000);
		ProfileSettings.ProfileBtn(driver);
		Thread.sleep(3000);
		ProfileSettings.NickName(driver, NickName);
		Thread.sleep(3000);
		ProfileSettings.ARROW_DOWN(driver);
		Thread.sleep(3000);
		ProfileSettings.Address(driver, Address);
		Thread.sleep(3000);
		ProfileSettings.ARROW_DOWN2(driver);
		Thread.sleep(3000);
		ProfileSettings.SaveBtn(driver);
		String actual = driver.findElement(By.id("nick_name")).getText().toString();
		String expected = "Genije";
		sa.assertEquals(actual, expected);
		String actual1 = driver.findElement(By.id("address")).getText().toString();
		String expected1 = "Topolska 18";
		sa.assertEquals(actual1, expected1);
		sa.assertEquals(actual, expected);
	}
		@AfterTest
		public void takeSnapShot(String fileWithPath) throws Exception{

	        TakesScreenshot scrShot =((TakesScreenshot)driver);

	        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);


	           File DestFile=new File("G:\\Dokumentacija od predavanja\\Java Snimci\\ZavrsniGotovoo"+ fileWithPath + ".jpg");
	  
	            FileUtils.copyFile(SrcFile, DestFile);
		}
		public void End() {
			driver.quit();
		}
}
