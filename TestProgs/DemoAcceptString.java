import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class DemoAcceptString
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.printf("Enter your name: ");
    String name = br.readLine();
    
    System.out.println("You Entered " + name);
  }
}

