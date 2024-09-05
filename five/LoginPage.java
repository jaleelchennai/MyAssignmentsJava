package homeassignment.five;

public class LoginPage extends BasePage {
	
	@Override
	public void performCommonTasks() {
		System.out.println("Override the Perform Common Tasks");
		
		
	}
	
	public static void main(String[] args) {
		LoginPage loginPage = new LoginPage();
		loginPage.findElement();
		loginPage.clickElement();
		loginPage.enterText();
		loginPage.performCommonTasks();
				
	}

}
