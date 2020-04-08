import java.io.*;

class One
{
  //instance variables
  int x;
  Two t;     // class Two's reference
  
  // Constructor that receives Two's reference
  One(Two t)
  {
    this.t = t;
    x = 10; 
  }
  
  // method to display class One and class Two variables
  void display()
  {
    System.out.println("One's x = " + x); 
    
    // call class Two's method
    t.display();
    
    // access class Two's variable
    System.out.println("Two's x = " + t.y);
    
  }
   
}

class Two
{
  // Instance variables
  int y;
  
  // Initialize y
  Two(int y)
  {
    this.y = y;
  }  
  
  void display()
  {
    System.out.println("Two's y = " + y);  
  }
}

class DemoRelating2Classes
{
  public static void main(String[] args) {
    Two obj2 = new Two(20);
    One obj1 = new One(obj2);
    obj1.display();
    
  }
  
}
