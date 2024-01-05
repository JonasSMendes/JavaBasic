import java.util.Objects;

public class User {

    private String firstName;
    private String lastName;

    private static int Count = 0;
    public User(String FirstName, String LastName){
        this.firstName = FirstName;
        this.lastName = LastName;
    }

    public void setCount(int count) {
        this.Count = this.Count + count;
    }
    public int getCount() {
        return Count;
    }

    public void setFirstName(String firstName) {
        firstName = firstName;
    }

    public void setLastName(String lastName) {
        lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String Output(){
        return firstName.toUpperCase()+ " " + lastName.toUpperCase();
    }

    public String Output(boolean ShowLastName){
        if (ShowLastName){
            return Output();
        }
            return firstName.toUpperCase();
    }

    public String toString(){
        return "User : {" +
                "firstName: " + firstName.toUpperCase() + "," +
                "lastNames: " + lastName.toUpperCase() + ";";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
