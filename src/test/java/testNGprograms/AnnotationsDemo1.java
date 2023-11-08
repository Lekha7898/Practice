package testNGprograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class AnnotationsDemo1 {
  @Test
  public void f() {
	  System.out.println("main class");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("after class");
  }

}
