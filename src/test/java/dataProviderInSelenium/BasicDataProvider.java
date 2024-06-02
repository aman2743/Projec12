package dataProviderInSelenium;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BasicDataProvider {
	
	@Test(dataProvider ="dp01" )
	public void SDArray(String st) {
		System.out.println(st);
		
	}
	

	@DataProvider(name="dp01")
	public String[] dataSupplier() {
		String[] str = new String[] { "Test", "QA","MGR","QC" };
        return str;

	}

}
