package week3.day2;

public class LoginTestData extends TestData{
	
	public void enterUsername()
	{
		System.out.println("Enter username-SubClass - LoginTestData");
        
	}
   public void enterPassword()
   {
	   System.out.println("Enter password-SubClass - LoginTestData");
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginTestData td=new LoginTestData();//Creation of object
		td.enterCredentials(); //Method created in SuperClass - TestData
		td.navigateToHomePage();//Method created in SuperClass - TestData
		td.enterPassword(); //Method created in SubClass - LoginTestData
		td.enterUsername(); //Method created in SubClass - LoginTestData
		
	}

}
