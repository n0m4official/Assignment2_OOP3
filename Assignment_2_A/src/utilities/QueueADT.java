package utilities;

import java.util.NoSuchElementException;

/**
 * A generic stack interface that defines the behavior of a Last-In-First-Out (LIFO) data structure.
 * <p>
 * Implementations of this interface must adhere to the following guidelines:
 * <ul>
 *   <li>{@link #push(Object)} throws {@link NullPointerException} if a null element is pushed.</li>
 *   <li>{@link #pop()} and {@link #peek()} throw {@link NoSuchElementException} if the stack is empty.</li>
 * </ul>
 * </p>
 *
 * @param <T> the type of elements stored in this stack.
 */
public interface StackADT<T> {

    /**
     * Pushes an element onto the top of this stack.
     *
     * @param element the element to push onto the stack; must not be null.
     * @throws NullPointerException if the element is null.
     */
    void push(T element);

    /**
     * Removes and returns the element at the top of this stack.
     *
     * @return the element at the top of the stack.
     * @throws NoSuchElementException if this stack is empty.
     */
    T pop();

    /**
     * Retrieves, but does not remove, the element at the top of this stack.
     *
     * @return the element at the top of the stack.
     * @throws NoSuchElementException if this stack is empty.
     */
    T peek();

    /**
     * Checks whether this stack is empty.
     *
     * @return {@code true} if this stack contains no elements; {@code false} otherwise.
     */
    boolean isEmpty();

    /**
     * Returns the number of elements in this stack.
     *
     * @return the number of elements currently in the stack.
     */
    int size();

    /**
     * Removes all elements from this stack, leaving it empty.
     */
    void clear();
}
