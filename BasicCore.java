import java.util.Scanner;
public class BasicCore {
    public static void main(String[] args) {
        int heads = 0;
        int tails= 0;
        int count= 1;
        //we have to value in decimals so we will take double as data type
        double random=0.0;

        System.out.println("please enter the number");
        Scanner co = new Scanner(System.in);
        int flips = co.nextInt();
        while(count<= flips){
            
            
            //count should be increase random number should generate  till flip=count
            random=Math.random();
              System.out.println(count+" "+random);
            
            if(random<0.5){  
               heads++;  
               System.out.println("heads");
            }
            else {
                tails++;
                System.out.println("tails");
            }
            count++;
            System.out.println("number of heads :" +heads);
            System.out.println("number of tails :" +tails);

            double headpercent=(double)heads/flips*100;
            double tailpercent=(double)tails/flips*100;

        }
    }
}


            

               
        

    

