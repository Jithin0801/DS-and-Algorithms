public class Queue {

    private Employee[] queue;
    private int front;
    private int back;

    Queue(int capacity) {
        queue = new Employee[capacity];
    }

    public void enqueue(Employee employee) {

        // 0 - abi
        // 1 - sachin - front , back
        // 2 - jithin
        // 3 - sanu
        // 4 - arjun
        if (size() == queue.length - 1) {

            int numSize = size();
            Employee newArray[] = new Employee[2 * queue.length];
            // 0 - sachin - front
            // 1 - jithin
            // 2 - sanu
            // 3 - arjun
            // 4 - abi -
            // 5
            // 6
            // 7
            // 8
            // 9

            System.arraycopy(queue, front, newArray, 0, queue.length - front);
            System.arraycopy(queue, 0, newArray, queue.length - front, back);
            queue = newArray;

            front = 0;
            back = numSize;

        }

        queue[back] = employee;
        // 0 - null - back
        // 1 - sachin - front
        // 2 - jithin
        // 3 - sanu
        // 4 - arjun
        if (back < queue.length - 1) {
            back++;
        } else {
            back = 0;
        }

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
        } else if (front == queue.length) {
            front = 0;
        }

        return employee;

    }

    public int size() {
        if (front >= back) {
            return back - front + queue.length;
        } else {
            return back - front;
        }

    }

    public void printQueue() {
        if (front >= back) {
            for (int i = front; i < queue.length; i++) {
                System.out.println(queue[i]);
            }
            for (int i = 0; i < back; i++) {
                System.out.println(queue[i]);
            }

        } else {
            for (int i = front; i < back; i++) {
                System.out.println(queue[i]);
            }
        }

    }

}
