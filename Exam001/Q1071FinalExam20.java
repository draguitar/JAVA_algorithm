import java.util.Scanner;
/**
 * Q1071FinalExam20
 */
public class Q1071FinalExam20 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        boolean flag = true;
        int n = str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i) - str.charAt(n-i-1) != 0){
                flag = false;
            }   
        }
        if(flag){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}