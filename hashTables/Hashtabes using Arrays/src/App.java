public class App {
    public static void main(String[] args) throws Exception {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        HashTable hashTable = new HashTable();

        hashTable.put("jones", janeJones);
        hashTable.put("doe", johnDoe);
        hashTable.put("smith", marySmith);
        hashTable.put("wilson", mikeWilson);
        hashTable.put("end", billEnd);
        hashTable.put("roses", new Employee("Jenny", "Roses", 98));
        hashTable.put("abi", new Employee("Abhijith", "Abi", 9));

        hashTable.printTable();

        System.out.println("\n\nThe value of key jones is: " + hashTable.get("jones"));
        System.out.println("The value of key smith is: " + hashTable.get("smith"));

        System.out.println("\n\nThe removed element is: " + hashTable.remove("smith") + "\n\n");

        hashTable.printTable();
        System.out.println("\nThe value of key smith is: " + hashTable.get("smith"));
        System.out.println("The value of key jones is: " + hashTable.get("jones"));

    }
}
