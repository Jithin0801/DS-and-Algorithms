public class App {
    public static void main(String[] args) throws Exception {
        Employee jithinJoseph = new Employee("Jithin", "Joseph", 1);
        Employee sachinSasidharan = new Employee("Sachin", "Sasidharan", 1);
        Employee sanu = new Employee("Sanu", "Sanu", 1);
        Employee arjunGirish = new Employee("Arjun", "Girish", 1);
        Employee abhijithiAbi = new Employee("Abhijith", "Abi", 1);
        Employee vigneswarJai = new Employee("Vigneswar", "Jai", 1);

        ArraySatck myStack = new ArraySatck(10);

        myStack.push(jithinJoseph);
        myStack.push(sachinSasidharan);
        myStack.push(sanu);
        myStack.push(arjunGirish);
        myStack.push(abhijithiAbi);
        myStack.push(vigneswarJai);
        myStack.push(jithinJoseph);
        myStack.push(arjunGirish);
        myStack.push(sachinSasidharan);
        myStack.push(sanu);
        myStack.push(arjunGirish);
        myStack.push(abhijithiAbi);

        myStack.printList();

        myStack.pop();

        System.out.println("\n\nAfter pop: ");
        myStack.printList();

    }
}
