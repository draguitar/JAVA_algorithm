import java.util.Scanner;
/**
 * Q1071FinalExam10
6
1 2 4 -4 9 7
 */
public class Q1071FinalExam10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int data[] = new int[n];
        int maxVal = Integer.MIN_VALUE, val = 1;
        for(int i = 0; i < n; i++){
            data[i] = scn.nextInt();
        }
        for(int i = 0;i<n; i++){
            val = data[i];
            for(int j = i + 1; j < n; j++){
                val *= data[j];
                if(val > maxVal){
                    maxVal = val;
                }
            }
        }
        scn.close();
        System.out.println(maxVal);
    }
}