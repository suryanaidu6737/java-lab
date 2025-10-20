import java.util.*;
abstract class Shape
{
	abstract void area();
}
class Square extends Shape
{	
	int s,sarea;
	Square(int s)
	{
		this.s=s;
	}
	void area()
	{
		sarea =s*s;
		System.out.println("area of square:"+sarea);
	}
}
class Rectangle extends Shape
{
	int l,b,rarea;;
	Rectangle(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	void area()
	{
		rarea =l*b;
		System.out.println("area of rectangle:"+rarea);
	}
}class Triangle extends Shape
{
	double tarea;	
	int b,h;
	Triangle(int b,int h)
	{
		this.b=b;
		this.h=h;
	}
	void area()
	{
		tarea =0.5*b*h;
		System.out.println("area of triangle:"+tarea);
	}
}

class AbstCls
{
	public static void main(String[] args)
	{
		Square obj1=new Square(5);
		obj1.area();
		Rectangle obj2=new Rectangle(2,4);
		obj2.area();
		Triangle obj3=new Triangle(3,4);
		obj3.area();
	}
}

	
	
	