import java.io.*;

class DemoSwitch
{
  public static void main(String ags[]) 
  {
    char color = 'g';
    
    switch (color) {
      case  'r': 
        System.out.println("Red");
        break;
      case  'g': 
        System.out.println("Green");
        break;
      case 'b':
        System.out.println("Blue");
      default: 
        System.out.println("No Color");
        
    } // end of switch
  }

}
