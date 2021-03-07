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

/*  integer hasset and it's printing*/ 

import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    int a[] = {1 , 3 , 2 , 2 , 3 , 3 };
	    Set<Integer> hs = new HashSet<Integer>();
	    
	    for(int i=0; i <a.length ; i++){
	        hs.add(a[i]);
	    }
	    
	    Iterator<Integer> it = hs.iterator();
	    while(it.hasNext()){
	        System.out.print(it.next()+" ");
	    }
	    
		
	}
	
	
/*  add array without loop in set*/
	
		Integer a[] = { 3,4,4,1,7,5 };
		int n = a.length;
		Set<Integer> set = new HashSet<Integer>();                   // use just Hashset if wanted to sort the set in built
		Set<Integer> set = new LinkedHashSet<Integer>();            // use LinkedHashSet if wanted to maintain insertion order;
		set.addAll(Arrays.asList(a));
	
			Iterator it = set.iterator();
		
		while(it.hasNext()){
		   int index = (Integer) it.next();
		   System.out.print(index + "->" + counter[index] +" ");
		}
	
	
	
