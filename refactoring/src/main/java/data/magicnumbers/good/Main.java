package data.magicnumbers.good;

public class Main {

    public static void main(String[] args)  {

        Price calculate = new calculatePriceProduct();
        double discountPrice = calculate.calculateDiscount();
        double shippingPrice = calculate.calculateShipping();
    }
}
