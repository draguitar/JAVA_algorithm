import java.util.Scanner;
/**
 * Q1071FinalExam15
 */
public class Q1071FinalExam15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int data[][] = new int[n][n];
        int data1[][] = new int[n][n];
        int count = 1;
        for(int i=0;i<n;i++){
            if(i%2 == 0){
                for(int j=0;j<n;j++){
                    data[i][j] = count;
                    data1[j][i] = count++;
                }
            }else{
                for(int j=n-1;j>=0;j--){
                    data[i][j] = count;
                    data1[j][i] = count++;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(i == 0){
                System.out.print("A[" + n +"]["+ n +"]=\t");
            }else{
                System.out.print("\t\t");
            }
            for(int j=0;j<n;j++){   
                System.out.print(data[i][j] + "\t");
            }
            if(i == 0){
                System.out.print("B[" + n +"]["+ n +"]=\t");
            }else{
                System.out.print("\t\t");
            }
            for(int j=0;j<n;j++){
                System.out.print(data1[i][j] + "\t");
            }
            System.out.println();
        }
    }
}