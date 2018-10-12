package synthesizer;

/** Interface of the BoundedQueue data structure */
public interface BoundedQueue<T> {
    // Interface methods are public by default hence no access modifier is necessary
    int capacity();     // return size of the buffer
    int fillCount();    // return the current elements in the buffer
    void enqueue(T item);     // adds an element at the end of the Queue
    T dequeue();        // removes and returns the element at the front of the Queue
    T peek();           // returns the first element in the Queue without removing it

    // The default keyword is used to implement the methods in the interface
    default boolean isEmpty() {
        return this.fillCount() == 0;
    }

    default boolean isFull() {
        return this.fillCount() == this.capacity();
    }
}
