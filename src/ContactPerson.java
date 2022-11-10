public class ContactPerson {
    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private long mobileNumber;

    public void ContactPerson() {
    }

    public void ContactPerson(String firstName, String lastName, String street, String city, String state, long mobileNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.mobileNumber = mobileNumber;
    }
}