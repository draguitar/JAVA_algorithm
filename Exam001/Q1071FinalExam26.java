import java.util.Scanner;
/**
 * Q1071FinalExam26
 */
public class Q1071FinalExam26 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println(power(scn.nextInt(), scn.nextInt()));
    }
    public static long power(int a, int n){
        if(n == 1){
            return a;
        }else{
            return a * power(a, n-1);
        }
    }
}