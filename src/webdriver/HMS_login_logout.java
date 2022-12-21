package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HMS_login_logout {
	
	public static WebDriver driver;
	
	public static void openURL()   {
	System.setProperty("webdriver.chrome.driver","E:\\library\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://www.seleniumbymahesh.com");
	driver.manage().window().maximize();
	}
	
	public static void verify_login() throws InterruptedException {
	
	driver.findElement(By.linkText("HMS")).click();	
	Thread.sleep(3000);
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("password")).sendKeys("admin");
	driver.findElement(By.name("submit")).click();	
	}
	
	public static void verify_logout() throws InterruptedException {
	Thread.sleep(5000);
	driver.findElement(By.linkText("Logout")).click();
	driver.quit();

	}

	public static void main(String[] args) throws Exception {		
		openURL();
		verify_login();
		verify_logout();
		
		
	}

}
