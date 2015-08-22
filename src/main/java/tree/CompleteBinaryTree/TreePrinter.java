package tree.completeBinaryTree;

import tree.ConditionalEquality;
import tree.Tree;

/**
 *
 */
public interface TreePrinter {
    <T extends ConditionalEquality<T>> void print(Tree<T> tree);
}
