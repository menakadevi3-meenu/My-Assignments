package week3.day2;

public abstract class ConnectionNew implements DatabaseConnection {

	public void NewConnect()
	{
	System.out.println("New Connection");	
	}
	public abstract void DisconnectNew();
	
	public static void main(String[] args) {
		
	}

}
