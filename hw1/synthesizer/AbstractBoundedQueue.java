package synthesizer;

/** Abstract  implementation of the BoundedQueue Interface */
public abstract class AbstractBoundedQueue<T> implements BoundedQueue<T> {
    protected int fillCount;
    protected int capacity;

    // Getters for the protected fields
    public int capacity() {
        return this.capacity;
    }
    public int fillCount() {
        return this.fillCount;
    }
}
