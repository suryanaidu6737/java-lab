//a java program to reverse the array
import java.util.Scanner;
class ArrayRev
{
	public static void main(String[] args)
	{
		System.out.println("Enter no:of elements");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter array 'reverse' elements");
		for(int j=n-1;j>=0;j--)
		{
			System.out.println(arr[j]);
		}
	}
}
			
