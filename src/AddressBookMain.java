import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {
    private static Scanner sc = new Scanner(System.in);
    ArrayList addressBook;
    AddressBookMain() {
        addressBook = new ArrayList<>();
    }
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
        long mobileNumber=Long.parseLong(sc.nextLine());
        //parameterized constructor calling of Contact person class
        ContactPerson person = new ContactPerson(firstName, lastName, street, city, state, mobileNumber);
        //Adding object element in arrayList
        addressBook.add(person);

    }
}