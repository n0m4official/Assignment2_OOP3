package utilities;

/**
 * A generic stack interface that defines how a stack should work.
 * A stack follows the "Last In, First Out" (LIFO) principle.
 *
 * @param <T> The type of elements stored in the stack.
 */
public interface StackADT<T> {

    /**
     * Adds an item to the top of the stack.
     *
     * @param element The item to add.
     * @throws NullPointerException If the element is null.
     */
    public void push(T element);

    /**
     * Removes and returns the item from the top of the stack.
     *
     * @return The item that was removed.
     * @throws java.util.NoSuchElementException If the stack is empty.
     */
    public T pop();

    /**
     * Peeks at the top item without removing it.
     *
     * @return The item at the top of the stack.
     * @throws java.util.NoSuchElementException If the stack is empty.
     */
    public T peek();

    /**
     * Checks if the stack is empty.
     *
     * @return true if the stack has no items, false otherwise.
     */
    public boolean isEmpty();

    /**
     * Gets the number of items in the stack.
     *
     * @return The count of items in the stack.
     */
    public int size();

    /**
     * Clears all items from the stack, making it empty.
     */
    public void clear();
}
