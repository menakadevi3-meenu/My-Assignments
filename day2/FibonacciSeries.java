package week1.day2;

public class FibonacciSeries {

	
public void Fibonacci()
{
int first=0;
int second=1;
int j=20;

    for(int i=0;i<=j;i++)
	{
    	int next =first+second;
        first=second;
        second=next;
		System.out.println(next);
	}	
	
}
public static void main(String[] args)
{
	FibonacciSeries Fb = new FibonacciSeries();
	Fb.Fibonacci();

	
}		
}