import java.io.*;
import java.util.*;

public class Main
{
  public static void main (String[]args)
  {
      
      String str = "i -+$,love, rose";
      
     str=str.replaceAll("\\s","");     // remove white spaces
      str=str.replaceAll("\\,","");    // remove ,
      str=str.replaceAll("\\W","");   // remove all non words ( + -* $%^&....)
      
      System.out.print(str);
  }
}
