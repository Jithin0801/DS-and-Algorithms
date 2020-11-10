public class App {
    public static void main(String[] args) throws Exception {

        Employee jithinJoseph = new Employee("Jithin", "Joseph", 1);
        Employee sachinSasidharan = new Employee("Sachin", "Sasidharan", 3);
        Employee abhijithAbi = new Employee("Abhijith", "Abi", 4);

        EmployeeLinkedLists list = new EmployeeLinkedLists();

        // list.addToFront(jithinJoseph);
        // list.addToFront(vigneswarJai);
        // list.addToFront(sachinSasidharan);

        list.printList();
        System.out.println(list.size());

        list.addtoTail(abhijithAbi);

        list.printList();
        System.out.println(list.size());

        // list.removeFromFront();

        // list.printList();
        // System.out.println(list.size());

        list.addToFront(sachinSasidharan);
        list.addtoTail(jithinJoseph);

        list.printList();
        System.out.println(list.size());

    }
}
