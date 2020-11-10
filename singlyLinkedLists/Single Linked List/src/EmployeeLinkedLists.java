import javax.print.attribute.standard.MediaSize.Other;

public class EmployeeLinkedLists {

    private EmployeeNode head;

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
    }

    public void removeFromFront() {
        EmployeeNode removeNode = head;
        if (removeNode == null) {
            System.out.println("List is empty");
        } else {
            head = removeNode.getNext();
            removeNode.setNext(null);
        }

    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.print("null");
    }

}
