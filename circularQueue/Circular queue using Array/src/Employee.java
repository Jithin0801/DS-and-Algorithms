import java.util.Objects;

public class Employee {

    private String firstName;
    private String secondName;
    private int ID;

    public Employee() {
    }

    public Employee(String firstName, String secondName, int ID) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.ID = ID;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return this.secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
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

    public Employee secondName(String secondName) {
        this.secondName = secondName;
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
        return Objects.equals(firstName, employee.firstName) && Objects.equals(secondName, employee.secondName)
                && ID == employee.ID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName, ID);
    }

    @Override
    public String toString() {
        return "{" + " firstName='" + getFirstName() + "'" + ", secondName='" + getSecondName() + "'" + ", ID='"
                + getID() + "'" + "}";
    }

}
