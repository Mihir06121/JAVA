import java.io.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class DemoIntInAscending
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter how many Numbers: ");    
    int n = Integer.parseInt(br.readLine());
    
    int Arr[] = new int[n];
    System.out.println("Enter the Numbers:");
    
    for (int j = 0; j < n; j++) 
    {
      Arr[j] = Integer.parseInt(br.readLine());
    } // end of for
    
    //Use bubblesort technique
    int limit = n - 1;
    boolean flag = false;
    int temp;
    
    for (int i = 0; i < limit; i++) 
    {
      for(int j = 0; j < limit-i; j++) 
      {
        //If First element is bigger than second one, swap
        if(Arr[j] > Arr[j+1])
        {
          temp = Arr[j];
          Arr[j] = Arr[j+1];
          Arr[j+1] = temp;
          flag = true;
          
        }
        
      } // end of for  
      if (flag == false) {
          break;
        } else {
          flag = false;
        } // end of if-else
      
      
    } // end of for
    
    System.out.println("The Sorted Array is : ");
      for (int i = 0; i < n; i++) {
        System.out.println(Arr[i]);
      } // end of for
    
    
    
  }
  
}
