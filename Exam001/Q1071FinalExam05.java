import java.util.Scanner;
/**
 * Q1071FinalExam05
 */
public class Q1071FinalExam05 {
    public static void main(final String[] args) {
        final Scanner scn = new Scanner(System.in);
        final int n = scn.nextInt(), m = scn.nextInt();
        System.out.println(fun(n) / (fun(m) * fun(n-m)));
    }
    public static int fun(final int n){
        int result = 1;
        for(int i = n; i > 1; i--){
            result *= i;
        }
        return result;
    }
}