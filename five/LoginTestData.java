package homeassignment.five;

//Test Data is superclass and LoginTestData is subclass
public class LoginTestData extends TestData {
	
	public void enterUsername() {
		System.out.println("Jaleel");
	}
	
	public void enterPassword() {
		System.out.println("2356");
	}
	
	public static void main(String[] args) {
		LoginTestData logintestdata = new LoginTestData();
		logintestdata.enterCredentials();
		logintestdata.navigateToHomePage();
		logintestdata.enterUsername();
		logintestdata.enterPassword();
				
	}

}
