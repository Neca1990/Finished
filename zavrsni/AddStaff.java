package zavrsni;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class AddStaff {
	
	private static final String ADD_BTN_XPATH = "//*[@id=\"act_primary\"]";
	private static final String EMAIL_XPATH = "//*[@id=\"_ase1\"]";
	private static final String SAVE_BTN_XPATH = "//*[@id=\"_as_save_multiple\"]";
	private static final String SIMPLE_POSITION_XPATH = "//*[@id=\"_cd_staff\"]/div[2]/div[2]/table/tbody/tr/td[2]/div[2]/div/table/tbody/tr[5]/td[2]/label/input";
	private static final String ALL_STAFF_XPATH = "//*[@id=\"StaffSchedules\"]/ul[1]/li[1]/a";
	public static final String URL_CHECK_ALL_STAFF = "https://faraway113.humanity.com/app/staff/list/load/0/";
	private static final String EMPLOYEE_NAME_XPATH = "//*[@id=\"7\"]/a";
	private static final String EDIT_DETAILS_XPATH = "//*[@id=\"_cd_staff\"]/div[2]/div[2]/div[1]/a[2]";

	
	public static void AddBtn (WebDriver driver) {
		driver.findElement(By.xpath(ADD_BTN_XPATH)).click();
	}
	public static void FirstName (WebDriver driver, String FirstName) {
		WebElement we1 = driver.findElement(By.xpath("//*[@id=\"_asf1\"]"));
		we1.click();
		we1.sendKeys(FirstName);
	}
	public static void LastName (WebDriver driver, String LastName) {
		WebElement we1 = driver.findElement(By.xpath("//*[@id=\"_asl1\"]"));
		we1.click();
		we1.sendKeys(LastName);
	}
	public static void StaffEmail (WebDriver driver, String Email) {
		WebElement we2 = driver.findElement(By.xpath(EMAIL_XPATH));
		we2.click();
		we2.sendKeys(Email);
	}
	public static void SaveBtn (WebDriver driver) {
		driver.findElement(By.xpath(SAVE_BTN_XPATH)).click();
	}
	public static void SimplePositons (WebDriver driver) {
		driver.findElement(By.xpath(SIMPLE_POSITION_XPATH)).click();
	}
	public static void All (WebDriver driver) {
		driver.findElement(By.xpath(ALL_STAFF_XPATH)).click();
	}
	public static void EmployeeName (WebDriver driver) {
		driver.findElement(By.xpath(EMPLOYEE_NAME_XPATH)).click();
	}
	public static void EditeDetails (WebDriver driver) {
		driver.findElement(By.xpath(EDIT_DETAILS_XPATH)).click();
	}
	public static void FirstNameChange (WebDriver driver, String FirstName) {
		WebElement we1 = driver.findElement(By.name("first_name"));
		we1.click();
		we1.clear();
		we1.sendKeys(FirstName);
	}
	public static void LastNameChange (WebDriver driver, String LastName) {
		WebElement we1 = driver.findElement(By.name("last_name"));
		we1.click();
		we1.clear();
		we1.sendKeys(LastName);
	}
	public static void ARROW_DOWN (WebDriver driver) {
		for (int i =0; i < 48;i++) {
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		}
	}
	public static void SaveEmployeeBtn (WebDriver driver) {
		driver.findElement(By.className("dia_submit")).click();
	}
	public static void UploadPicture(WebDriver driver) {
		 WebElement w = driver.findElement(By.id("fileupload"));
	        w.sendKeys("C:\\Users\\Nemanja\\Desktop");
	    
	}
}
