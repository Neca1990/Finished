package zavrsni;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfileSettings {
	
	private static final String NICK_ID = "nick_name";
	private static final String ADDRESS_ID = "address";
	private static final String EDITE_BTN_XPATH = "//*[@id=\"_cd_staff\"]/div[2]/div[2]/div[1]/a[2]";
	private static final String SAVE_BTN_XPATH = "//*[@id=\"NewEmployeeForm\"]/table/tbody/tr[42]/td/input";
	
	public static void SaveBtn (WebDriver driver) {
		driver.findElement(By.xpath(SAVE_BTN_XPATH)).click();
	}
	public static void EditeBtn (WebDriver driver) {
		driver.findElement(By.xpath(EDITE_BTN_XPATH)).click();
	}
	public static void ProfileBtn (WebDriver driver) {
		driver.findElement(By.id("6081236")).click();
	}
	public static void NickName (WebDriver driver, String NickName) {
		WebElement we1 = driver.findElement(By.id(NICK_ID));
		we1.click();
		we1.sendKeys(NickName);
	}
	public static void Address (WebDriver driver, String Address) {
		WebElement we1 = driver.findElement(By.id(ADDRESS_ID));
		we1.click();
		we1.sendKeys(Address);
	}
	public static void ARROW_DOWN (WebDriver driver) {
		for (int i =0; i < 25;i++) {
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		}
	}
	public static void ARROW_DOWN2 (WebDriver driver) {
		for (int i =0; i < 30;i++) {
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		}
		}
}
