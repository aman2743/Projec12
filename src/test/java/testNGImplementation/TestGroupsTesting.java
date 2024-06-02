package testNGImplementation;

import org.testng.annotations.Test;

public class TestGroupsTesting {
  @Test(groups = {"smoke"})
  public void TC001() {
	  System.out.println("Inside TC001");
  }
  
  @Test(groups = {"sanity"})
  public void TC002() {
	  System.out.println("Inside TC002");
  }
  
  @Test(groups = {"sanity","regression"})
  public void TC003() {
	  System.out.println("Inside TC003");
  }
  @Test(groups = {"sanity","regression"})
  public void TC004() {
	  System.out.println("Inside TC004");
  }
  @Test(groups = {"sanity","smoke"})
  public void TC005() {
	  System.out.println("Inside TC005");
  }
  @Test(groups = {"smoke","regression"})
  public void TC006() {
	  System.out.println("Inside TC006");
  }
  
}
