package week1.day2;

public class Browser {
	public String launchBrowser(String browserName) 
	{
		return browserName;
	}
public String loadUrl(String URL)
{
 return URL;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser b=new Browser();
		System.out.println(b.launchBrowser("Chrome"));
		System.out.println(b.loadUrl("Url loaded successfully"));
		
	}

}
