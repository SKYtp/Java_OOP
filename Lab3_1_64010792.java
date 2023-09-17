public class Lab3_1_64010792 {
    public static void main(String[] args) {
        int co = 0 , g = 2 ,line = 0;
        while(true){
            for(int j = 2;j <= 10000;j++){
               if(g == 2 || g == 3 || g == 5 || g == 7){
                   line = line + palin(g);
                   break;
               }
               else if(g % j == 0 && g != j){
                   break;
               }
               if(j == 10000){
                line = line + palin(g);
                break;
               } 
            }
            g++;
            if(line == 10){
                line = 0;
                co++;
                System.out.printf(" \n");
            }
            if(co == 10){
                break;
            }
        }
    }
    public static int palin(int num) {
        int keep = num;
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
        else{
            return 0;
        }

    }
}
