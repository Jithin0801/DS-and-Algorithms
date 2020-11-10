public class HashTable {

    private StoredEmployee[] hashTable;
    private int count = 0;

    public HashTable() {
        hashTable = new StoredEmployee[10];
    }

    private int hashKey(String key) {
        int hashedKey = key.length() % hashTable.length;
        return hashedKey;
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        if (isOccupied(hashedKey)) {

            int stopIndex = hashedKey;
            if (hashedKey == hashTable.length - 1) {
                hashedKey = 0;
            } else {
                hashedKey++;
            }

            while (isOccupied(hashedKey) && hashedKey != stopIndex) {
                hashedKey = (hashedKey + 1) % hashTable.length;
            }
        }

        if (isOccupied(hashedKey)) {
            System.out.println("Sorry, there's already an employee at position " + hashedKey);
        } else {
            hashTable[hashedKey] = new StoredEmployee(employee, key);
        }

    }

    public Employee get(String key) {

        int hashedKey = findKey(key);
        if (hashedKey == -1) {
            return null;
        }
        return hashTable[hashedKey].getEmployee();

    }

    public Employee remove(String key) {

        int hashedKey = findKey(key);
        if (hashedKey == -1) {
            return null;
        }
        Employee employee = hashTable[hashedKey].getEmployee();
        hashTable[hashedKey] = null;
        StoredEmployee[] oldHashTable = hashTable;
        hashTable = new StoredEmployee[oldHashTable.length];
        for (int i = 0; i < oldHashTable.length; i++) {
            if (oldHashTable[i] != null) {
                put(oldHashTable[i].getKey(), oldHashTable[i].getEmployee());
            }
        }
        return employee;

    }

    private int findKey(String key) {
        int hashedKey = hashKey(key);
        if (hashTable[hashedKey] != null && hashTable[hashedKey].getKey().equals(key)) {
            return hashedKey;
        }
        int index = hashedKey;
        if (hashedKey == hashTable.length - 1) {
            hashedKey = 0;
        } else {
            hashedKey++;
        }
        while (hashedKey != index && hashTable[hashedKey] != null && !hashTable[hashedKey].getKey().equals(key)) {
            hashedKey = (hashedKey + 1) % hashTable.length;
        }
        if (hashTable[hashedKey] != null && hashTable[hashedKey].getKey().equals(key)) {
            return hashedKey;
        } else {
            return -1;
        }

    }

    private boolean isOccupied(int index) {
        return hashTable[index] != null;
    }

    public void printTable() {
        for (int i = 0; i < hashTable.length; i++) {
            System.out.println(i + " " + hashTable[i]);
        }
    }

}
