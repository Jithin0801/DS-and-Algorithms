import java.util.Objects;

public class Employee {

    String firstName;
    String seondName;
    int id;

    public Employee(String firstName, String seondName, int id) {
        this.firstName = firstName;
        this.seondName = seondName;
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSeondName() {
        return this.seondName;
    }

    public void setSeondName(String seondName) {
        this.seondName = seondName;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employee firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Employee seondName(String seondName) {
        this.seondName = seondName;
        return this;
    }

    public Employee id(int id) {
        this.id = id;
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
        return Objects.equals(firstName, employee.firstName) && Objects.equals(seondName, employee.seondName)
                && id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, seondName, id);
    }

    @Override
    public String toString() {
        return "{" + " firstName='" + getFirstName() + "'" + ", seondName='" + getSeondName() + "'" + ", id='" + getId()
                + "'" + "}";
    }

}