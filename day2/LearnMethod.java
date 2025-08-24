package week1.day2;

public class LearnMethod {

		void divide(int k,int l)
		{
			System.out.println(k/l);
		}

int noofbicycles()
{
	return 15;
}

String noofbicycledata(String Brandcolor,String Brandname,String BicycleType)
{
	return Brandcolor+Brandname+BicycleType;
}
public static void main(String[] args) {
	LearnMethod lm1=new LearnMethod();
	lm1.divide(10, 2);
	int number=lm1.noofbicycles();
	System.out.println(number);
	System.out.println(lm1.noofbicycledata("Blue","Hercules","Gear"));
}
}

