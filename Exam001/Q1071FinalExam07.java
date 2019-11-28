import java.util.Scanner;
/**
 * Q1071FinalExam07
 * test data:
3
103021020
105074011
102033058
 */
public class Q1071FinalExam07 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        long data[] = new long[n];
        for(int i = 0; i < n; i++){
            data[i] = scn.nextLong();
        }
        for(int i = 0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(data[i] > data[j]){
                    long tmp = data[i];
                    data[i] = data[j];
                    data[j] = tmp;
                }
            }
            System.out.println(data[i]);
        }
    }
}