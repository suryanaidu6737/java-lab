//to print default values of datatypes
class Datatypes
{
	byte vbyte;
	char vchar;
	int vint;
	short vshort;
	long vlong;
	float vfloat;
	double vdouble;
	boolean vbool;
	void datatypevalues()
	{
		System.out.println("byte: "+vbyte);
		System.out.println("char: "+vchar);
		System.out.println("int: "+vint);
		System.out.println("short: "+vshort);
		System.out.println("long: "+vlong);
		System.out.println("float: "+vfloat);
		System.out.println("double: "+vdouble);
		System.out.println("boolean: "+vbool);
	}
	public static void main(String args[])
	{
		Datatypes obj=new Datatypes();
		obj.datatypevalues();
	}
}
	
	 
