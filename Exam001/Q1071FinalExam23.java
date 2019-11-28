import java.util.Scanner;
/**
 * Q1071FinalExam23
 */
public class Q1071FinalExam23 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        long data[] = new long[n];
        int data1[] = new int[n];
        for(int i=0;i<n;i++){
            data[i] = scn.nextLong();
            data1[i] = fun(data[i]);
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(data1[i] > data1[j]){
                    int tmp = data1[i];
                    data1[i] = data1[j];
                    data1[j] = tmp;
                    long tmp1 = data[i];
                    data[i] = data[j];
                    data[j] = tmp1;
                }else if(data1[i] == data1[j]){
                    if(data[i] > data[j]){
                        int tmp = data1[i];
                        data1[i] = data1[j];
                        data1[j] = tmp;
                        long tmp1 = data[i];
                        data[i] = data[j];
                        data[j] = tmp1;
                    }
                }
            }
            System.out.print(data[i] + "\t");
        }
        System.out.println();
    }
    public static int fun(long n1){
        int result = 0;
        while(n1>0){
            result += n1%10;
            n1 /= 10;
        }
        return result;
    }
}