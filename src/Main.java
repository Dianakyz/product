import product.*;

import java.util.*;

import static java.util.List.*;

public class Main {

    static Set<Product> products = new HashSet<>();
    public static void main(String[] args) throws ProductAlreadyExistsException {
        Product milk = new Product("Молоко", 8.99f, 1.00f);
        Product bread = new Product("Хлеб", 50.0f, 0.2f);
        Product tomato = new Product("Помидоры", 289f, 1f);
        Product butter = new Product("Сливочное масло", 230f, 0.18f);
        Product meat = new Product("Мясо", 600f, 1f);
        Product cheese = new Product("Сыр", 400, 0.4f);
        Product banana = new Product("Бананы", 100, 1.0f);
        Product pasta = new Product("Макароны", 80, 0.4f);

        ProductList productList = new ProductList();
        productList.addProduct(milk);
        productList.addProduct(bread);
        productList.addProduct(tomato);
        productList.addProduct(butter);
        productList.addProduct(meat);
        productList.addProduct(cheese);
        productList.addProduct(banana);
        productList.addProduct(pasta);

        System.out.println(productList);

        Recipe korbanara = new Recipe("Паста Корбанара", List.of(milk, cheese, pasta, meat));
        Recipe grenki = new Recipe("Французские гренки", List.of(milk, butter, bread));

        RecipeList recipeList = new RecipeList();
        recipeList.addRecipe(korbanara);
        recipeList.addRecipe(grenki);

        System.out.println(recipeList);

        numberSetRemoveEven();

        MultiplicationTable multiplicationTable = new MultiplicationTable();
        System.out.println(multiplicationTable);
        Task task = new Task(3,4);
        Task task2 = new Task(4,3);
        Set<Task> set = new HashSet<>();
        set.add(task);
        set.add(task2);
        System.out.println(set);
    }

    public static void numberSetRemoveEven() {
        Set<Integer> numbers = new HashSet<>(20);
        Random random = new Random();
        while (numbers.size() < 20) {
            numbers.add(random.nextInt(1000));
        }
        System.out.println(numbers);
        Iterator<Integer> numberIterator = numbers.iterator();
        while (numberIterator.hasNext()) {
            int number = numberIterator.next();
            if(number % 2 != 0) {
                numberIterator.remove();
            }
        }

        System.out.println(numbers);
    }
}

// Задание 4. Правильный ответ HashSet. По листу сравнение будет идти дольше,
// так как программа по порядку будет сверяться с каждым значением листа.
// Такая операция займет определенное время. Хэшсет же сравнивает по хэшкоду,
// такая операция занимает меньше времени.