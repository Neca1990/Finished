package zavrsni;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAccount1 {
	
	private static final String FULL_NAME_XPATH = "//*[@id=\"top-form\"]/div/div[1]/input";
	private static final String EMAIL_XPATH = "//*[@id=\"top-form\"]/div/div[2]/input";
	public static final String XBTN_XPATH = "//*[@id=\"tcp-modal\"]/div/div/div[1]/button";
	private static final String SUBMITBTN_XPATH = "//*[@id=\"free-trial-link-01\"]";
	private static final String COMPANY_XPATH = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[1]/div/div/input";
	private static final String PASSWORD_XPATH = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[5]/div/input";
	private static final String PASSWORD2_XPATH = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[6]/div/input";
	private static final String FUNTCION_XPATH = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[3]/div/div/img";
	private static final String PHONE_XPATH = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[4]/div/input";
	private static final String SUB_BTN2_XPATH = "//*[@id=\"root\"]/div/div/form/div[2]/span/input";
	
	
	public static void Cookies (WebDriver driver) {
		driver.findElement(By.xpath(XBTN_XPATH)).click();
	}
	public static void FullName(WebDriver driver, String FullName) {
	WebElement we1 = driver.findElement(By.xpath(FULL_NAME_XPATH));
	we1.click();
	we1.sendKeys(FullName);
	}
	public static void Email (WebDriver driver, String Email) {
		WebElement we2 = driver.findElement(By.xpath(EMAIL_XPATH));
		we2.click();
		we2.sendKeys(Email);
	
	}
	public static void SubmitBtn (WebDriver driver) {
		driver.findElement(By.xpath(SUBMITBTN_XPATH)).click();
	}
	public static void CompanyName (WebDriver driver, String CompanyName) {
		WebElement we1 = driver.findElement(By.xpath(COMPANY_XPATH));
		we1.click();
		we1.sendKeys(CompanyName);
	}
	public static void Industry (WebDriver driver) {
		WebElement we1 = driver.findElement(By.className("placeholder-select"));
		we1.click();
		we1.sendKeys(Keys.ARROW_DOWN);
		we1.sendKeys(Keys.ARROW_DOWN);
		we1.sendKeys(Keys.ARROW_DOWN);
		we1.sendKeys(Keys.ARROW_DOWN);
		we1.sendKeys(Keys.ARROW_DOWN);
		we1.sendKeys(Keys.ENTER);
	}
	public static void Functionalrole (WebDriver driver) {
		WebElement we1 = driver.findElement(By.xpath(FUNTCION_XPATH));
		we1.click();
		we1.sendKeys(Keys.ARROW_DOWN);
		we1.sendKeys(Keys.ARROW_DOWN);
		we1.sendKeys(Keys.ARROW_DOWN);
		we1.sendKeys(Keys.ARROW_DOWN);
		we1.sendKeys(Keys.ARROW_DOWN);
		we1.sendKeys(Keys.ENTER);
	}
	public static void Phone(WebDriver driver, String number) {
	WebElement we1 = driver.findElement(By.xpath(PHONE_XPATH));
	we1.click();
	we1.sendKeys(number);
	}
	public static void Password(WebDriver driver, String password) {
		WebElement we1 = driver.findElement(By.xpath(PASSWORD_XPATH));
		we1.click();
		we1.sendKeys(password);
		}
	public static void Password2(WebDriver driver, String password2) {
		WebElement we1 = driver.findElement(By.xpath(PASSWORD2_XPATH));
		we1.click();
		we1.sendKeys(password2);
		}
	public static void SubmitBtn2 (WebDriver driver) {
		driver.findElement(By.xpath(SUB_BTN2_XPATH)).click();
	}
	
}
