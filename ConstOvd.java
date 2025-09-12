//to use constructor overloading concept
class Const
{
	int a,b,c;
	Const()
	{
		System.out.println("Hello constructor called ");
	}
	Const(int x,int y)
	{
		a=x;
		b=y;
		c=a+b;
		System.out.println("A+B is:"+c);
	}
	Const(double x,int y)
	{
		double a=x;
		b=y;
		double c=a+b;
		System.out.println("A+B is:"+c);
	}
}
class ConstOvd
{
	public static void main(String args[])
	{
		Const obj=new Const();
		Const obj1=new Const(10,20);
		Const obj2=new Const(10.25,20);
		Const obj3=obj1;
	}
}
			
