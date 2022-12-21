package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bookmyshow {

public static WebDriver driver;
	
	public static void openURL( ) {
	System.setProperty("webdriver.chrome.driver", "E:\\library\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("https://in.bookmyshow.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//div[@class='sc-ekulBa bxvwzt']")).click();
	
	}	
	
	
	public static void main(String[] args) {
		
		openURL();
		
	}

}
