import java.util.Scanner;
/**
 * Q1071FinalExam11
5
1 2 3 -5 4
 */
public class Q1071FinalExam11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int data[] = new int[n];
        int val = 0;
        String str = "";
        for(int i = 0; i < n; i++){
            data[i] = scn.nextInt();
        }
        for(int i = 0;i<n; i++){
            val = data[i];
            str = Integer.toString(data[i]);
            for(int j = i + 1; j < n; j++){
                val += data[j];
                str += " " + Integer.toString(data[j]);
                if(val == 0){
                    System.out.println(str);
                }
            }
        }
    }
}