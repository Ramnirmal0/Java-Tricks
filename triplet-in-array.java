import java.io.*;
import java.util.*;


public class Main
{
  public static void main (String[]args)
  {

     int a[] = { 1,2,3,4,5,6};
     int n = a.length;
     
     
     
     for(int i=0;i<n-1;i++){
        int l = i+1;
        int r = n-1;
        int x = a[i];
         while(l<r){
             System.out.print("("+ x +","+ a[l] +","+ a[r]+") ");
             r--;
         }
     }
  
  }
}
