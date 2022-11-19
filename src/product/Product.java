package product;

import java.util.Objects;

public class Product {

    private final String name;
    private final float price;
    private final float weight;

    private boolean checked;


    public Product(String name, float price, float weight) {

        if (name == null || name.isBlank() || price <= 0 || weight <= 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью!");
        }
            this.name = name;
            this.price = price;
            this.weight = weight;
            this.checked = false;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public void setChecked() {
        this.checked = true;
    }

    public boolean isChecked() {
        return checked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String toString() {
        String checkedString = this.isChecked() ? "Нет" : "Да";
        return String.format("%s, Цена: %s, Вес в кг: %s, Куплен: %s",
                this.name, this.price,
                this.weight, checkedString);
    }
}
