import java.io.*;

class Person
{
  private String name;
  private int age;
  
  Person()
  {
    name = "JP";
    age = 40;
  }
  
  Person(String s, int n)
  {
    name = s;
    age = n; 
  }
  
  void talk()
  {
    System.out.println("Hello I am " + name);  
    System.out.println("My age is " + age);
  }
}


class DemoParamConstructor
{
  public static void main(String[] args) {
  Person Raju = new Person();
  Raju.talk();
  
  Person Sita = new Person("Sita", 25);
  Sita.talk();  
  }
  
}


