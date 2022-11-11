public class ContactPerson {
    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private long mobileNumber;

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