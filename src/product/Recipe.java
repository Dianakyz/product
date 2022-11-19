package product;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Recipe {

    private final String name;
    private final List<Product> products;

    public Recipe(String name, List<Product> products) {
        if (name == null || name.isBlank() || products == null || products.size() == 0) {
            throw new IllegalArgumentException("Не заполнены поля!");
        }
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public float getRecipePrice() {
        float sum = 0;
        for (Product product : products) {
            sum += product.getPrice();
        }
        return sum;
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return name.equals(recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String toString() {
        return "Название рецепта: " + this.name + ". В состав блюда входит: " + this.products;
    }
}
