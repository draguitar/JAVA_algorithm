import java.util.Scanner;
/**
 * Q1071FinalExam27
 */
public class Q1071FinalExam27 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println(fun(scn.nextLong()));
    }
    public static long fun(long n){
        if(n < 10){
            return 1;
        }else{
            return 1 + fun( n / 10 );
        }
    }
}