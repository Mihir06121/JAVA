import java.io.*;



class Person
{
  String name;
  int age;
  
  void talk()
  {
    System.out.println("Hello I am " + name);  
    System.out.println("My Age is " + age);
  }
}

class DemoClassObj
{
  public static void main(String[] args) 
    {
      Person Raju = new Person();
      
      System.out.println("Hash Code " +Raju.hashCode());
    
    }  
}
  
