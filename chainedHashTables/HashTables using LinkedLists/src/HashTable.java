import java.util.LinkedList;
import java.util.ListIterator;

public class HashTable {

    private LinkedList<StoredEmployee>[] hashTable;

    public HashTable() {
        hashTable = new LinkedList[10];
        for (int i = 0; i < hashTable.length; i++) {
            hashTable[i] = new LinkedList<>();
        }
    }

    private int hashFunction(String key) {
        return key.length() % hashTable.length;
    }

    public void add(Employee employee, String key) {
        int hashedKey = hashFunction(key);
        hashTable[hashedKey].add(new StoredEmployee(employee, key));
    }

    public Employee get(String key) {
        int hashedKey = hashFunction(key);
        ListIterator<StoredEmployee> iterator = hashTable[hashedKey].listIterator();
        StoredEmployee storedEmployee = null;
        while (iterator.hasNext()) {
            storedEmployee = iterator.next();
            if (storedEmployee.getKey().equals(key)) {
                return storedEmployee.getEmployee();
            }
        }
        return null;
    }

    public Employee remove(String key) {
        int hashedKey = hashFunction(key);
        ListIterator<StoredEmployee> iterator = hashTable[hashedKey].listIterator();
        StoredEmployee storedEmployee = null;
        int index = 0;
        while (iterator.hasNext()) {
            storedEmployee = iterator.next();
            index++;
            if (storedEmployee.getKey().equals(key)) {
                break;
            }
        }
        if (storedEmployee == null || !storedEmployee.getKey().equals(key)) {
            return null;
        } else {
            hashTable[hashedKey].remove(index);
            return storedEmployee.getEmployee();
        }
    }

    public void print() {
        for (int i = 0; i < hashTable.length; i++) {
            if (hashTable[i].isEmpty()) {
                System.out.println("Position " + i + ": Empty");
            } else {
                ListIterator<StoredEmployee> iterator = hashTable[i].listIterator();
                while (iterator.hasNext()) {
                    System.out.println("Position " + i + ": " + hashTable[i]);
                    System.out.println("-->");
                }
                System.out.println("null");
            }
        }
    }

}
