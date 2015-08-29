package tree;

/**
 * Created by Oleg on 8/22/2015.
 */
public class BinarySearchTree<T> implements Tree<T> {
    ConditionalEquality<T> conditionalEquality;

    class Node<T> {
        T node
    }

    public BinarySearchTree(ConditionalEquality<T> conditionalEquality) {
        setConditionalEquality(conditionalEquality);
    }

    @Override
    public void add(T element) {

    }

    @Override
    public void remove(T element) {

    }

    @Override
    public void print(TreePrinter treePrinter) {

    }

    public ConditionalEquality<T> getConditionalEquality() {
        return conditionalEquality;
    }

    public void setConditionalEquality(ConditionalEquality<T> conditionalEquality) {
        this.conditionalEquality = conditionalEquality;
    }
}
