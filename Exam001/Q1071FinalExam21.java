import java.util.Scanner;
/**
 * Q1071FinalExam21
 */
public class Q1071FinalExam21 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        String strArray[] = str.split(" ");
        int strArraySize = strArray.length;
        int count[][] = new int[2][26];
        int val = 0;
        for(int i=0; i<str.length();i++){
            val = str.charAt(i) - 'a';
            if(val >=0 && val <26){
                count[0][val]++;
            }else{
                val = str.charAt(i) - 'A';
                if(val >=0 && val <26){
                    count[1][val]++;
                }
            }
        }
        System.out.println(strArraySize);
        for(int i=0;i<26;i++){
            if(count[0][i]>0){
                System.out.println((char)((int)'a' + i) + "=" + Integer.toString(count[0][i]));
            }
        }
        for(int i=0;i<26;i++){
            if(count[1][i]>0){
                System.out.println((char)((int)'A' + i) + "=" + Integer.toString(count[1][i]));
            }
        }
    }
    
}