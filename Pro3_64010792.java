import java.util.Scanner;

public class Pro3_64010792 {
    public static void main(String[] args) {
        System.out.print("Enter a number between 0 and 1000: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int addnum;
        int checknum = num;
        int result = 0;
        if(checknum >= 0 && checknum <=1000){
            while(num != 0){
                addnum = num % 10;
                num = num/10;
                result = result + addnum;
            }
            System.out.printf("\nThe sum of the digits is %d",result);
        }
        else{
            System.out.printf("\nError");
        }
    }
}
