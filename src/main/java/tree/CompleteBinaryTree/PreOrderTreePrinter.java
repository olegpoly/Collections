package tree.completeBinaryTree;

import tree.ConditionalEquality;
import tree.Tree;

import java.util.IntSummaryStatistics;

/**
 * Prints the tree in pre-order way.
 */
public class PreOrderTreePrinter implements TreePrinter {

    @Override
    public <T extends ConditionalEquality<T>> void print(CompleteBinaryTree<T> tree) {

    }
}

class A {
    void print(Number a) {
        smth();
    }

    private void smth() {

    }
}

class B extends A {
    @Override
    void print(Object a) {

    }
}

class C extends A {
    @Override
    void print(Integer a) {

    }
}

class Z extends A {
    @Override
    void print(Number a) {

    }
}