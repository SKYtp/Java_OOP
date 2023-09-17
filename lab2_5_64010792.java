import java.util.Scanner;

public class lab2_5_64010792 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter 1 - 15: ");
        int num = input.nextInt();
        input.close();
        if(num >= 1 && num <= 15){
            for(int i = 1;i <= num;i++){
                for(int a = num - i;a >= 1 ;a--){
                    System.out.print(" ");
                }
                for(int b = i; b >= 2;b--){
                    System.out.print(b +" ");
                } 
                for(int c = 1; c <= i;c++){
                    System.out.print(c +" ");
                } 
                System.out.printf("\n");
            }
            
        }
        else{
            System.out.println("\nError");
        }
    }   
}
