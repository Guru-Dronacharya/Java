class Queue {
    int[] queue;
    int front, rear, capacity;

    public Queue(int size) {
        queue = new int[size];
        capacity = size;
        front = rear = 0;
    }

    public void enqueue(int x) {
        if (rear == capacity) {
            System.out.println("Queue Overflow");
        } else {
            queue[rear++] = x;
        }
    }

    public int dequeue() {
        if (front == rear) {
            System.out.println("Queue Underflow");
            return -1;
        }
        return queue[front++];
    }
}

public class QueueDemo {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        System.out.println("Dequeued element: " + queue.dequeue());
    }
}
