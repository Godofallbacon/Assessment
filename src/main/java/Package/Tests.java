package Package;

public class Tests {
    public static void main(String[] args) {
        Product rice = new Product();
        Product beans = new Product();
        System.out.println(rice.priceRice(20,5,5));
        System.out.println(beans.priceRice(10,2,15));

    }
}
