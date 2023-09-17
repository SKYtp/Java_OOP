import java.util.Scanner;

public class lab2_2_64010792 {
    public static void main(String[] args) {
        System.out.print("scissor (0), rock (1), paper (2): ");
        Scanner input = new Scanner(System.in);
        int game = input.nextInt();
        System.out.printf("\n");
        int ran = (int)(Math.random() * 3);
        String scis = "Scissor" , rock = "Rock" , paper = "Paper";
        String you = "" , bot = "";
        System.out.println(ran);
        if(game < 0 || game > 2){
            System.out.println("Error");
        }
        else{
            if(game == 0){
                you = scis;
            }
            else if(game == 1){
                you = rock;
            }
            else if(game == 2){
                you = paper;
            }
            if(ran == 0){
                bot = scis;
            }
            else if(ran == 1){
                bot = rock;
            }
            else if(ran == 2){
                bot = paper;
            }
            if(game == 0 && ran == 0){
                System.out.printf("The computer is %s. You are %s too. It is a draw",you,bot);
            }
            else if(game == 1 && ran == 1){
                System.out.printf("The computer is %s. You are %s too. It is a draw",you,bot);
            }
            else if(game == 2 && ran == 2){
                System.out.printf("The computer is %s. You are %s too. It is a draw",you,bot);
            }
            else if(game == 0 && ran == 1){
                System.out.printf("The computer is %s. You are %s. You lose",you,bot);
            }
            else if(game == 0 && ran == 2){
                System.out.printf("The computer is %s. You are %s. You won",you,bot);
            }
            else if(game == 1 && ran == 0){
                System.out.printf("The computer is %s. You are %s. You won",you,bot);
            }
            else if(game == 1 && ran == 2){
                System.out.printf("The computer is %s. You are %s. You lose",you,bot);
            }
            else if(game == 2 && ran == 0){
                System.out.printf("The computer is %s. You are %s. You lose",you,bot);
            }
            else if(game == 2 && ran == 1){
                System.out.printf("The computer is %s. You are %s. You won",you,bot);
            }
        }
        input.close();

    }
}
