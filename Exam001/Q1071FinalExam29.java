import java.util.Scanner;
/**
 * Q1071FinalExam29
 */
public class Q1071FinalExam29 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
            System.out.println(fun(n));
    }
    public static int fun(int n){
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }else{
            return fun(n-1) + fun(n-2);
        }
    }
}