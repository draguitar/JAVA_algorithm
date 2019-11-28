import java.util.Scanner;
/**
 * Q1071FinalExam16
 */
public class Q1071FinalExam16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt(), m1 = scn.nextInt();
        int n2 = scn.nextInt(), m2 = scn.nextInt();
        int data1[][] = new int[n1][m1];
        int data2[][] = new int[n2][m2];
        int outData[][] = new int[n1][m2];
        for(int i=0;i<n1;i++){
            for(int j=0;j<m1;j++){
                data1[i][j] = scn.nextInt();
            }
        }
        for(int i=0;i<n2;i++){
            for(int j=0;j<m2;j++){
                data2[i][j] = scn.nextInt();
            }
        }
        for(int i=0;i<n1;i++){
            for(int j=0;j<m1;j++){
                for(int k = 0;k<m2;k++){
                    outData[i][k] += data1[i][j]*data2[j][k];
                }
            }
        }
        for(int i=0;i<n1;i++){
            for(int j=0;j<m2;j++){
                System.out.print(outData[i][j] + "\t");
            }
            System.out.println();
        }
    }
}