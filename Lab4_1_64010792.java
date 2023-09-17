public class Lab4_1_64010792 {
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL","Oracle Coperation",34.5,34.35);
        System.out.println("Symbol: " + stock.symbol);
        System.out.println("Name: " + stock.name);
        System.out.println("Previous Closing Price: " + stock.previousClosingPrice);
        System.out.println("Current Price: " + stock.currentPrice);
        System.out.println("Price Change: " + stock.getChangePercent() + "%");
    }
}
class Stock{
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;
    Stock(){
    }
    Stock(String newsymbol , String newname){
        symbol = newsymbol;
        name = newname;
    }
    Stock(String newsymbol , String newname,double pre,double cu){
        symbol = newsymbol;
        name = newname;
        previousClosingPrice = pre;
        currentPrice = cu;
    }
    double getChangePercent(){
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }
}
