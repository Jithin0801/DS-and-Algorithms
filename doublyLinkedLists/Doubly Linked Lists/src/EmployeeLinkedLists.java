

public class EmployeeLinkedLists {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;
    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
            
        if (head == null) {
            tail = node;
        } else {
            head.setPrevious(node);
        }
        head = node;
        size++;

    }

    public void removeFromFront() {
        EmployeeNode removeNode = head;
        if (removeNode == null) {
            System.out.println("List is empty");
        } else {
            head = removeNode.getNext();
            if (head == null) {
                System.out.println("List is empty");
                size--;
            } else {
                head.setPrevious(null);
                removeNode.setNext(null);
                size--;
            }

        }

    }

    public void addtoTail(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        if (tail == null) {
            head = node;
            node.setNext(tail);
        } else {
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail = node;
        size++;
    }

    public void removeFromTail() {

    }

    public int size() {
        System.out.println();
        System.out.print("The size of the linked list is: ");
        return size;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print("[" + current.getPrevious() + " " + current + " " + current.getNext() + "]");
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.print("null");
    }

}
