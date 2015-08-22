package tree;

import tree.completeBinaryTree.TreePrinter;

/**
 * General interface for all trees
 */
public interface Tree<T extends ConditionalEquality<T>> {
    void add(T element);
    void remove(T element);
    void print(TreePrinter treePrinter);
}
