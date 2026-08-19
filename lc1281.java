import java.util.*;
class lc1281{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n" );
         int n=sc.nextInt();

        int sum=0;
        int product=1;
        while(n>0){
            int digit=n%10;

            sum=sum+digit;
            product=product*digit;
            System.out.println("sum is "+ sum);
            System.out.println("product is "+ product);
            n=n/10;
            
        }
       int output=product-sum;
        System.out.println(output);
    }

}