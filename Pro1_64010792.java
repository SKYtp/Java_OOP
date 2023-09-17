public class Pro1_64010792 {
    public static void main(String[] args) {
        int year = 1;
        while(year <= 5){
            long time = 31536000; //1 year time (s)
            long birth = (time * year) / 7;
            long death = (time * year) / 13;
            long im = (time * year) / 45;
            long pp = 321032486;
            long result = pp + birth - death - im; 
            System.out.println(year+" Year is "+ result);
           ++year;
        }           
    }
}
