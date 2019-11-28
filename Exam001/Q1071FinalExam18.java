import java.util.Scanner;
/**
 * Q1071FinalExam18
 */
public class Q1071FinalExam18 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println(fun(scn.nextInt()));
    }
    public static int fun(int n){
        if(n == 1){
            return n+1;
        }else{
            return fun(n-1) + fun((int)Math.floor(n/2d));
        }
    }
}