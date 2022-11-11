import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {
    private static Scanner sc = new Scanner(System.in);
    public static ArrayList<ContactPerson> addressBook = new ArrayList<ContactPerson>();
    public static void main(String args[]) {
        System.out.println("Welcome to Address Book");
        boolean isExit = false;
        AddressBookMain addressBook = new AddressBookMain();
        while (!isExit) {
            System.out.println("Enter Option" +
                    "\n1. Add Person" +
                    "\n2. Edit Person" +
                    "\n3. Delete Person" +
                    "\n4. Show Address Book" +
                    "\n5. Exit");
            int option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1:
                    addressBook.addPerson();
                    break;
                case 2:
                    addressBook.editContact();
                    break;
                case 3:
                    addressBook.deleteContact();
                    break;

            }

        }
    }

    private void addPerson() {
        System.out.println("Enter First name");
        String firstName = sc.nextLine();
        System.out.println("Enter Last Name");
        String lastName = sc.nextLine();
        System.out.println("Enter Street");
        String street = sc.nextLine();
        System.out.println("Enter City");
        String city = sc.nextLine();
        System.out.println("Enter State");
        String state = sc.nextLine();
        System.out.println("Enter Phone Number");
        long mobileNumber = Long.parseLong(sc.nextLine());
        //parameterized constructor calling of Contact person class
        ContactPerson person = new ContactPerson(firstName, lastName, street, city, state, mobileNumber);
        //Adding object element in arrayList
        addressBook.add(person);

    }

    private void editContact() {
        //Person person = new Person();
        System.out.println("Enter First Name of the contact to be edited");
        String enteredName = sc.nextLine();
        for (ContactPerson person : addressBook) {
            if (person.firstName.equals(enteredName)) {

                System.out.println("Enter Street");
                String street = sc.nextLine();
                person.street = street;
                System.out.println("Enter City");
                String city = sc.nextLine();
                person.city = city;
                System.out.println("Enter State");
                String state = sc.nextLine();
                person.state = state;
            }
            else  {
                System.out.println(enteredName + " Contact not found");
            }
        }
    }
    private void deleteContact() {
        System.out.println("Enter Name of Contact to be deleted:");
        String first_name = sc.nextLine();
        //boolean flag = false;
        for (ContactPerson person : addressBook) {
            if (person.firstName.equals(first_name)) {
                // flag = true;
                addressBook.remove(person);
            }
            else {
                System.out.println("Contact not found");
            }
        }

    }
}