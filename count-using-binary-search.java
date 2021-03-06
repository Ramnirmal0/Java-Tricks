/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	static int mid;
	public static void main (String[] args) throws java.lang.Exception
	{
		int a[] = {1 , 2 , 4 , 4 , 5 , 6 , 7 };
		
		 mid = (0+6)/2;
		int x = 4;
		if(a[mid]<x){
			while(a[mid]<x){
				mid++;
				
			}
			System.out.print(mid);
			return;
		}
		else if(a[mid]>=x){
			while(a[mid]>=x){
				mid--;
				
			}
			System.out.print(mid+1);
			return;
		}
	}
}
