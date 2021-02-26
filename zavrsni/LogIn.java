package zavrsni;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogIn {
	
	private static final String HOME_LOG_BTN_XPATH = "//*[@id=\"navbarSupportedContent\"]/div/a[2]/p";
	private static final String EMAIL_XPATH = "//*[@id=\"email\"]";
	private static final String PASSWORD_XPATH = "//*[@id=\"password\"]";
	private static final String LOGIN_BTN_XPATH = "//*[@id=\"LoginForm\"]/div[3]/div/button[1]";
	private static final String SING_OUT_BTN_XPATH = "//*[@id=\"wrap_us_menu\"]/i";
	private static final String SING_OUT_XPATH = "//*[@id=\"userm\"]/div/div[5]/a";
	
	public static void HomeLogIn (WebDriver driver) {
		driver.findElement(By.xpath(HOME_LOG_BTN_XPATH)).click();
	}
	public static void Email(WebDriver driver, String Email) {
		WebElement we1 = driver.findElement(By.xpath(EMAIL_XPATH));
		we1.click();
		we1.sendKeys(Email);
		}
	public static void Password(WebDriver driver, String Password) {
		WebElement we1 = driver.findElement(By.xpath(PASSWORD_XPATH));
		we1.click();
		we1.sendKeys(Password);
		}
	public static void LogInBTN(WebDriver driver) {
		driver.findElement(By.xpath(LOGIN_BTN_XPATH)).click();
	}
	public static void SingOutBtn (WebDriver driver) {
		driver.findElement(By.xpath(SING_OUT_BTN_XPATH)).click();
	}
	public static void SingOut (WebDriver driver) {
		driver.findElement(By.xpath(SING_OUT_XPATH)).click();
	}
}
