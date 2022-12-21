package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.service.DriverService;
import org.testng.annotations.AfterTest;

public class GoogleLanguages_PR {
	WebDriver driver;
	
  @Test(priority = 0)
      public void Hindi() {
	  driver.findElement(By.xpath("//div[@id='SIvCob']/a[1]")).click();
	  driver.findElement(By.linkText("English")).click();
  }
  
  @Test(priority = 1)
  public void Bengali() {
	  driver.findElement(By.xpath("//div[@id='SIvCob']/a[2]")).click();
	  driver.findElement(By.linkText("English")).click();   
  }
  @Test(priority = 2)
  public void Telugu() {
	  driver.findElement(By.xpath("//div[@id='SIvCob']/a[3]")).click();
	  driver.findElement(By.linkText("English")).click();	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","E:\\library\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  driver.quit();
  }
  

}
