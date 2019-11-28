import java.util.Scanner;
/**
 * Q1071FinalExam24
 */
public class Q1071FinalExam24 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String idStr = scn.next();
        int data[] ={10, 11, 12, 13, 14, 15, 16, 17, 34, 18, 19, 20, 21, 22, 35, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33};
        int val = data[idStr.charAt(0) - 'A'];
        int p = (val / 10) + (9 * (val%10));
        int j = 1;
        for(int i=8;i>=1;i--){
            p += i * Integer.parseInt(idStr.substring(j,j+1));
            j++;
        }
        p += Integer.parseInt(idStr.substring(9,10));
        if(p % 10 == 0){
            System.out.println("CORRECT!!!");
        }else{
            System.out.println("WRONG!!!");
        }
    }
}