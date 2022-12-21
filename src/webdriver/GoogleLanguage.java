package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLanguage {
	
	public static WebDriver driver;
	
	public static void openURL( ) {
	System.setProperty("webdriver.chrome.driver", "E:\\library\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();		
	}	
	public static void Hindi() {
	driver.findElement(By.xpath("//div[@id='SIvCob']/a[1]")).click();
	driver.findElement(By.linkText("English")).click();			
	}
	
	public static void Bengali() {
		driver.findElement(By.xpath("//div[@id='SIvCob']/a[2]")).click();
		driver.findElement(By.linkText("English")).click();			
		
	}	
	
	public static void Telegu() {
		driver.findElement(By.xpath("//div[@id='SIvCob']/a[3]")).click();
		driver.findElement(By.linkText("English")).click();
	}
	
	public static void main(String[] args) {
		openURL();
		Hindi();
		Telegu();

		
	}

}
