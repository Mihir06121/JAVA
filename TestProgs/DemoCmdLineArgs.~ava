import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Person
{
  private String name;
  private int age;
  
  Person(String s, int n)
  {
    name = s;
    age = n;
    
  }
  
  void Check()
  {
    if (age < 30) {
      System.out.println(name + " is young.");
    } // end of if 
    else if(age < 50){
      System.out.println(name + " is middle aged.");
    } // end of if-else
    else {
      System.out.println(name + " is old. ");
    } // end of if-else
  }
  
  
}

class DemoCmdLineArgs
{
  public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String s = args[0];
    int i = Integer.parseInt(args[1]);// Convert string to integer
    
    Person p = new Person(s, i);
    
    p.Check();                                                      
  }  
}


