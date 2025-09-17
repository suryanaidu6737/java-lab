// a java program to use the super keyword concept
class Parent
{
	int a,b;
	Parent(int x,int y)
	{
		a=x;
		b=y;
	}
	void display()
	{
		System.out.println("sum of"+a+"and "+b+"in parent class is :"+(a+b));
	}
		
}
class Child extends Parent
{
	Child()
	{
	super(10,20);
	}
	void display()
	{
		System.out.println("sum of"+a+"and "+b+"in child class is :"+(a+b));
		super.display();
	}
}
class Super
{
	public static void main(String[] args)
	{
		Child obj =new Child();
		obj.display();
	}
}

		
