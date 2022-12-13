import java.util.*;

public class AddressBook {

    static Scanner s = new Scanner(System.in);
    static ArrayList<Person> contact =new ArrayList<>();
    static HashMap<String, ArrayList<Person>> map = new HashMap<>();
    static Person person = new Person();


    public static void addContact() {
        contact.add(person);
        map.put("addressBook",contact);
        System.out.println("Enter details : ");
        System.out.println("Enter the First name:");
        String firstName = s.next();
        person.setFirstName(firstName);
        System.out.println("Enter the Last name:");
        String lastName = s.next();
        person.setLastName(lastName);
        System.out.println("Enter the Address:");
        String Address = s.next();
        person.setAddress(Address);
        System.out.println("Enter the City:");
        String city = s.next();
        person.setCity(city);
        System.out.println("Enter the State:");
        String state = s.next();
        person.setState(state);
        System.out.println("Enter the Zip:");
        String zip = s.next();
        person.setZipCode(zip);
        System.out.println("Enter the Phone Number:");
        String number = s.next();
        person.setPhoneNumber(number);
        System.out.println("Enter the Email:");
        String email = s.next();
        person.setEmail(email);

    }
    public static void printContact() {
        for (Person person : contact) {
            System.out.println(person);
        }
    }

    public static void editContact(){
        System.out.println("Enter your First name:");
        String firstName;
        firstName = s.next();
        if (firstName.equals(person.getFirstName())){
            System.out.println("Choose field you want to add:");
            System.out.println("[L/l]Last Name\s[C/c]City\s[S/s]State\s[Z/z]Zip\s[P/p]Phone Number\s[E/e]Email ");
            char value = s.next().charAt(0);
            if (value == 'L' || value == 'l' || value == 'c' || value == 'C' || value == 's' || value == 'S' ||
                    value == 'z' || value == 'Z' || value == 'p' || value == 'P' || value == 'e' || value == 'E') {
                switch (value) {
                    case 'L', 'l' -> {
                        System.out.println("Re-Correct your lastname");
                        String lastName = s.next();
                        person.setLastName(lastName);
                    }
                    case 'c', 'C' -> {
                        System.out.println("Re-Correct your City");
                        String city = s.next();
                        person.setCity(city);
                    }
                    case 's', 'S' -> {
                        System.out.println("Re-Correct your State");
                        String state = s.next();
                        person.setState(state);
                    }
                    case 'z', 'Z' -> {
                        System.out.println("Re-Correct your Zip");
                        String zip = s.next();
                        person.setZipCode(zip);
                    }
                    case 'p', 'P' -> {
                        System.out.println("Re-Correct your Phone Number");
                        String phone = s.next();
                        person.setPhoneNumber(phone);
                    }
                    case 'e', 'E' -> {
                        System.out.println("Re-Correct your Email");
                        String email = s.next();
                        person.setEmail(email);
                    }
                }
            }
        }
    }

    public static void removeContact() {
        System.out.println("Enter name to delete : ");
        String name = s.next();
        for (Person person : contact) {
            if (person.getFirstName().equals(name)) {
                contact.remove(person);
                System.out.println("Contact deleted successfully !!!");
            }
        }
    }

}