import java.util.*;
class RandomFormatter
{
	public static void main(String[] args)
	{
		Random rand=new Random();
		int randint=rand.nextInt();
		double randdouble=rand.nextDouble();
		Boolean randbool=rand.nextBoolean();
		Formatter fmt=new Formatter();
		fmt.format("random int : %d\n",randint);
		fmt.format("random double: %4f\n",randdouble);
		fmt.format("random Boolean: %b\n",randbool);
		System.out.println(fmt);
	}
}