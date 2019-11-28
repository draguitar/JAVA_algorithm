import java.util.Scanner;
/**
 * Q1071FinalExam06
 */
public class Q1071FinalExam06 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println(decomp(scn.nextLong()));
    }
    public static String decomp(long n){
        String result = "";
        while(n > 0){
            result = Long.toString(n % 10) + " " + result ;
            n /= 10;
        }
        return result;
    }
}