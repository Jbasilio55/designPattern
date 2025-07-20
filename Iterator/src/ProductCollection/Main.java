package ProductCollection;

public class Main {
    public static void main(String[] args) {
        //In the Exercises project, look at the iterator/ProductCollection class.
        //This class only allows us to add a product to a collection. Once we
        //add a bunch of products to a collection, there is no way to iterate
        //that collection and print the products.

        //Implement this feature using the iterator pattern.

        var collection = new ProductCollection();
        collection.add(new Product(1, "a"));
        collection.add(new Product(2, "b"));
        collection.add(new Product(3, "c"));

        var iterator = collection.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
