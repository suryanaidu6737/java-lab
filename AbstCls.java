import java.util.*;
abstract class Parent
{
	abstract void display();
	int n;
	void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		n=sc.nextInt();
	}
}

class Child extends Parent
{
	void display()
	{
		System.out.println("value of n:"+n);
	}
}
class AbstCls
{
	public static void main(String[] args)
	{
		Child obj=new Child();
		obj.read();
		obj.display();
	}
}

	
	
	
