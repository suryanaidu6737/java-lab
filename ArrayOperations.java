//a java program on array operations
import java.util.Arrays;
class ArrayOperations
{
  public static void main(String[] args)
	{
	  int[] arr={10,2,5,2,6,9};
	  System.out.println("array:" +Arrays.toString(arr));
	  arr[1]=5;
	  //toString() operation
	  System.out.println("edited array:" +Arrays.toString(arr));
	  //sort operation
	  Arrays.sort(arr);
	  System.out.println("sorted array:" +Arrays.toString(arr));
	  //binarysearch operation
	  System.out.println("binary search:" +Arrays.binarySearch(arr,5));
	  //copyof operation
	  int[] array= Arrays.copyOf(arr,6);
	  System.out.println("array2:" +Arrays.toString(array));
	  //fill operation
	  Arrays.fill(array,5);
	  System.out.println("after fill array2:" +Arrays.toString(array));

	  
	}
}
