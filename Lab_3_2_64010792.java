import java.util.Scanner;

public class Lab_3_2_64010792 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size for the matrix: ");
        int num = input.nextInt();
        int[][] mt = new int[num][num];
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
        //Row
        int c_row = 0;
        for(int row = 0; row < num;row++){
            if(checkrow(mt, row, num)){
                System.out.printf("All %ds on row %d \n",mt[row][0],row);
                c_row++;
            }
        }
        if(c_row == 0){
            System.out.println("No same numbers on a row");  
        }
        //Colum
        int c_col = 0;
        for(int col = 0; col < num;col++){
            if(checkcol(mt, col, num)){
                System.out.printf("All %ds on colum %d \n",mt[0][col],col);
                c_col++;
            }
        }
        if(c_col == 0){
            System.out.println("No same numbers on a colum");  
        }
        //Super
        int c_super = 0;
        if(checkss(mt, 0, 1, num)){
            System.out.printf("All %ds on the superdiagonal\n",mt[0][1]);
            c_super++;
        }
        if(c_super == 0){
            System.out.println("No same numbers on the superdiagonal");
        }
        //dia
        int c_dia = 0;
        if(checkss(mt, 0, 0, num)){
            System.out.printf("All %ds on the diagonal\n",mt[0][0]);
            c_dia++;
        }
        if(c_dia == 0){
            System.out.println("No same numbers on the diagonal");
        }
        //Sub
        int c_sub = 0;
        if(checkss(mt, 1, 0, num)){
            System.out.printf("All %ds on the subdiagonal\n",mt[1][0]);
            c_sub++;
        }
        if(c_sub == 0){
            System.out.println("No same numbers on the subdiagonal");
        }
    }
    public static boolean checkrow(int[][] m,int row,int num){
        for(int col = 0;col < (num-1);col++){
            if(m[row][col] != m[row][col + 1]){
                return false;
            }
        }
        return true;
    }
    public static boolean checkcol(int[][] m,int col,int num){
        for(int row = 0;row < (num-1);row++){
            if(m[row][col] != m[row+1][col]){
                return false;
            }
        }
        return true;
    }
    public static boolean checkss(int[][] m,int row,int col,int num){
        int r = row,c = col;
        while(r < (num-1) && c < (num-1)){
            if(m[r][c] != m[r+1][c+1]){
                return false;
            }
            r++;
            c++;
        }
        return true;
    }
}
