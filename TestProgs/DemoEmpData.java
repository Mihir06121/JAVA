import java.io.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class DemoEmpData
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter Emp Name: ");
    String name = br.readLine();
    
    System.out.println("Enter id: ");
    int id = Integer.parseInt(br.readLine());
    
    System.out.println("Emp Name: " + name);
    System.out.println("Emp Id: " + id);
    
    
  } 
}
