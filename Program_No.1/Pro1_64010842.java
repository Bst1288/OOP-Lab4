public class Pro1_64010842 {
    public static void main(String[] args){
        Stock stock = new Stock("ORCL", "Oracle Corporation");
        stock.previousClosingPrice = 34.5;
        stock.currentPrice = 34.35;

        System.out.println("Symbol : " + stock.symbol);
        System.out.println("Name : " + stock.name);
        System.out.println("Previous Closing Price: " + stock.previousClosingPrice);
        System.out.println("Current Price: " + stock.currentPrice);
        System.out.println("Price Change : " + stock.getChangePercent()+"%");
        System.out.println("");
    }
}