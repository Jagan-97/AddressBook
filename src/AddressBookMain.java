import java.util.*;
import java.util.stream.Collectors;

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
                        System.out.println("This name already exists");
                    }else{
                        newAddressBook.put(addBookName,addressBook);
                        addAddressBook();
                        for (Map.Entry<String,ArrayList<ContactPerson>>Entry:newAddressBook.entrySet()){
                            System.out.println("AddressBook Name: "+Entry.getKey()+" and the "+"Contact Details :: \n"+Entry.getValue());
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
        for (ContactPerson person : addressBook) {
            if (person.firstName.equals(first_name)) {
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
    public static void checkDuplicate(){
        Set<String> ContactSet=new HashSet<>();
        Set<ContactPerson>newSet=addressBook.stream().filter(n -> !ContactSet.add(n.getFirstName())).collect(Collectors.toSet());
        for (ContactPerson addressBook:newSet){
            System.out.println(" Displaying Duplicate contact: "+addressBook.getFirstName()+ " "+ addressBook.getLastName());
        }
    }
    public static void searchByCityOrState() {
        System.out.println("Enter the AddressBookName");
        String bookName = sc.nextLine();
        ArrayList<ContactPerson> book = newAddressBook.get(bookName);
        AddressBookMain addressBookSystem = new AddressBookMain();
        if (book == null) {
            System.out.println("No book found with these name");
        } else {
            addressBookSystem.searchContactDetails();
        }
    }

    public void searchContactDetails() {
        System.out.println("Enter the city or state to search Contact");
        String input = sc.nextLine();
        for (ContactPerson person : addressBook) {
            if (person.getCity().equals(input) || person.getState().equals(input)) {
                System.out.println("Matches with city and state name contact is :" + person);
            }
        }
    }

    public static void countCity() {
        System.out.println("Enter a city name ");
        String input = sc.nextLine();
        long count = addressBook.stream().filter(city -> city.getCity().equals(input)).count();
        System.out.println("No of contacts Matched " + input + " city is : " + count);
    }

    public static void sortByPersonName() {
        if (addressBook.isEmpty()) {
            System.out.println("Contact book is empty");
        } else {
            addressBook.stream().sorted(Comparator.comparing(ContactPerson::getFirstName)).forEach(System.out::println);
        }
    }

    public static void sortingByState() {
        if (addressBook.isEmpty()) {
            System.out.println("Contact book is empty");
        } else {
            addressBook.stream().sorted(Comparator.comparing(ContactPerson::getState)).forEach(System.out::println);
        }
    }
    public static void addAddressBook(){
        boolean isExit = true;
        while(isExit){
            System.out.println("Address Book Menu");
            System.out.println("1.Add Contact Details \n" +
                    "2.Edit Contact Details \n" +
                    "3.Delete Contact Details \n " +
                    "4.Show Contact Details \n " +
                    "5.Duplicate Contact Details \n " +
                    "6.Search Contact Details \n" +
                    "7.Count by City \n" +
                    "8.Sort by Person Name Alphabatically" +
                    "9.Sort by State Alphabatically" +
                    "10.Exit");
            System.out.print("Please Enter Option:");
            int option = Integer.parseInt(sc.nextLine());
            switch (option){
                case 1:
                    addPerson();
                    break;
                case 2:
                    editContact();
                    break;
                case 3:
                    deleteContact();
                    break;
                case 4:
                    showAddressBook();
                    break;
                case 5:
                    checkDuplicate();
                    break;
                case 6:
                    searchByCityOrState();
                    break;
                case 7:
                    countCity();
                    break;
                case 8:
                    sortByPersonName();
                    break;
                case 9:
                    sortingByState();
                    break;
                case 10:
                    isExit = false;
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Please enter valid option");
            }
        }
    }
}