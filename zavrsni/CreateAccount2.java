package zavrsni;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAccount2 {

	private static final String FULL_NAME_XPATH = "//*[@id=\"popup-form\"]/div[1]/input";
	private static final String EMAIL_XPATH = "//*[@id=\"popup-form\"]/div[2]/input";
	public static final String XBTN_XPATH = "//*[@id=\"intercom-container\"]/div/span/div/div/div/span";
	private static final String SUBMITBTN_XPATH = "//*[@id=\"popup-free-trial-link\"]";
	private static final String COMPANY_XPATH = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[1]/div/div/input";
	private static final String PASSWORD_XPATH = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[5]/div/input";
	private static final String PASSWORD2_XPATH = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[6]/div/input";
	private static final String FUNTCION_XPATH = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[3]/div/div/span";
	private static final String PHONE_XPATH = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[4]/div/input";
	private static final String SUB_BTN2_XPATH = "//*[@id=\"root\"]/div/div/form/div[2]/span/input";
	private static final String INDUSTRY_XPATH = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[2]/div/div/span";
	private static final String BTN_XPATH = "//*[@id=\"walkme-balloon-462027\"]/div/div[1]/div[2]/div/div[2]/div/a";
	private static final String X_BTN_XPATH = "//*[@id=\"walkme-balloon-456078\"]/div/div[1]/div[2]/div/div[1]";
	private static final String XX_BTN_XPATH = "//*[@id=\"intercom-container\"]/div/span/div/div/div/span";
	
	public static void XX_Btn (WebDriver driver) {
		driver.findElement(By.xpath(XX_BTN_XPATH)).click();
	}
	public static void X_Btn (WebDriver driver) {
		driver.findElement(By.xpath(X_BTN_XPATH)).click();
	}
	public static void Btn (WebDriver driver) {
		driver.findElement(By.xpath(BTN_XPATH)).click();
	}
	public static void StartBtn (WebDriver driver) {
		driver.findElement(By.linkText("START MY FREE TRIAL")).click();
	}
	public static void XBtn (WebDriver driver) {
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
		WebElement we1 = driver.findElement(By.xpath(INDUSTRY_XPATH));
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
