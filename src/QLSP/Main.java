package QLSP;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = Service.inPut();
        Service.printProductInfo(products);
        Service.printCountProducts(products);
        Service.printSumPrice(products);
    }

}
