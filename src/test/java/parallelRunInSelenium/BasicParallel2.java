package parallelRunInSelenium;

import org.testng.annotations.Test;

public class BasicParallel2 {

	@Test
	public void TC004() {
		System.out.println("Thread ID="+Thread.currentThread().getId());
		System.out.println("TC004");
		
	}
	@Test
	public void TC005() {
		System.out.println("Thread ID="+Thread.currentThread().getId());
		System.out.println("TC005");
		
	}
	@Test
	public void TC006() {
		System.out.println("Thread ID="+Thread.currentThread().getId());
		System.out.println("TC006");
		
	}
	
}
