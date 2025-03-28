package utilities;

/**
 * A generic queue interface that defines how a queue should work.
 * A queue follows the "First In, First Out" (FIFO) principle.
 *
 * @param <T> The type of elements stored in the queue.
 */
public interface QueueADT<T> {

    /**
     * Adds an item to the end of the queue.
     *
     * @param element The item to add.
     * @throws NullPointerException If the element is null.
     */
    public void enqueue(T element);

    /**
     * Removes and returns the item from the front of the queue.
     *
     * @return The item that was removed.
     * @throws java.util.NoSuchElementException If the queue is empty.
     */
    public T dequeue();

    /**
     * Peeks at the front item without removing it.
     *
     * @return The item at the front of the queue.
     * @throws java.util.NoSuchElementException If the queue is empty.
     */
    public T first();

    /**
     * Checks if the queue is empty.
     *
     * @return true if the queue has no items, false otherwise.
     */
    public boolean isEmpty();

    /**
     * Gets the number of items in the queue.
     *
     * @return The count of items in the queue.
     */
    public int size();

    /**
     * Clears all items from the queue, making it empty.
     */
    public void clear();
}
