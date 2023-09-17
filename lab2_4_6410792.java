import java.util.Scanner;

public class lab2_4_6410792 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the first city: ");
        String city1 = input.next();
        System.out.printf("\nEnter the second city: ");
        String city2 = input.next();
        System.out.printf("\nEnter the third city: ");
        String city3 = input.next();
        String c01 = city1.toUpperCase();
        String c02 = city2.toUpperCase();
        String c03 = city3.toUpperCase();
        char c1 = c01.charAt(0);
        char c2 = c02.charAt(0);
        char c3 = c03.charAt(0);
        String city01 = "",city02 = "",city03 = "";
        if(c1 >= c2 && c2 >= c3){
            city01 = city3;
            city02 = city2;
            city03 = city1;
        }
        else if(c1 >= c3 && c3 >= c2){
            city01 = city2;
            city02 = city3;
            city03 = city1;
        }
        else if(c2 >= c1 && c1 >= c3){
            city01 = city3;
            city02 = city1;
            city03 = city2;
        }
        else if(c2 >= c3 && c3 >= c1){
            city01 = city1;
            city02 = city3;
            city03 = city2;
        }
        else if(c3 >= c1 && c1 >= c2){
            city01 = city2;
            city02 = city1;
            city03 = city3;
        }
        else if(c3 >= c2 && c2 >= c1){
            city01 = city1;
            city02 = city2;
            city03 = city3;
        }
        System.out.printf("The three cities in alphabetical order are %s %s %s",city01,city02,city03);
    }
}
