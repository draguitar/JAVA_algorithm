import java.util.Scanner;
/**
 * Q1071FinalExam09
 */
public class Q1071FinalExam09 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String strData[] = scn.nextLine().split(" ");
        int data[] = new int[strData.length];
        for(int i=0;i<strData.length;i++){
            data[i] = Integer.parseInt(strData[i]);
        }
        for(int i = 0; i < strData.length; i++){
            data[i] = Integer.parseInt(strData[i]);
        }
        for(int i = 0;i<strData.length; i++){
            for(int j = i + 1; j < strData.length; j++){
                if(data[i] > data[j]){
                    int tmp = data[i];
                    data[i] = data[j];
                    data[j] = tmp;
                }
            }
            System.out.print(data[i] + "\t");
        }
        System.out.println();
    }
}