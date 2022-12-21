
package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_login_xpath {
	
	public static WebDriver driver;
	
	public static void FB_login() {
		System.setProperty("webdriver.chrome.driver","E:\\library\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("1234567890");
		driver.findElement(By.name("login")).click();
		
	}
	

	public static void main(String[] args) {

		FB_login();
		}

}
