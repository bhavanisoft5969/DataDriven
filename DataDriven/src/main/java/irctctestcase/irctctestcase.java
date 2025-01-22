package irctctestcase;

import org.testng.annotations.Test;

import utils.DP001;
import wrappers.GenericWrappers;

public class irctctestcase extends GenericWrappers{
	
	@Test(dataProvider = "irctcreg", dataProviderClass = DP001.class)
	public void fbregistration(String username, String password, String preferredlanguage, String fullname, 
			String emailaddress, String mobilenumber) {

		invokeApp("chrome", "https://www.irctc.co.in/nget/profile/user-registration");
		waitDriver(3000);
		enterById("userName", username);
		enterById("fullName", fullname);
		enterById("usrPwd", password);
		enterById("cnfUsrPwd", password);
		enterById("email", emailaddress);
		enterById("mobile", mobilenumber);
		//selectVisibleTextByXPath("//li[@aria-label='English']",preferredlanguage);//, preferredlanguage);
		waitDriver(3000);
		closeDriver();
	}
	

}
