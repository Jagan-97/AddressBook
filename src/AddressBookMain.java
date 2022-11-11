import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class AddressBookMain {
    private static Scanner sc = new Scanner(System.in);
    public static Map<String,ArrayList<ContactPerson>> newAddressBook = new HashMap<String,ArrayList<ContactPerson>>();
    //public static ArrayList<Person> contact = new ArrayList<Person>();
    public static ArrayList<ContactPerson> addressBook = new ArrayList<ContactPerson>();
    public static void main(String args[]) {
        System.out.println("Welcome to Address Book");
        boolean isExit = false;
        //AddressBookMain addressBook = new AddressBookMain();
        while (!isExit) {
            System.out.println("1.Add Address Book \n 2.Exit");
            System.out.print("Enter Option:");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Enter Name Of Address Book");
                    String addBookName=sc.nextLine();
                    if(newAddressBook.containsKey(addBookName)){
                        System.out.println("AddressBook Already Exist");
                    }else{
                        newAddressBook.put(addBookName,addressBook);
                        addAddressBook();
                        for (Map.Entry<String,ArrayList<ContactPerson>>Entry:newAddressBook.entrySet()){
                            System.out.println("AddressBook Name: "+Entry.getKey()+" and the "+"Contact Details :: "+ Entry.getValue());
                        }
                        break;
                    }
                case 2:
                    isExit = true;
                    System.out.println("Exit");
                default:
                    System.out.println("Please Enter Valid Input");
            }

        }
    }

    public static void addPerson() {
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
        ContactPerson person = new ContactPerson(firstName, lastName, street, city, state, mobileNumber);
        addressBook.add(person);

    }

    public static void editContact() {
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
    public static void deleteContact() {
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
    public static void showAddressBook() {
        for(int i = 0; i < addressBook.size(); i++) {
            System.out.println(addressBook.get(i));
        }
    }
    public static void addAddressBook(){
        boolean isFlag=true;
        while(isFlag){
            System.out.println("New Address Book Menu");
            System.out.println("1.Add Contact Person \n" +
                    " 2.Edit Contact Details \n" +
                    " 3.Delete Contact \n " +
                    "4.Exit");
            System.out.print("Please Enter Option:");
            int option = Integer.parseInt(sc.nextLine());
            switch (option){
                case 1:
                    addPerson();
                    showAddressBook();
                    break;
                case 2:
                    editContact();
                    showAddressBook();
                    break;
                case 3:
                    deleteContact();
                    showAddressBook();
                    break;
                case 4:
                    isFlag=false;
                    System.out.println("Exit");
                default:
                    System.out.println("Please enter valid option");
            }
        }
    }
}