import java.util.Scanner;
/**
 * Q1071FinalExam19
 */
public class Q1071FinalExam19 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = Integer.parseInt(scn.nextLine());
        int val = 0;
        for(int i=0;i<n;i++){
            String strData[] = scn.nextLine().split(" ");
            val = strData.length;
            int data[] = new int[val];
            for(int j=0;j<val;j++){
                switch(strData[j].charAt(0)){
                    case 'S':
                        data[j] = 39;
                        break;
                    case 'H':
                        data[j] = 26;
                        break;
                    case 'D':
                        data[j] = 13;
                        break;
                    case 'C':
                        break;
                }
                data[j] += Integer.parseInt(strData[j].substring(1));
            }
            for(int j=0;j<val;j++){
                for(int k = j+1;k<val;k++){
                    if(data[j] < data[k]){
                        int tmp = data[j];
                        data[j] = data[k];
                        data[k] = tmp;
                        String tmpStr = strData[j];
                        strData[j] =strData[k];
                        strData[k] = tmpStr;
                    }
                }
                System.out.print(strData[j] + "\t");
            }
            System.out.println();
            
        }
    }
}