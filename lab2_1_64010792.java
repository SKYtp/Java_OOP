import java.util.Scanner;

public class lab2_1_64010792 {
    public static void main(String[] args) {
        System.out.print("Enter today's day: ");
        Scanner input = new Scanner(System.in);
        int today = input.nextInt();
        System.out.printf("\n");
        System.out.print("Enter the number of days elapsed since today: ");
        int elapsed = input.nextInt();
        System.out.printf("\n");
        int count = elapsed;
        int future = today;
        while(count > 0){
            if(future == 6){
                future = 0;
            }
            else{
                future++;
            }
            count--;
        }
        String sun = "Sunday",mon = "Monday",tues = "Tuesday",wednes = "Wednesday",thurs = "Thursday",fri = "Friday";
        String satur = "Saturday";
        String showtoday ="",showfuture = "";
        if(today == 0){
            showtoday = sun;
        }
        else if(today == 1){
            showtoday = mon;
        }
        else if(today == 2){
            showtoday = tues;
        }
        else if(today == 3){
            showtoday = wednes;
        }
        else if(today == 4){
            showtoday = thurs;
        }
        else if(today == 5){
            showtoday = fri;
        }
        else if(today == 6){
            showtoday = satur;
        }
        if(future == 0){
            showfuture = sun;
        }
        else if(future == 1){
            showfuture = mon;
        }
        else if(future == 2){
            showfuture = tues;
        }
        else if(future == 3){
            showfuture = wednes;
        }
        else if(future == 4){
            showfuture = thurs;
        }
        else if(future == 5){
            showfuture = fri;
        }
        else if(future == 6){
            showfuture = satur;
        }
        System.out.printf("Today is %s and the future day is %s",showtoday,showfuture);
        input.close();
    }
}
