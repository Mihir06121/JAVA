// Electricity Bill for commercial connection
import java.io.*;

class Commercial
{
  // take customer name
  private String name;
  
  void setName(String name)
  {
    this.name = name;
  }
  
  String getName()
  {
    return name;  
  }
  
  // calculate bill taking Rs5.00/unit 
  void calculateBill(int units)
  {
    System.out.println("Customer Name: "+ getName());
    System.out.println("Bill Amount = "+ units*5.00);
  }
  
  
}

class Domestic extends Commercial
{
  // override the calculateBill method of commercial class, to calculate 
  // bill at Rs2.50/ unit
  void calculateBill(int units)
  {
    System.out.println("Customer Name: "+ getName());
    System.out.println("Bill Amount = "+ units*2.50);
  }
}

// class to calculate bills for commercial and domestic customers
class DemoPolymorphism
{
  public static void main(String[] args) 
  {
    // Calculate using commercial method
    Commercial c = new Commercial();
    c.setName("Raj");
    c.calculateBill(100);
    
    // Calculate using domestic method
    Domestic d = new Domestic();
    d.setName("Jp");
    d.calculateBill(100);  
    
  }
  
}



