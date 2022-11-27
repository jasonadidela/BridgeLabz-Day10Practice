import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    static ArrayList<Person> list = new ArrayList<>();

    public static void addContact() {

        Scanner s = new Scanner(System.in);
        Person person = new Person();

        System.out.println("Enter the First name:");
        String firstName = s.next();
        person.setFirstName(firstName);
        list.add(person);

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

    }

    public static void editContact() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your First name:");
        String firstName = s.next();

        for (Person person : list) {
            if (firstName.equals(person.getFirstName())) {
                System.out.println("Choose field you want to add:");
                System.out
                        .println("1.Last Name\t2.City\t3.State\t4.Zip\t5.Phone Number\t6.Email ");
                switch (s.nextInt()) {
                    case 1 -> {
                        System.out.println("Re-Correct your lastname");
                        person.setLastName(s.next());
                    }
                    case 2 -> {
                        System.out.println("Re-Correct your City");
                        person.setCity(s.next());
                    }
                    case 3 -> {
                        System.out.println("Re-Correct your State");
                        person.setState(s.next());
                    }
                    case 4 -> {
                        System.out.println("Re-Correct your Zip");
                        person.setZipCode(s.next());
                    }
                    case 5 -> {
                        System.out.println("Re-Correct your Phone Number");
                        person.setPhoneNumber(s.next());
                    }
                    case 6 -> {
                        System.out.println("Re-Correct your Email");
                        person.setEmail(s.next());
                    }
                }

            }
        }

    }

    public static void removeContact() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your First name:");
        String firstName = s.next();

        list.removeIf(person -> firstName.equals(person.getFirstName()));
    }

    public static void printContact() {
        for (Person person : list) {
            System.out.println("**********************************************"+
                    "\nFirst Name:\s"+ person.getFirstName()+
                    "\nLast Name:\s"+person.getLastName()+
                    "\nAddress:\s"+person.getAddress()+
                    "\nCity:\s"+person.getCity()+
                    "\nState:\s"+person.getState()+
                    "\nZip Code:\s"+person.getZipCode()+
                    "\nPhone No:\s"+person.getPhoneNumber()+
                    "\nEmail:\s"+person.getEmail()+
                    "\n**********************************************");
        }
    }
}