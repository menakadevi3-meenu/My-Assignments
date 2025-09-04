package week3.day2;
//Create subclasses such as Chrome
public class Chrome extends Browser {

		// TODO Auto-generated method stub
//Define openIncognito()
		public void openIncognito(){
		System.out.println("Open Incognito");
		}
	public void clearCache() {
		System.out.println("ClearCache");
	}

	public static void main(String[] args) {
		Chrome c = new Chrome();
		c.clearCache();
		c.openIncognito();
	}
}
