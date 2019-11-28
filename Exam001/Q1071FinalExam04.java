import java.util.Scanner;

/**
 * Input:分別輸入整數寬𝑤𝑤、高ℎ。
 * Output:輸出寬𝑤、高ℎ如下的數字矩陣，數字間請以tab間格，最後必須有換行字元。
 */
public class Q1071FinalExam04 {

    public static void main(final String[] args) {
        final Scanner scn = new Scanner(System.in);
        fun(scn.nextInt(), scn.nextInt());
        scn.close();
    }
    public static void fun(final int w, final int h){
        for(int i = 1; i <= h; i++){
            for(int j = 1; j <= w; j++){
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
    }
}