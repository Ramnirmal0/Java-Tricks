import java.io.*; 
import java.util.*; 
public class Main
{
	public static void main(String[] args) {
		int arr[] = {2,2 ,2 , 2};
		Set<Integer> hs = new HashSet<Integer>();
		for(int i=0; i <arr.length ; i++)
		    hs.add(arr[i]);
		 System.out.print(hs);
	}
}
