

public class Calculator {
    String product = "";
    double totalPrice;
    double personalAmount;

    public  void addProduct(String productName, double costGoods) {

        product = product + productName +" "+":"+" "+Formatter.roundingCostProduct(costGoods) +" "+ Formatter.rubleCorrectCase(costGoods) + "\n" ;
    }

    public  void countingGoods(int numberPeople, double costGoods) {

        totalPrice = totalPrice + costGoods;
        personalAmount = totalPrice / numberPeople;
    }
}
