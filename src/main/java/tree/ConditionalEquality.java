package tree;

/**
 * The purpose of this interface is to test conditional equality applied to collections.
 */
public interface ConditionalEquality<T> {

    /**
     * Test two options for equality
     */
    boolean areEqual(T left, T right);
}
