import java.util.Objects;

public class Employee {

    private String firstName;
    private String lastName;
    private int ID;

    public Employee() {
    }

    public Employee(String firstName, String lastName, int ID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Employee firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Employee lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Employee ID(int ID) {
        this.ID = ID;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Employee)) {
            return false;
        }
        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName)
                && ID == employee.ID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, ID);
    }

    @Override
    public String toString() {
        return "{" + " firstName='" + getFirstName() + "'" + ", lastName='" + getLastName() + "'" + ", ID='" + getID()
                + "'" + "}";
    }

}