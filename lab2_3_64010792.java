import java.util.Scanner;

public class lab2_3_64010792 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter day of month: ");
        int daym = input.nextInt();
        System.out.printf("\nEnter month: ");
        int month = input.nextInt();
        System.out.printf("\nEnter year :");
        int year = input.nextInt();
        input.close();
        int h,q=daym,m=month,j = (year / 100),k = (year % 100),y = year;
        String sun = "Sunday",mon = "Monday",tues = "Tuesday",wednes = "Wednesday",thurs = "Thursday",fri = "Friday";
        String satur = "Saturday";
        h = (q+((26*(m+1))/10)+(k/4)+(j/4)+(5*j)+k)%7;
        String show = "";
        if(h == 0){
            show = satur;
        }
        else if(h == 1){
            show = sun;
        }
        else if(h == 2){
            show = mon;
        }
        else if(h == 3){
            show = tues;
        }
        else if(h == 4){
            show = wednes;
        }
        else if(h == 5){
            show = thurs;
        }
        else if(h == 6){
            show = fri;
        }
        System.out.printf("The name of the day of the week is %s",show);
    }
}
