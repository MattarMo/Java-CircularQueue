public class Queue<T> {

    private T q[];
    private int head , tail, size;

    public Queue(int size) {
        this.size = size;
        this.q = (T[]) new Object[size];
        head = tail = -1;
    }

    public boolean isFull() {
        return (tail + 1) % size == head;
    }

    public boolean isEmpty() {
        return (head == -1 && tail == -1);
    }

    public void insert(T datum) throws IllegalStateException {
    /*
        if(isFull()) {
            throw new IllegalStateException("Queue is Full");
        }
        */

        if (isEmpty()) {
            head = tail = 0;
        }
        else {
            tail = (tail + 1) % size;
        }
        q[tail] = datum;
    }

    public void delete() {
        /*
        if(isEmpty()){
            throw new IllegalStateException("Queue is Empty");
        }
        */

        if(head == tail) {
            head = tail = -1;
            return;
        }
        else {
            head = (head + 1) % size;
        }
    }

    public void print() {
        if(isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        int i = head;
        while(i != tail) {
            i = (i + 1) % size;
            System.out.print(q[i] + " ");
        }
        System.out.println(q[tail]);
    }
}