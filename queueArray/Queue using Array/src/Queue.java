public class Queue {

    private Employee[] queue;
    private int front;
    private int back;

    Queue(int capacity) {
        queue = new Employee[capacity];
    }

    public void enqueue(Employee employee) {

        if (back == queue.length) {

            Employee newArray[] = new Employee[2 * queue.length];
            System.arraycopy(queue, 0, newArray, 0, queue.length);
            queue = newArray;
        }

        queue[back] = employee;
        back++;
    }

    public Employee dequeue() {

        if (size() == 0) {
            System.out.println("Queue Empty");
        }
        Employee employee = queue[front];
        queue[front] = null;
        front++;
        if (size() == 0) {
            front = 0;
            back = 0;
        }

        return employee;

    }

    public int size() {
        return back - front;
    }

    public void printQueue() {
        for (int i = front; i < back; i++) {
            System.out.println(queue[i]);
        }
    }

}
