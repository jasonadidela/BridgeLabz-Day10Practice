import java.util.ArrayList;
import java.util.Scanner;
public class AddressBook {
    Scanner s = new Scanner(System.in);
    ArrayList<Person> list = new ArrayList<Person>();
    public void add() {
        Person person = new Person();
        System.out.println("Enter the First name:");
        String firstName = s.next();
        person.setFirstName(firstName);

        System.out.println("Enter the Last name:");
        String lastName = s.next();
        person.setLastName(lastName);

        System.out.println("Enter the Address:");
        String address = s.next();
        person.setAddress(address);

        System.out.println("Enter the City:");
        String city = s.next();
        person.setCity(city);

        System.out.println("Enter the State:");
        String state = s.next();
        person.setState(state);

        System.out.println("Enter the Zip:");
        String zipCode = s.next();
        person.setZipCode(zipCode);

        System.out.println("Enter the Phone Number:");
        String phoneNumber = s.next();
        person.setPhoneNumber(phoneNumber);

        System.out.println("Enter the Email:");
        String email = s.next();
        person.setEmail(email);

        list.add(person);

    }
}
