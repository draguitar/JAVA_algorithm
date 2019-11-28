import java.util.Scanner;
/**
 * Q1071FinalExam12
8 6
2 3 3 2 3 4 5 6
3 3 1 -1 4 7
 */
public class Q1071FinalExam12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), m = scn.nextInt();
        int data[] = new int[n];
        int data1[] = new int[m];
        int count = 0;
        boolean flag = true;
        for(int i = 0; i < n; i++){
            data[i] = scn.nextInt();
        }
        for(int i = 0; i < m; i++){
            data1[i] = scn.nextInt();
        }
        for(int i=0;i<n;i++){
            flag = true;
            for(int j=0;j < i; j++){
                if(data[i] == data[j]){
                    flag = false;
                }
            }
            if(flag){
                for(int j=0;j<m;j++){
                    if(data[i] == data1[j]){
                        count++;
                        break;
                    }
                }    
            }
        }
        scn.close();
        System.out.println(count);
    }
}