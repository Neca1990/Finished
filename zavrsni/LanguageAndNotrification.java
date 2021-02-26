package zavrsni;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class LanguageAndNotrification {

	private static final String SETTING_XPATH = "//*[@id=\"sn_admin\"]/span/i";
	private static final String LANGGUAUGE_XOATH = "//*[@id=\"adminSettingsForm\"]/div[1]/table/tbody/tr[3]/td[2]/select";
	private static final String VIA_EMAIL_BTN_XPATH = "//*[@id=\"adminSettingsForm\"]/div[2]/table/tbody/tr[1]/td[2]";
	private static final String VIA_SMS_BTN_XPATH = "//*[@id=\"pref_pref_sms\"]";
	private static final String VIA_MOBILE_BTN_XPATH = "//*[@id=\"pref_pref_mobile_push\"]";
	private static final String SAVE_BTN_XPATH = "//*[@id=\"_save_settings_button\"]";	

	public static void SettingsBtn (WebDriver driver) {
		driver.findElement(By.xpath(SETTING_XPATH)).click();
	}
	public static void SlecetdLanguage (WebDriver driver) {      
        Select sel = new Select(driver.findElement(By.xpath(LANGGUAUGE_XOATH)));
        sel.selectByVisibleText("Serbian");
	}
	public static void ARROW_DOWN (WebDriver driver) {
		for (int i =0; i < 10;i++) {
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		}
	}
	public static void ARROW_DOWN2 (WebDriver driver) {
		for (int i =0; i < 17;i++) {
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		}
		}
		public static void ViaEmailBtn (WebDriver driver) {
			driver.findElement(By.xpath(VIA_EMAIL_BTN_XPATH)).click();
		}
		public static void ViaSMSBtn (WebDriver driver) {
			driver.findElement(By.xpath(VIA_SMS_BTN_XPATH)).click();
		}
		public static void Via_mobileBtn (WebDriver driver) {
			driver.findElement(By.xpath(VIA_MOBILE_BTN_XPATH)).click();
		}
		public static void SaveBtn (WebDriver driver) {
			driver.findElement(By.xpath(SAVE_BTN_XPATH)).click();
		}
	
}
