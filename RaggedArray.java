//a java program on ragged array
import java.util.Arrays;
import java.util.Scanner;
class RaggedArray
{
    public static void main(String[] args)
    {
	    int[][] arr=new int[3][];
	    arr[0]=new int[2];
	    arr[1]=new int[3];
	    arr[2]=new int[4];
	    Scanner sc=new Scanner(System.in);
	    for(int i=0;i<arr.length;i++)
	    {
	            for(int j=0;j<arr[i].length;j++)
	            {
	                System.out.println("enter arr["+i+"]["+j+"]");
	                arr[i][j]=sc.nextInt();
	            }
	    }
	    System.out.println("Array is");
	      for(int i=0;i<arr.length;i++)
	    {
	            for(int j=0;j<arr[i].length;j++)
	            {
	                System.out.print(arr[i][j]);
	            }
	            System.out.println();
	    }
	    
	}
}
