package testNGprograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class AnnotationsDemo2 {
  @Test
  public void d() {
	  System.out.println("class d");
  }
  
  @Test
  public void a() {
	  System.out.println("class a");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after method");
  }

}
