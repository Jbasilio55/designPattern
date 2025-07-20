package ProductCollection;

public interface Iterator {
    Product current();
    boolean hasNext();
    void next();
}
