import java.util.Scanner;
// n th harmonic number is the sum of reciprocals of the first n natural number
 public class BasicCore{
    public static void main(String[] args) {

        System.out.println("enter the number");
        Scanner n=new Scanner(System.in);
        int num = n.nextInt();
        
        //result will be in decimal so take variable  double
        //N !=0 should greater than 0
        
            double result=0.0;
            System.out.println("the harmonic series is");
            while (num>0){
                result = result +(double)1/num;
                num--;
            System.out.println(result +" , ");


        }
        
    }
 }

        



    
