import java.util.Objects;

public class EmployeeNode {

    private Employee employee;
    private EmployeeNode next;
    private EmployeeNode previous;

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof EmployeeNode)) {
            return false;
        }
        EmployeeNode employeeNode = (EmployeeNode) o;
        return Objects.equals(employee, employeeNode.employee) && Objects.equals(next, employeeNode.next)
                && Objects.equals(previous, employeeNode.previous);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employee, next, previous);
    }

    public EmployeeNode(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    public EmployeeNode getPrevious() {
        return previous;
    }

    public void setPrevious(EmployeeNode previous) {
        this.previous = previous;
    }

    public String toString() {
        return employee.toString();
    }

}
