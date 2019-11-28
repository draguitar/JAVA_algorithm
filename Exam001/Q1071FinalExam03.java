import java.util.Scanner;
/**
 * Descripton:宣告一個5*7(直5橫7)的二維整數陣列，使用者輸入陣列元素(0~100)，並將行列互換輸出。
 * Input:輸入陣列元素(0~100)
 * Output:行列互換輸出，數字以tab間格，最後必須有換行字元。
 */
public class Q1071FinalExam03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = 5, m = 7;
        int data[][] = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                data[i][j] = scn.nextInt();
            }
        }
        for(int j = 0; j < m; j++){
            for(int i = 0; i < n; i++){
                System.out.print(data[i][j] + "\t");
            }
            scn.close();
            System.out.println();
        }

    }
}