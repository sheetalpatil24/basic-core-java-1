
import java.util.Scanner;
public class BasicCore{

    public static void main(String[] args) {
        
        Scanner fac = new Scanner(System.in);
      // n-vairable
        int n ;
        System.out.println("enter n");  
         n = fac.nextInt();
         //factors will be prime number
         //d stands for divisor

         for(int d=2 ; d < n; d += 1 )
          {
            while(n % d==0)
            {
                n= n/d;
                System.out.println(d);
            }

            }



        }
    }









        
    
