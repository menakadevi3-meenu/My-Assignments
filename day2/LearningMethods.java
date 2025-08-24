package week1.day2;

public class LearningMethods {
int Noof=1000;
	public void add(int i, int j)
	{
		int a=10;
		int b=61;
		int c=a+b;
		System.out.println(c);	
	}
	
	public void subtract()
	{
	int d=90;
	int e=40;
	int f=d-e;
	System.out.println(f);
	}
	public void multiply()
	{
		int g=55;
		int h=11;
		int i=g*h;
		System.out.println(i);
	}
public static void main(String[] args) {
	LearningMethods m = new LearningMethods();
	m.add(5,6);
	m.subtract();
	m.multiply();
	System.out.println(m.Noof);;
	
}
}