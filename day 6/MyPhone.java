package week3.day2;

public class MyPhone extends IOS{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a class (MyPhone) with main method
		//- Confirm you cannot access iPad methods
		//- Create Object for iPhone
		IPhone i=new IPhone();
		//- Confirm you can access 5 methods !!and Confirm you cannot access iPad methods - Not able to access the Ipad methods
		i.increaseVolume();
		i.makeCall();
		i.shutdown();
		i.sendSMS();
		i.startApp();
	}

}
