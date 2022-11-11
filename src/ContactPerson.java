public class ContactPerson {
    String firstName;
    String lastName;
    String street;
    String city;
    String state;
    long mobileNumber;

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

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

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