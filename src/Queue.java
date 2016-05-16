/**
 * Interface for a queue: a collection of elements that are inserted and removed according to the first-in, first-out(FIFO)
 * principle
 */

/**
 * Name: Aleshinloye Damilola
 * StudNo: 3050957
 */

public interface Queue<E> {
    /**Returns the number of elements in the queue */    
    int size();
    /**Tests whether the queue is empty*/
    boolean isEmpty();
    /**Inserts an element at the rear of the queue*/
    void enqueue(E e);
    /**Returns, but does not remove, the first element of the queue(null if empty)*/
    E first();
    /**Removes and returns the first element of the queue(null if empty) */
    E dequeue();
    
}
