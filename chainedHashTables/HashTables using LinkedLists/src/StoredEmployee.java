import java.util.Objects;

public class StoredEmployee {

    private Employee employee;
    private String key;

    public StoredEmployee(Employee employee, String key) {
        this.employee = employee;
        this.key = key;
    }

    public Employee getEmployee() {
        return this.employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public StoredEmployee employee(Employee employee) {
        this.employee = employee;
        return this;
    }

    public StoredEmployee key(String key) {
        this.key = key;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof StoredEmployee)) {
            return false;
        }
        StoredEmployee storedEmployee = (StoredEmployee) o;
        return Objects.equals(employee, storedEmployee.employee) && Objects.equals(key, storedEmployee.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employee, key);
    }

    @Override
    public String toString() {
        return "{" + " employee='" + getEmployee() + "'" + ", key='" + getKey() + "'" + "}";
    }

}
