public class App {
    public static void main(String[] args) throws Exception {

        Employee jithinJoseph = new Employee("Jithin", "Joseph", 1);
        Employee vigneswarJai = new Employee("Vigneswar", "Jai", 2);
        Employee sachinSasidharan = new Employee("Sachin", "Sasidharan", 3);

        EmployeeLinkedLists list = new EmployeeLinkedLists();

        list.addToFront(jithinJoseph);
        list.addToFront(vigneswarJai);
        list.addToFront(sachinSasidharan);

        list.printList();
    }
}
