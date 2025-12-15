package dsaPractice;

public class Queue {
    private int[] array;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public Queue(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("ERROR: Queue is full! Cannot enqueue " + item);
            return;
        }

        rear = (rear + 1) % capacity;
        array[rear] = item;
        size++;
        System.out.println("Enqueued: " + item);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("ERROR: Queue is empty! Cannot dequeue.");
            return -1;
        }

        int item = array[front];


        front = (front + 1) % capacity;
        size--;
        return item;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return array[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }


    public static void main(String[] args) {
        Queue q = new Queue(3);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        System.out.println("\nDequeued element: " + q.dequeue());
        System.out.println("Front element is: " + q.peek());

        q.enqueue(50);

        System.out.println("\nDequeued element: " + q.dequeue());
        System.out.println("Dequeued element: " + q.dequeue());
        System.out.println("Dequeued element: " + q.dequeue());
        q.dequeue();
    }
}
