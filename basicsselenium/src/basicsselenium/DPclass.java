package basicsselenium;

import org.testng.annotations.DataProvider;

public class DPclass {
	
	
	@DataProvider
	public Object[][] browserData() {
		return new Object[][] { 
			
			   new Object[] { "chrome" },
				};
	}

	

	@DataProvider
	public Object[][] loginData() {
		return new Object[][] { new Object[] { "kiran@gmail.com", "123456" },
				new Object[] { "swapnil@gmail.com", "9999999999" },

		};
	}

		@DataProvider
		public Object[][] registerData() {
			return new Object[][] {
				
				    new Object[] { "kiran","9999999999", "kiran@gmail.com", "123456" },
					new Object[] { "swapnil", "8888888888", "swapnil@gmail.com", "999999" },

			};

		
}
}
