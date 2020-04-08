import java.io.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class DemoFibonacci
{
  public static void main(String[] args)  throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
    System.out.println("How many Fibonacci ?");
    
    int n = Integer.parseInt(br.readLine());
    
    long f1 = 0, f2 = 1;
    System.out.println(f1);
    System.out.println(f2);
    
    //Find next fibonacci Number
    long f = f1 + f2;
    System.out.println(f);
    
    //already 3 fibonacci numbers are displayed. so count will start at 3
    
    int cnt = 3;
    while (cnt < n) { 
      f1 = f2;
      f2 = f;
      f = f1 + f2;
      System.out.println(f);
      cnt++;
    } // end of while
    
    
  }  
  
}
