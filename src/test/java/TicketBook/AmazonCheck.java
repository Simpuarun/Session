@123
package TicketBook;


import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonCheck {
	
	static WebDriver driver;
	
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458712209&hvpos=&hvnetw=g&hvrand=10649741709563653988&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061909&hvtargid=kwd-10573980&hydadcr=14453_2154373&gclid=Cj0KCQjw37iTBhCWARIsACBt1Iz3LsGh6qJJ4kOaFqOoe7zvGbcIh2XKERZiUsx0cyWu28_NBaid03EaArABEALw_wcB");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("7708165393");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Sakthi@1390");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles" + Keys.ENTER);
		List<WebElement> listitem =driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		System.out.println(listitem.size());
		
		for(WebElement list1 : listitem)
		{
			
			System.out.println(list1.getText());
		} 
		
		listitem.get(2).click();

		
			Set<String> Window = driver.getWindowHandles();
			java.util.Iterator<String> it = Window.iterator();
			String tab1 = it.next();
			String tab2 = it.next();
			
			driver.switchTo().window(tab2);
			driver.findElement(By.id("add-to-cart-button")).click();
			
			
		}
		
	}
	

	
		
		
		
		
		
		
		
		
	


