//to implement method overloading concept
class Methodovd
{
	int a,b,c;
	void add()
	{
		a=10;b=20;
		c=a+b;
		System.out.println("sum of "+a+" and "+b+" is :"+c);
	}
	void add(int x,int y)
	{
		a=x;
		b=y;
		c=a+b;
		System.out.println("sum of "+a+" and "+b+" is :"+c);
	}
	void add(double x,int y)
	{
		double a=x;
		b=y;
		double c=a+b;
		System.out.println("sum of "+a+" and "+b+" is :"+c);
	}
	
}
public class Movddemo
{
	public static void main(String[] args)
	{
		Methodovd obj=new Methodovd();
		obj.add();
		obj.add(5,15);
		obj.add(5.250,15);
	}
}
