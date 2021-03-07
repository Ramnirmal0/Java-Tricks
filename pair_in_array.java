import java.io.*;
import java.util.*;


public class Main
{
  public static void main (String[]args)
  {

     int a[] = { 1,2,3,4,5,6};
     int n = a.length;
     
     
     int r = n-1;
     for(int i=0;i<n;i++){
         int l = i;
         while(l<r){
             System.out.print("("+a[l]+","+a[r] + ")   ");
             r--;
         }
         r=n-1;
     }
     
  }
}
