import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab3_2_64010792 {
    public static void main(String[] args) 
        throws IOException
    {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        int[] num1 = new int[10];
        int[] num2 = new int[10];
        int c1 = 0;
        int c2 = 0;
        String[] strNums1,strNums2;
        System.out.print("Enter list1: ");
        strNums1 = bi.readLine().split(" ");
        for (int i = 0; i < strNums1.length; i++) {
            num1[i] = Integer.parseInt(strNums1[i]);
            c1++;
        }

        System.out.print("Enter list2: ");
        strNums2 = bi.readLine().split(" ");
        for (int i = 0; i < strNums2.length; i++) {
            num2[i] = Integer.parseInt(strNums2[i]);
            c2++;
        }
        int[] num01 = new int[c1];
        int[] num02 = new int[c2];
        for (int i = 0; i < num01.length; i++) {
            num01[i] = num1[i];
        }
        for (int i = 0; i < num02.length; i++) {
            num02[i] = num2[i];
        }
        int[] result = merge(num01, num02);

        System.out.print("The merged list is ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    public static int[] merge(int[] list1, int[] list2){
        int l1 = list1.length;
        int l2 = list2.length;
        int[] keep1 = new int[l1 + l2];
        int[] keep2 = new int[l1 + l2];
        int[] list = new int[l1 + l2];
        int[] ch = new int[l1 + l2];
        System.arraycopy(list1, 0, keep1, 0, l1);  
        System.arraycopy(list2, 0, keep1, l1, l2);
        System.arraycopy(list1, 0, keep2, 0, l1);  
        System.arraycopy(list2, 0, keep2, l1, l2);
        int i = 0;
        int go = 0;
        for(int j = 0; j < (l1 + l2);j++){
            ch[j] = 0;
        }
        while(i < (l1 + l2)){
            for(int j = 0; j < (l1 + l2);j++){
                keep1[j]--;
            }
            for(int j = 0; j < (l1 + l2);j++){
                if(keep1[j] <= 0 && ch[j] == 0){
                    list[i] = keep2[j];
                    ch[j] = 10;
                    i++;
                }
            }
        }

        return list;
    }
}
