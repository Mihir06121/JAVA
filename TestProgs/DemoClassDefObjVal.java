import java.io.*;

class Person
{
  String name;
  int age;
  
  void talk()
  {
    System.out.println("Hello I am" + name);  
    System.out.println("My age is " + age);
  }
}


class DemoClassDefObjVal
{
  public static void main(String[] args) {
    Person Raju = new Person();
    
    Raju.talk();
  } 
}

