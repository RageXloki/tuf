import java.util.*;
class lc50 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        double x= sc.nextDouble();
        int n=sc.nextInt();
        double output=Math.pow(x,n);
        System.out.println(output);

    }
    
}
//to reduce the time complexity of the code leetcode does it directly
//class Solution {
//    public double myPow(double x, int n) {
//        return Math.pow(x, n);
//    }
//}