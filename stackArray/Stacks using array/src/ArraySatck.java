public class ArraySatck {

    private Employee[] stack;
    private int top;

    public ArraySatck(int capacity) {
        stack = new Employee[capacity];
    }

    public void push(Employee employee) {
        if (top == stack.length) {
            Employee[] newArray = new Employee[2 * stack.length];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;
        }

        stack[top++] = employee;
    }

    public Boolean isEmppty() {
        if (top == 0) {
            return true;
        } else {
            return false;
        }
    }

    public Employee pop() {
        if (isEmppty()) {
            System.out.println("Stack is empty");
        }
        Employee employee = stack[--top];
        stack[top] = null;
        return employee;
    }

    public Employee peek() {

        if (isEmppty()) {
            System.out.println("Stack is empty");
        }

        return stack[top - 1];

    }

    public int size() {
        return top;
    }

    public void printList() {

        for (int i = top - 1; i >= 0; i--) {
            System.out.println(stack[i]);
        }

    }

}
