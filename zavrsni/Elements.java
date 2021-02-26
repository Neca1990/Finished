package zavrsni;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Elements {

	
	private static final String SHIFTPLANING_XPATH = "//*[@id=\"sn_schedule\"]/span";
	private static final String TIME_CLOCK_XPATH = "//*[@id=\"sn_timeclock\"]/span";
	private static final String LEAVE_XPATH = "//*[@id=\"sn_requests\"]/span";
	private static final String TRAINING_XPATH = "/html/body/table/tbody/tr/td/div[7]/div/div[2]/ul/li[5]";
	private static final String STAFF_XPATH = "//*[@id=\"topMenu\"]/li[6]";
	public static final String URL_SHIFT = "https://faraway113.humanity.com/app/schedule/employee/week/overview/overview/25%2c1%2c2021/";
	public static final String URL_TIME = "https://faraway113.humanity.com/app/timeclock/";
	public static final String URL_LEAVE = "https://faraway113.humanity.com/app/requests/vacation/";
	public static final String URL_TRAINING = "https://faraway113.humanity.com/app/training/";
	public static final String URL_STAFF = "https://faraway113.humanity.com/app/staff/list/load/true/";
	public static final String URL_AVAILABILITY = "https://faraway113.humanity.com/fe/availability/#/requests/week/2021-02-21/1";
	public static final String URL_PAYROLL = "https://faraway113.humanity.com/app/payroll/scheduled-hours/";
	public static final String URL_REPORTS = "https://faraway113.humanity.com/app/reports/dashboard/";
	
	public static void ShiftPlaning (WebDriver driver) {
		driver.findElement(By.xpath(SHIFTPLANING_XPATH)).click();
	}
	public static void TiemClock (WebDriver driver) {
		driver.findElement(By.xpath(TIME_CLOCK_XPATH)).click();
	}
	public static void Leave (WebDriver driver) {
		driver.findElement(By.xpath(LEAVE_XPATH)).click();
	}
	public static void Training (WebDriver driver) {
		driver.findElement(By.xpath(TRAINING_XPATH)).click();
	}
	public static void Staff (WebDriver driver) {
		driver.findElement(By.xpath(STAFF_XPATH)).click();
	}
	public static void Availability (WebDriver driver) {
		driver.findElement(By.linkText("Availability")).click();
	}
	public static void Payroll (WebDriver driver) {
		driver.findElement(By.linkText("Payroll")).click();
	}
	public static void Reports (WebDriver driver) {
		driver.findElement(By.linkText("Reports")).click();
	}
	
}
