//a java single inheritance program
class Parent
{
    void show()
    {
        System.out.println("Parent Class ");
    }
}
class Child extends Parent
{
    void display(){
        System.out.println("Child class");
    }
}
public class SingleInh
{
    public static void main(String[] args)
    {
        Child c=new Child();
        c.display();
        c.show();
    }
}
