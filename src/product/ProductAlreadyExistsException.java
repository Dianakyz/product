package product;

public class ProductAlreadyExistsException extends Exception {

    public ProductAlreadyExistsException() {

    }

    public ProductAlreadyExistsException(String message) {
        super("Товар уже куплен!");
    }
}
