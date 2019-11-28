import java.util.Random;
import java.util.Scanner;

/**
 * Description:輸入seed，由1~42中選出6個不重覆的數字組合並輸出。
 * Input:正整數(seed)
 */
public class Q1071FinalExam02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random rand = new Random();
        rand.setSeed(scn.nextLong());
        int data[] = new int[6];
        int i = 0;
        boolean flag = true;
        while(i < 6){
            data[i] = rand.nextInt(42)+1;
            flag = true;
            for(int j=0;j<i;j++){
                if(data[i] == data[j]){
                    flag = false;
                }
            }
            if(flag){
                if(i<5){
                    System.out.print(data[i] + "\t");
                }else{
                    System.out.print(data[i]);
                }
                i++;
            }
        }
        scn.close();
        System.out.println();
    }
}