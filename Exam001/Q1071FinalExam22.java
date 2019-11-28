import java.util.Scanner;
/**
 * Q1071FinalExam22
 */
public class Q1071FinalExam22 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char data[][] = new char[3][3];
        boolean flag = false;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                data[i][j] = scn.next().charAt(0);
            }
        }
        if(data[0][0]-data[0][1] ==0 && data[0][0]-data[0][2] == 0){
            flag = true;
        }else if(data[0][0]-data[1][0] ==0 && data[0][0]-data[2][0] == 0){
            flag = true;
        }else if(data[0][0]-data[1][1] ==0 && data[0][0]-data[2][2] == 0){
            flag = true;
        }else if(data[0][1]-data[1][1] ==0 && data[0][1]-data[2][1] == 0){
            flag = true;
        }else if(data[0][2]-data[1][2] ==0 && data[0][2]-data[2][2] == 0){
            flag = true;
        }else if(data[0][2]-data[1][1] ==0 && data[0][2]-data[2][0] == 0){
            flag = true;
        }else if(data[1][0]-data[1][1] ==0 && data[1][0]-data[1][2] == 0){
            flag = true;
        }else if(data[2][0]-data[2][1] ==0 && data[2][0]-data[2][2] == 0){
            flag = true;
        }
        if(flag){
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }
    }
}