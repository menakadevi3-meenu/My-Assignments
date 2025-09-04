package week3.day2;
//Design an interface DatabaseConnection 
public interface DatabaseConnection {
// abstract methods
//connect()
//disconnect()
//executeUpdate()
	//Methods with implementation
	public default void connect()
	{
		System.out.println("Connected");
	}
	public default void disconnect()
	{
	System.out.println("Disconnected");
	}
	public default void executeUpdate()
	{
		System.out.println("Execute the update");
	}
	//Methods without implementation
	public void KnowYourConnectionStatus();
	public void KnowYourExecutionStatus();
}


