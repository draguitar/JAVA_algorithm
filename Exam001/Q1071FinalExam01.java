import java.util.Scanner;
/**
 * Description:輸入一個字串，並把它反向輸出。
 * Input:AsIACSIE
 * Output:EISCAIsA
 */
public class Q1071FinalExam01 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
        scn.close();
        System.out.println();
    }
}