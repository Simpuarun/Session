package TicketBook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender {

	static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("onward_cal")).click();
		 String monthYearVal = driver.findElement(By.className("monthTitle")).getText(); 
		 System.out.println(monthYearVal);//Apr 2022
		 String month = monthYearVal.split(" ")[0].trim();
		 String year = monthYearVal.split(" ")[1].trim();
		
		while (!(month.equals("July") && year.equals("2022"))) {
			driver.findElement(By.xpath("//td[@class='next']")).click();
			monthYearVal = driver.findElement(By.className("monthTitle")).getText();
			
			System.out.println(monthYearVal);
			month = monthYearVal.split(" ")[0].trim();
			 year = monthYearVal.split(" ")[1].trim();
			
		}
		
		 driver.findElement(By.xpath("//td[text()='10']")).click();
	
	
	selectDate("16", "Jun", "2022");
	}
	
	
		public static String[] getMonthYear(String monthYear) {
			return monthYear.split(" ");
			
		}
		
		 public static void selectDate (String exDay, String exMonth, String exYear) {
			 String monthYear = driver.findElement(By.className("monthTitle")).getText(); 
			 System.out.println(monthYear);
		 
		 while (!(getMonthYear(monthYear)[0].equals(exMonth)) && getMonthYear(monthYear)[1].equals(exYear))

		 {
			 driver.findElement(By.xpath("//td[@class='next']")).click();
			 monthYear = driver.findElement(By.className("monthTitle")).getText();
		 }
			 
		 }
				 
		 
		

	}


