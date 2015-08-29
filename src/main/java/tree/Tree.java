package tree;

/**
 * General interface for all trees
 */
public interface Tree<T> {
    void add(T element);
    void remove(T element);
    void print(TreePrinter treePrinter);
}
