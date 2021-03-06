public class App {
    public static void main(String[] args) throws Exception {

        Employee jithinJoseph = new Employee("Jithin", "Joseph", 1);
        Employee abhijithAbi = new Employee("Abhijith", "Abi", 1);
        Employee sachinSasidharan = new Employee("Sachin", "Sasidharan", 1);
        Employee Sanu = new Employee("Sanu", "CS", 1);
        Employee arjunGirish = new Employee("Arjun", "Girish", 1);

        Queue queue = new Queue(10);

        queue.enqueue(jithinJoseph);
        queue.enqueue(abhijithAbi);
        queue.enqueue(sachinSasidharan);
        queue.enqueue(Sanu);
        queue.enqueue(arjunGirish);

        queue.printQueue();

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        System.out.println("\n\nAfter dequeue: ");

        queue.dequeue();

        queue.printQueue();

    }
}
