import java.util.Scanner;

public class Lab3_3_64010792 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size for the matrix: ");
        int num = input.nextInt();
        int[][] mt = new int[num][num];
        int c_row = 0,c_col = 0;
        for(int row = 0;row < num;row++){
            for(int col = 0; col < num;col++){
                mt[row][col] = (int)(Math.random() * 2);
            }
        }
        for(int row = 0;row < num;row++){
            for(int col = 0; col < num;col++){
                System.out.print(mt[row][col]);
            }
            System.out.printf(" \n");
        }
        // Row
        for(int row = 0;row < num;row++){
            for(int col = 0; col < num;col++){
                if(mt[row][col] != mt[row][col+1] && col + 1 < num){
                    break;
                }
                else if(mt[row][num-2] == mt[row][num-1] && mt[row][0] == mt[row][1]){
                    if(mt[row][num-2] == 0){
                        System.out.printf("All 0s on row %d \n",row);
                        c_row++;
                        break;
                    }
                    else{
                        System.out.printf("All 1s on row %d \n",row);
                        c_row++;
                        break;
                    }
                }
            }
        }
        if(c_row == 0){
            System.out.println("No same numbers on a row");
        }

        // Colum
        int c1_col = 0;
        for(int col = 0; col < num;col++){
            for(int row = 0;row < num;row++){
                for(int a = 0;a < (num - 1);a++){
                    if(mt[a][col] != mt[a+1][col]){
                        c1_col++;
                    }
                }
                if(c1_col != 0){
                    break;
                }
                if(mt[row][col] != mt[row+1][col] && row + 1 < num){
                    break;
                }
                else if(mt[num-2][col] == mt[num-1][col] && mt[0][col] == mt[1][col]){
                    if(mt[num-2][col] == 0){
                        System.out.printf("All 0s on colum %d \n",col);
                        c_col++;
                        break;
                    }
                    else{
                        System.out.printf("All 1s on colum %d \n",col);
                        c_col++;
                        break;
                    }
                }
            }
        }
        if(c_col == 0){
            System.out.println("No same numbers on a colum");
        }

        //super
        int r1 = 0,c1 = 1,c_super = 0;
        while(r1 < num && c1 < num){
            if(mt[r1][c1] != mt[r1+1][c1+1] && r1 + 1 < num && c1 + 1 < num){
                break;
            }
            else if(mt[num-3][num-2] == mt[num-2][num-1] && mt[0][1] == mt[1][2]){
                if(mt[num-3][num-2] == 0){
                    System.out.println("All 0s on the superdiagonal");
                    c_super++;
                    break;
                }
                else{
                    System.out.println("All 1s on the superdiagonal");
                    c_super++;
                    break;
                }
            }
            r1++;
            c1++;
        }
        if(c_super == 0){
            System.out.println("No same numbers on the superdiagonal");
        }



        //
        //dia
        int rm = 0,cm = 0,c_dia = 0;
        while(rm < num && cm < num){
            if(mt[rm][cm] != mt[rm+1][cm+1] && rm + 1 < num && cm + 1 < num){
                break;
            }
            else if(mt[num-2][num-2] == mt[num-1][num-1] && mt[0][0] == mt[1][1]){
                if(mt[num-2][num-2] == 0){
                    System.out.println("All 0s on the diagonal");
                    c_dia++;
                    break;
                }
                else{
                    System.out.println("All 1s on the diagonal");
                    c_dia++;
                    break;
                }
            }
            rm++;
            cm++;
        }
        if(c_dia == 0){
            System.out.println("No same numbers on the diagonal");
        }


    }
}
