package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class GLniksParameterization {
	public WebDriver driver;
	
   public void GoogleLinks(String str) {
	  driver.findElement(By.xpath(str)).click();
	  driver.findElement(By.linkText("English")).click();  
  }
  @Test
  public void CliclLinks() {
	  GoogleLinks("//div[@id='SIvCob']/a[1]"); //Hindi
	  GoogleLinks("//div[@id='SIvCob']/a[2]"); //Bengali
	  GoogleLinks("//div[@id='SIvCob']/a[3]"); //Telegu
	  driver.quit();
	  	  
  }
    
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","E:\\library\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
  }

}
