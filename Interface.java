import java.util.*;
interface Read
{
	void read();
	void add();
	void sub();
}
class A implements Read
{
	void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("eter a,b values");
		int a=sc.nextInt();
		int b=sc.nextInt();
	}
	void add()
	{
		System.out.println("add of a,b"+(a+b));
	}
	void sub()
	{
		System.out.println("sub of a,b"+(a-b));
	}
}
class Interface
{
	public static void main(String[] args)
	{
		A obj =new A();
		obj.read();
		obj.add();
		obj.sub();
	}
}
