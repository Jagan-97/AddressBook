public class ContactPerson {
    String firstName;
    String lastName;
    String street;
    String city;
    String state;
    long mobileNumber;

    public ContactPerson() {
    }

    public ContactPerson(String firstName, String lastName, String street, String city, String state, long mobileNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.mobileNumber = mobileNumber;
    }
    @Override
    public String toString() {
        return "Person{" +
                "FirstName='" + firstName + '\'' +
                ",LastName='" + lastName + '\'' +
                ",Street='" + street + '\'' +
                ",City='" + city + '\'' +
                ",State='" + state + '\'' +
                ",MobileNumber'" + mobileNumber + '\'' +
                '}';
    }
}