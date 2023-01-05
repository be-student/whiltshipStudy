package whiltshipstudy.week4.queue;

public class Queue {

    private int[] queue;
    private int front;
    private int rear;
    private int size;

    public Queue(int size) {
        queue = new int[size];
        front = -1;
        rear = -1;
        this.size = size;
    }

    public void enqueue(int value) {
        if (rear == size - 1) {
            throw new StackOverflowError();
        }
        queue[++rear] = value;
    }

    public int dequeue() {
        if (front == rear) {
            throw new IndexOutOfBoundsException("Queue is empty");
        }
        return queue[++front];
    }
}
