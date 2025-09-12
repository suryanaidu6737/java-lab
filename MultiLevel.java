// a program on multilevel inheritance
class Parent
{
	int a=10;
}
class Child1 extends Parent
{
	int b=20;
	void display()
	{
		System.out.println("sum of "+a+"and"+b+"is :"+(a+b));
	}
}
class Child2 extends Child1
{
	int c=40;
	void display1()
	{
		System.out.println("sum of "+a+","+b+"and "+c+"is :"+(a+b+c));
	}
}
class MultiLevel
{
	public static void main(String[] args)
	{
		Child2 obj=new Child2();
		obj.display();
		obj.display1();
	}
}
