package webdriver;

import org.openqa.selenium.By;import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.Select;

public class HMS_PR {
	
	public static WebDriver driver;
	
	public static void verifylogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\library\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("http://www.seleniumbymahesh.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("HMS")).click();	
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();
							
	}
	public static void verifyResistration(){
		driver.findElement(By.linkText("Registration")).click();
		driver.findElement(By.linkText("Perminent Registration")).click();
				
	}
	public static void verifyPR() {
		
		new Select(driver.findElement(By.name("PATIENT_CAT"))).selectByVisibleText("Self");
		new Select(driver.findElement(By.name("TITLE"))).selectByVisibleText("Mr.");
		new Select(driver.findElement(By.name("RELATION"))).selectByVisibleText("Brother");
		driver.findElement(By.name("PNT_NAME")).sendKeys("Ram ");
		driver.findElement(By.name("MIDDLE_NAME")).sendKeys("Krishan");
		driver.findElement(By.name("LAST_NAME")).sendKeys("Reddy");
		driver.findElement(By.name("image")).sendKeys("F:\\preview.jpg");
		new Select(driver.findElement(By.name("PAT_IDENTITY"))).selectByVisibleText("AAdhar Card");
		driver.findElement(By.name("PAT_IDENTITY_PROOF")).sendKeys("123456789012");
		driver.findElement(By.name("DOB")).sendKeys("10-03-1990");
		driver.findElement(By.name("AGE")).sendKeys("32");
		new Select(driver.findElement(By.name("SEX"))).selectByVisibleText("Male");
		new Select(driver.findElement(By.name("MTRL_STATUS"))).selectByVisibleText("Single");
		new Select(driver.findElement(By.name("RELIGION"))).selectByVisibleText("Hindu");
		new Select(driver.findElement(By.name("PLANGUAGE"))).selectByVisibleText("Telugu");
		new Select(driver.findElement(By.name("NATIONALITY"))).selectByVisibleText("Indian");
		new Select(driver.findElement(By.name("IS_MLC"))).selectByVisibleText("No");
		new Select(driver.findElement(By.name("EDUCATION"))).selectByVisibleText("Others");				
		new Select(driver.findElement(By.name("OCCUPATION"))).selectByVisibleText("Employee");
		new Select(driver.findElement(By.name("BLOOD_GRP_CODE"))).selectByVisibleText("A+");
		new Select(driver.findElement(By.name("CITIZENSHIP"))).selectByVisibleText("Indian");
		new Select(driver.findElement(By.name("SC_PROOF"))).selectByVisibleText("No");	
		driver.findElement(By.name("ADDRESS1")).sendKeys("Munekolala");
		driver.findElement(By.name("MOBILE_NO")).sendKeys("9876543210");
		driver.findElement(By.name("ZIP")).sendKeys("560037");
		new Select(driver.findElement(By.name("COUNTRY_CODE"))).selectByVisibleText("India");	
		driver.findElement(By.name("submit")).click();

	
	}
	
	public static void main(String[] args) throws InterruptedException {
	verifylogin();
	verifyResistration();
	verifyPR();	

	}

}
