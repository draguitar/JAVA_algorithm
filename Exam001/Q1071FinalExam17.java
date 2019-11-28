import java.util.Scanner;
/**
 * Q1071FinalExam17
 */
public class Q1071FinalExam17 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int digNum[] = new int[4];
        for(int i=0;i<4;i++){
            digNum[i] = Integer.parseInt(str.substring(i,i+1));
        }
        String digits[][] = {{"*****", 
                              "*   *",
                              "*   *",
                              "*   *",
                              "*****"},
                             {"    *", 
                              "    *",
                              "    *",
                              "    *",
                              "    *"},
                             {"*****", 
                              "    *",
                              "*****",
                              "*    ",
                              "*****"},
                             {"*****", 
                              "    *",
                              "*****",
                              "    *",
                              "*****"},
                             {"*   *", 
                              "*   *",
                              "*****",
                              "    *",
                              "    *"},
                             {"*****", 
                              "*    ",
                              "*****",
                              "    *",
                              "*****"},
                             {"*****", 
                              "*    ",
                              "*****",
                              "*   *",
                              "*****"},
                             {"*****", 
                              "    *",
                              "    *",
                              "    *",
                              "    *"},
                             {"*****", 
                              "*   *",
                              "*****",
                              "*   *",
                              "*****"},
                             {"*****", 
                              "*   *",
                              "*****",
                              "    *",
                              "*****"}}; 
        for(int i=0;i<5;i++){
            for(int j=0;j<4;j++){
                System.out.print(digits[digNum[j]][i] + " ");
            }
            System.out.println(" ");
        }
    }
}