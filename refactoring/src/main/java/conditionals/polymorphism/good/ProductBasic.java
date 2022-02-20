package conditionals.polymorphism.good;

public class ProductBasic extends Product{
    @Override
    double calculatePrice() {
        return this.getPrice() + SHIPPING;
    }
}
