/**
 * Created by asus on 6/15/2020.
 */
public class Person {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (!getFirstName().equals(person.getFirstName())) return false;
        return getLastName().equals(person.getLastName());

    }

    @Override
    public int hashCode() {
        int result = getFirstName().hashCode();
        result = 31 * result + getLastName().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
