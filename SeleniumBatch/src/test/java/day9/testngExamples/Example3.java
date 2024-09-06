package day9.testngExamples;

import org.testng.annotations.Test;

public class Example3 {
  @Test(enabled=true,description="checking TC1")
  public void testCase1() {
	  System.out.println("Hello,TC1");
  }
  @Test(enabled=false)
  public void testCase2() {
	  System.out.println("Hello,TC2");
  }
  @Test(enabled=true)
  public void testCase3() {
	  System.out.println("Hello,TC3");
  }
  @Test(enabled=true ,invocationCount=3)
  public void testCase4() {
	  System.out.println("Hello,TC4");
  }
}
