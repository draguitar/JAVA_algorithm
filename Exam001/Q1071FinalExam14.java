import java.util.Scanner;
/**
 * Q1071FinalExam14
 */
public class Q1071FinalExam14 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int year = scn.nextInt(), month = scn.nextInt();
        int data[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        boolean flag = false;
        System.out.println("SU\tMO\tTU\tWE\tTH\tFR\tSA");
        
        int val1 = (year / 4) - (year / 100) + (year / 400);
        int val = val1 * 366 + (year - val1) * 365;
        int count = 0;;
        if(year % 400 == 0){
            flag = true;
        }else if(year % 100 == 0){
            flag = false;
        }else if(year % 4 == 0){
            flag = true;
        }
        if(flag){
            data[1] = 29;
        }
        for(int i=0;i<month-1;i++){
            
            val += data[i];
        }
        val %= 7;
        for(int i=0; i<val;i++){
            System.out.print(" \t");
            count++;
        }
        int i = 1;
        while(i <= data[month-1]){
            System.out.print(i + "\t");
            i++;
            count++;
            if(count%7 == 0){
                System.out.println();
            }
        }
        if(count%7 != 0){
            System.out.println();
        }
    }
}