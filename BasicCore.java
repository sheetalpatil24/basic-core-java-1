//swap numbers means altering each other,s values between two numbers
//a=10 b=20  so a= 20 b=10
import java.util.Scanner;

public class BasicCore{
    public static void main(String[] args) {

    
      
        int a,b ,temp;
        System.out.println("enter any two numbers");
        Scanner r= new Scanner(System.in);
        a = r.nextInt();
        b= r.nextInt();
        System.out.println("before swapping "+ a+" "+b);
        // temporary variable

        temp=a;
        a=b;
        b=temp;
        System.out.println("after swapping "+ a+" "+b);




        }
    }



