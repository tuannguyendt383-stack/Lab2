package QLSP;

public enum ProductCategory {
    FOOD("Thuc pham"),
    CLOTHING("Quan ao"),
    ELECTRONICS("Dien tu");
    private final String description;

    ProductCategory(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }

    public String getDescription() {
        return description;
    }
}
