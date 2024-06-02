package testNGImplementation;

import org.testng.annotations.Test;

public class TestGroupsTesting2 {
  @Test(groups = {"smoke"})
  public void TC007() {
	  System.out.println("Inside TC007");
  }
  
  @Test(dependsOnGroups ={"sanity","regression"})
  public void TC008() {
	  System.out.println("Inside TC008");
  }
  
  @Test(groups = {"smoke","regression"})
  public void TC009() {
	  System.out.println("Inside TC009");
  }
  @Test(groups = {"sanity","functional"})
  public void TC010() {
	  System.out.println("Inside TC010");
  }
  
}
