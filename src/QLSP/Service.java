package QLSP;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Service {
    public static List<Product> inPut() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("P001", "Product A", 10.5, ProductCategory.ELECTRONICS));
        products.add(new Product("P002", "Product B", 20.0, ProductCategory.CLOTHING));
        products.add(new Product("P003", "Product C", 15.0, ProductCategory.FOOD));
        products.add(new Product("P004", "Product D", 30.0, ProductCategory.ELECTRONICS));
        products.add(new Product("P005", "Product E", 25.0, ProductCategory.CLOTHING));
        products.add(new Product("P006", "Product F", 12.0, ProductCategory.FOOD));
        products.add(new Product("P007", "Product G", 18.0, ProductCategory.ELECTRONICS));
        products.add(new Product("P008", "Product H", 22.0, ProductCategory.CLOTHING));
        return products;
    }

    public static void printProductInfo(List<Product> products) {
        for (Product p : products) {
            System.out.println("Product Name: " + p.getName() + ", ID: " + p.getId() + ", Price: " + p.getPrice() + ", Category: " + p.getCategory());
        }
    }

    public static Map<ProductCategory, Integer> countProductsByCategory(List<Product> products) {
        Map<ProductCategory, Integer> categoryCount = new HashMap<>();
        for (ProductCategory category : ProductCategory.values()) {
            int count = 0;
            for (Product product : products) {
                if (product.getCategory() == category) {
                    count++;
                }
            }
            categoryCount.put(category, count);   
        }
        return categoryCount;
}

    public static Map<ProductCategory, Double> sumPriceByCategory(List<Product> products) {
        Map<ProductCategory, Double> categoryTotalPrice = new HashMap<>();
        for (ProductCategory category : ProductCategory.values()) {
            double totalPrice = 0.0;
            for (Product product : products) {
                if (product.getCategory() == category) {
                    totalPrice += product.getPrice();
                }
            }
            categoryTotalPrice.put(category, totalPrice);
        }
        return categoryTotalPrice;
    }

    public static void printCountProducts(List<Product> products) {
        Map<ProductCategory, Integer> categoryCount = countProductsByCategory(products);
        System.out.println("=== Thong ke san pham theo loai ===");
        for (Map.Entry<ProductCategory, Integer> countEntry : categoryCount.entrySet()) {
            System.out.printf("%s: %d%n", countEntry.getKey(), countEntry.getValue());
        }
    }

    public static void printSumPrice(List<Product> products) {
        Map<ProductCategory, Double> categoryTotalPrice = sumPriceByCategory(products);
        System.out.println("=== Tong gia tri san pham theo loai ===");
        for (Map.Entry<ProductCategory, Double> priceEntry : categoryTotalPrice.entrySet()) {
            System.out.printf("%s: %.2f%n", priceEntry.getKey(), priceEntry.getValue());
        }
    }

}