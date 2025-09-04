package week3.day2;
// Implement the interface in a Concrete class
public class JavaConnection implements DatabaseConnection {
	
//Provide concrete implementations for the abstract methods in the Concrete class
	@Override
	public void KnowYourConnectionStatus() {
		// TODO Auto-generated method stub
		System.out.println("Connection status is Success");
	}
	@Override
	public void KnowYourExecutionStatus() {
		// TODO Auto-generated method stub
		System.out.println("Execution status is Success");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creation of object
		JavaConnection jc = new JavaConnection();
		//Calling the methods using object with the Interface methods as well as the Concrete class methods
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
		jc.KnowYourConnectionStatus();
		jc.KnowYourExecutionStatus();
	}
}

