public class Lab3_2_2_64010792 {
    public static void main(String[] args) {
        int c = 0 , g = 2 ,line = 0;
        int num = 9;
        boolean check = false;
        while(true){
            for (int i = 2; i <= num / 2; ++i) {
                if(g == 2 || g == 3 || g == 5 || g == 7){
                    line = line + palin(g);
                    break;
                }
                if (num % i == 0) {
                    check = true;
                    break;
                }

            }


        }
    
        // while(true){
            
        //     for(int j = 2;j <= 1000;j++){
        //        if(g == 2 || g == 3 || g == 5 || g == 7){
        //            line = line + palin(g);
        //            break;
        //        }
        //        else if(g % j == 0 && g != j){
        //            break;
        //        }
        //        if(j == 100){
        //         line = line + palin(g);
        //         break;
        //        } 
        //     }
        //     g++;
        //     if(line == 10){
        //         line = 0;
        //         c++;
        //         System.out.printf(" \n");
        //     }
        //     if(c == 10){
        //         break;
        //     }
        // }
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
