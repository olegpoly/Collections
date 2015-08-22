package tree.completeBinaryTree;

import tree.ConditionalEquality;
import tree.Tree;

import java.util.*;

/**
 * Simple implementation of a complete binary tree.
 * Backed by a node structure.
 * Not sorted.
 * Not thread-safe.
 * Doesn't allow nulls.
 * Fail-fast.
 * TODO: make copies of elements?
 */
public class CompleteBinaryTree<T extends ConditionalEquality<T>> implements Tree<T> {
    class Node {
        T value;
        Node first;
        Node second;
    }

    private Node root;

    public void add(T element) {
        Objects.requireNonNull(element, "tree can't have null as a value");

        if(root == null) {
            root = new Node();
            root.value = element;
        } else {
            Node currentNode = root;

            Node incompleteNode = getLastNode();
            if (incompleteNode.first == null) {
                incompleteNode.first = currentNode;
            } else {
                incompleteNode.second = currentNode;
            }
        }
    }

    /**
     * @return the last node
     */
    private Node getLastNode() {
        List<Node> currentLevel = new ArrayList<>();
        List<Node> nextLevel = new ArrayList<>();

        currentLevel.add(root);

        while (true) {
            for (Node node : currentLevel) {
                if (node.first == null || node.second == null) {
                    return node;
                }

                nextLevel.add(node.first);
                nextLevel.add(node.second);
            }

            currentLevel = nextLevel;
            nextLevel = new ArrayList<>();
        }
    }

    public void remove(T element) {

    }

    public void print(TreePrinter treePrinter) {
        treePrinter.print(this);
    }

    private Node getRoot() {
        return root;
    }

    private void setRoot(Node root) {
        this.root = root;
    }
}
