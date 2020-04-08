import java.io.*;

class Person
{
  private int age;
  private String name;
  
  // default constructor
  Person()
  {
    name = "JP";
    age = 40;  
  }
  
  void talk()
  {
    System.out.println("Hello I am " + name);  
    System.out.println(" My age is " + age);
  }
  
}


class DemoDefConstructor
{
  public static void main(String[] args) {
    Person JP = new Person();
    
    JP.talk();
    
  }
  
}
