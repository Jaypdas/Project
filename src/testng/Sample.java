package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Sample {
  @Test
  public void f() {
	  System.out.println("Hero Honda");
  }
  @Test
  public void run() {
	  System.out.println("Yamaha");
  }                 
  
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("first");
  }
  
  
  @AfterTest
  public void afterTest() {
	  System.out.println("second");
  }

}
