import java.util.Scanner;
/**
 * Q1071FinalExam25
 */
public class Q1071FinalExam25 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String isbn = scn.nextLine();
        int data[][] = new int[3][10];
        for(int i=0;i<10;i++){
            if(isbn.substring(i*2, i*2+1).equals("X")){
                data[0][i] = 10;
            }else{
                data[0][i] = Integer.parseInt(isbn.substring(i*2, i*2+1));
            }
        }
        for(int i=1;i<10;i++){
            data[1][i] = data[1][i-1] + data[0][i];
            data[2][i] = data[2][i-1] + data[1][i];
        }
        if(data[2][9]%11 == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}