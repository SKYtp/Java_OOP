import java.util.concurrent.ThreadLocalRandom;

//import java.util.Random;

public class Lab4_3_64010792 {

    public static void main(String[] args) {
        StopWatch c = new StopWatch();
        double[] num = new double[1000];
        int count = 0;
        //Random ran = new Random();
        System.out.println("Creating a list containing 1000 elements,");
        for(int i = 0;i < 1000;i++){
            //num[i] = 100 + ran.nextInt(899);
            //num[i] = (int)(Math.random() * (9999 - 100 + 1)) + 100;
            num[i] = ThreadLocalRandom.current().nextDouble(10, 1000);
        }
        for(int i = 0;i < 250;i++){
            for(int j = 0;j < 4;j++){
                System.out.printf("   %.2f",num[count]);
                count++;
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("List created.");
        System.out.println("Sorting stopwatch starts...");
        System.out.println(" ");
        c.start();
        selectionSort(num);
        count = 0;
        for(int i = 0;i < 250;i++){
            for(int j = 0;j < 4;j++){
                System.out.printf("   %.2f",num[count]);
                count++;
            }
            System.out.println(" ");
        }
        System.out.println("Sorting stopwatch stoped.");
        c.stop();
        System.out.println("The sort time is " + c.getElapsedTime() + " milliseconds.");
        System.out.println("------------------------------------------------------------");

        //end of part 1

        System.out.println("The palindromPrime stopwatch starts...");
        c.start();
        System.out.println("Creating 1000 PalindromPrime...");
        long co = 0 , g = 2 ,line = 0;
        int ca = 0;
        while(true){
            for(Long j = 2;j <= 50000;j++){
               if(g == 2 || g == 3 || g == 5 || g == 7){
                   line = line + palin(g);
                   break;
               }
               else if(g % j == 0 && g != j){
                   break;
               }
               if(j == 50000){
                line = line + palin(g);
                break;
               } 
            }
            g++;
            if(line == 10){
                line = 0;
                co++;
                ca++;
                System.out.printf("  --%d-- \n",ca);
            }
            if(co == 100){
                break;
            }
        }
        System.out.println("PalindromePrime created.");
        System.out.println("The palindromPrime stopwatch stoped.");
        c.stop();
        System.out.println("The palindromPrime time is " + c.getElapsedTime() + " milliseconds.");
        System.out.println(" ");
        
        //end of part 2

    }
    public static void selectionSort(double[] num){  
        for (int i = 0; i < num.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < num.length; j++){  
                if (num[j] < num[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            Double smallerNumber = num[index];   
            num[index] = num[i];  
            num[i] = smallerNumber;  
        }    
    }
    public static int palin(long num) {
        long keep = num;
        int[] get = new int[10];
        int i = 0;
        while(num > 0){
            get[i] = num % 10;
            num = num/10;
            i++;
        }
        if(i == 1){
            System.out.print(keep + " ");
            return 1;
        }
        else if(i == 2){
            if(get[0] == get[i-1]){
                System.out.print(keep + " ");
                return 1;
            }
            else{
                return 0; 
            }
        }
        else if(i == 3){
            if(get[0] == get[i-1]){
                System.out.print(keep + " ");
                return 1;
            }
            else{
                return 0; 
            }
        }
        else if(i == 4){
            if(get[0] == get[i-1] && get[1] == get[i-2]){
                System.out.print(keep + " ");
                return 1;
            }
            else{
                return 0; 
            }
        }
        else if(i == 5){
            if(get[0] == get[i-1] && get[1] == get[i-2]){
                System.out.print(keep + " ");
                return 1;
            }
            else{
                return 0; 
            }
        }
        else if(i == 6){
            if(get[0] == get[i-1] && get[1] == get[i-2] && get[2] == get[i-3]){
                System.out.print(keep + " ");
                return 1;
            }
            else{
                return 0; 
            }
        }
        else if(i == 7){
            if(get[0] == get[i-1] && get[1] == get[i-2] && get[2] == get[i-3]){
                System.out.print(keep + " ");
                return 1;
            }
            else{
                return 0; 
            }
        }
        else if(i == 8){
            if(get[0] == get[i-1] && get[1] == get[i-2] && get[2] == get[i-3] && get[3] == get[i-4]){
                System.out.print(keep + " ");
                return 1;
            }
            else{
                return 0; 
            }
        }
        else if(i == 9){
            if(get[0] == get[i-1] && get[1] == get[i-2] && get[2] == get[i-3] && get[3] == get[i-4]){
                System.out.print(keep + " ");
                return 1;
            }
            else{
                return 0; 
            }
        }
        else if(i == 10){
            if(get[0] == get[i-1] && get[1] == get[i-2] && get[2] == get[i-3] && get[3] == get[i-4] && get[4] == get[i-5]){
                System.out.print(keep + " ");
                return 1;
            }
            else{
                return 0; 
            }
        }
        else if(i == 11){
            if(get[0] == get[i-1] && get[1] == get[i-2] && get[2] == get[i-3] && get[3] == get[i-4] && get[4] == get[i-5]){
                System.out.print(keep + " ");
                return 1;
            }
            else{
                return 0; 
            }
        }
        else{
            return 0;
        }

    }
}
class StopWatch{
    private long startTime , endTime;
    StopWatch(){
        startTime = System.currentTimeMillis();
    }
    public void start(){
        startTime = System.currentTimeMillis();
    }
    public void stop(){
        endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return endTime - startTime;
    }
}
