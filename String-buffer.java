import java.io.*;
import java.util.*;

public class Main
{
  public static void main (String[]args)
  {
      
      String str = "i love programming";   // change to uppercase for starting index
      
      StringBuffer s =new StringBuffer();
      
      char ch = ' ';
      for(int i=0;i<str.length();i++){
          if(ch==' ' && str.charAt(i)!=' ')
          {
              s.append(Character.toUpperCase(str.charAt(i)));
          }
          else{
              s.append(str.charAt(i));
          }
          ch = str.charAt(i);
      }
      
      System.out.print(s.toString());
  }
}
