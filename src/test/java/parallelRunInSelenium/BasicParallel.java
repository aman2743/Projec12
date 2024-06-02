package parallelRunInSelenium;

import org.testng.annotations.Test;

public class BasicParallel {

	@Test
	public void TC001() {
		System.out.println("Thread ID="+Thread.currentThread().getId());
		System.out.println("TC001");
	
	}
	@Test
	public void TC002() {
		System.out.println("Thread ID="+Thread.currentThread().getId());
		System.out.println("TC002");
	
	}
	@Test
	public void TC003() {
		System.out.println("Thread ID="+Thread.currentThread().getId());
		System.out.println("TC003");
		
	}
	
}
