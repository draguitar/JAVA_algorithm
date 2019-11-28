import java.util.Scanner;
/**
 * Q1071FinalExam13
 */
public class Q1071FinalExam13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int data[][] = new int[n][n];
        int i = 1, j = 0;
        int count = 2, k = i + 1, p = j + 1;
        data[0][0] = 1;
        while(count <= (n * n)){
            data[i][j] = count++;
            if(i-1 >= 0){
                if(j + 1 < n){
                    i--;
                    j++;
                }else{
                    i = n-1;
                    j = p;
                    p++;
                }
            }else{
                if(j+1 < n){
                    i = k;
                    j = 0;
                    k++;
                }else{
                    i = n-1;
                    j = p;
                    p++;
                }
            }
        }
        for(int r=0;r<n;r++){
            for(int s=0;s<n;s++){
                System.out.print(data[r][s] + "\t");
            }
            System.out.println();
        }
        scn.close();
    }
}