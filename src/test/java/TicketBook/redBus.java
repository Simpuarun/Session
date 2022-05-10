package TicketBook;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class redBus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='M6CB1c rr4y5c']")).click();
	
		
		driver.findElement(By.id("input")).sendKeys("redbus");
		List<WebElement> listitem = driver.findElements(By.xpath("//li[@class='sbct']//span"));
		
		System.out.println(listitem.size());
		
		
		for(WebElement k : listitem)
		{
			if(k.getText().equals(" customer care number"));
			System.out.println(k);
			k.click();
		}
		
		
			
		
		
		
		
		
		
		
	}

}
