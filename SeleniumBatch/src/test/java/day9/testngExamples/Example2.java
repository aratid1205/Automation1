package day9.testngExamples;

import org.testng.annotations.Test;

public class Example2 {
  @Test
  public void testCase1() {
	  System.out.println("Hello, I am Tc1");
  }
  @Test
  public void testCase2() {
	  System.out.println("Hello, I am Tc2");
	  calling();
  }
  public void calling()
  {
	  System.out.println("You Are Calling 1234");
  }
}
