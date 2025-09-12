// a program on hierarichal inheritance 
class Parent
{
	int a=10;
}
class Ch1 extends Parent
{
	int b=20;
	void display()
	{
		System.out.println("sum is :"+(a+b));
	}
}
class Ch2 extends Parent
{
	int b=30;
	void display()
	{
		System.out.println("sum is:"+(a+b));
	}
}
class Hierar
{
	public static void main(String[] args)
	{
		Ch1 obj1=new Ch1();
		Ch2 obj2=new Ch2();
		obj1.display();
		obj2.display();
	}
}
	
