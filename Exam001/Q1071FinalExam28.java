import java.util.Scanner;
/**
 * Q1071FinalExam28
 */
public class Q1071FinalExam28 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        if(n <m){
            int tmp = n;
            n = m;
            m = tmp;
        }
        System.out.println(fun(n, m));
    }
    public static int fun(int n, int m){
        if(n % m == 0){
            return m;
        }else{
            return fun(m, n%m);
        }
    }
}