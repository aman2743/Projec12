package dataProviderInSelenium;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TwoDimensional {
	
	@Test(dataProvider ="dp01" )
	public void SDArray(String st) {
		System.out.println(st);
		
	}
	

	@DataProvider(name="dp02")
	public Object[][] dataSupplier() {
		Object[][] obj = new String[][] { 
			{"jsmith","demo1234"},
			{"jsmith","demo1234"} 
			};
        return obj;

	}

}
