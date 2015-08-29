package tree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Oleg on 8/22/2015.
 */
public class BreadthPrinter implements TreePrinter {
    @Override
    public <T> void print(CompleteBinaryTree<T> tree) {
        CompleteBinaryTree<T>.Node root = tree.getRoot();

        List<CompleteBinaryTree<T>.Node> currentLevel = new ArrayList<>();
        List<CompleteBinaryTree<T>.Node> nextLevel = new ArrayList<>();

        currentLevel.add(root);

        while (currentLevel.size() != 0) {
            for (CompleteBinaryTree<T>.Node node : currentLevel) {
                System.out.print(node.value + " ");

                if (node.first != null)
                    nextLevel.add(node.first);

                if (node.second != null)
                    nextLevel.add(node.second);
            }

            System.out.println();

            currentLevel = nextLevel;
            nextLevel = new ArrayList<>();

        }
    }
}