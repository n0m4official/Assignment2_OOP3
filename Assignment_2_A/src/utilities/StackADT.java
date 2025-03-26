package utilities;

import java.util.NoSuchElementException;

/**
 * A generic queue interface that defines the behavior of a First-In-First-Out (FIFO) data structure.
 * <p>
 * Implementations of this interface must adhere to the following rules:
 * <ul>
 *   <li>{@link #enqueue(Object)} throws {@link NullPointerException} if a null element is added.</li>
 *   <li>{@link #dequeue()} and {@link #first()} throw {@link NoSuchElementException} if the queue is empty.</li>
 * </ul>
 * </p>
 *
 * @param <T> the type of elements held in this queue.
 */
public interface QueueADT<T> {

    /**
     * Inserts the specified element into the end of this queue.
     *
     * @param element the element to add; must not be null.
     * @throws NullPointerException if the specified element is null.
     */
    void enqueue(T element);

    /**
     * Retrieves and removes the head of this queue.
     *
     * @return the head element of the queue.
     * @throws NoSuchElementException if this queue is empty.
     */
    T dequeue();

    /**
     * Retrieves, but does not remove, the head of this queue.
     *
     * @return the head element of the queue.
     * @throws NoSuchElementException if this queue is empty.
     */
    T first();

    /**
     * Returns {@code true} if this queue contains no elements.
     *
     * @return {@code true} if this queue is empty, {@code false} otherwise.
     */
    boolean isEmpty();

    /**
     * Returns the number of elements in this queue.
     *
     * @return the count of elements in the queue.
     */
    int size();

    /**
     * Removes all elements from this queue, leaving it empty.
     */
    void clear();
}
