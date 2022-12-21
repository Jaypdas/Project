package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class HMS_login_logout {
	
	public static WebDriver driver;
 
  @Test
  public void verify_login() throws Exception {
	  System.out.println("login");
	  driver.findElement(By.linkText("HMS")).click();	
	  Thread.sleep(3000);
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("password")).sendKeys("admin");
	  driver.findElement(By.name("submit")).click();	
  }
  
  @Test
  public void signout() throws Exception {
	  System.out.println("logout");
	  Thread.sleep(5000);
	  driver.findElement(By.linkText("Logout")).click();
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("openURL");
	  System.setProperty("webdriver.chrome.driver","E:\\library\\chromedriver.exe");
      driver=new ChromeDriver();
      driver.get("http://www.seleniumbymahesh.com");
	  driver.manage().window().maximize();
		}
	 
   @AfterTest
  public void afterTest() {
  System.out.println("closeBrowser");
  driver.quit();
  
    }
  
}
