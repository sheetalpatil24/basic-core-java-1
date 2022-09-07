import java.util.Scanner;




//1.leap year century- gap between two leap years is 400 so after dividing it by 100 and 400 it will give reminder  is 0
//2.yearly -after dividing by 100 and 4 will give reminder 0

public class BasicCore{
    public static void main(String[] args) {
        //year will be input here
        int y;
        System.out.println("enter any year");
        //scanner class used to input value in runtime
        //leap=object reference
        Scanner leap = new Scanner(System.in);
        y=leap.nextInt();

        if(y%100==0 && y%400==0 || y%100!=0 && y%4==0 )
        {
            System.out.println("leap year");

        }
        else
        {
            System.out.println("not leap year");
        
        }
    }
}
        
        



    
