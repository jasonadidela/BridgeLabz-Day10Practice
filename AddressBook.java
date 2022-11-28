import java.util.ArrayList;
import java.util.Scanner;
public class AddressBook {

    static ArrayList<Person> list = new ArrayList<>();


    public static void addContact() {

        Scanner s = new Scanner(System.in);
        Person contact = new Person();
        list.add(contact);

        System.out.println("Enter the First name:");
        String firstName = s.next();
        contact.setFirstName(firstName);

        System.out.println("Enter the Last name:");
        String lastName = s.next();
        contact.setLastName(lastName);

        System.out.println("Enter the Address:");
        String address = s.next();
        contact.setAddress(address);

        System.out.println("Enter the City:");
        String city = s.next();
        contact.setCity(city);

        System.out.println("Enter the State:");
        String state = s.next();
        contact.setState(state);

        System.out.println("Enter the Zip:");
        String zipCode = s.next();
        contact.setZipCode(zipCode);

        System.out.println("Enter the Phone Number:");
        String phoneNumber = s.next();
        contact.setPhoneNumber(phoneNumber);

        System.out.println("Enter the Email:");
        String email = s.next();
        contact.setEmail(email);

    }

    public static void editContact() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your First name:");
        String firstName = s.next();

        for (Person person : list) {
            if (firstName.equals(person.getFirstName())) {
                int i = 1;
                do {
                    System.out.println("Choose field you want to add:");
                    System.out.println("[L/l]Last Name\s[C/c]City\s[S/s]State\s[Z/z]Zip\s[P/p]Phone Number\s[E/e]Email ");
                    char value = s.next().charAt(0);
                    if (value == 'L' || value == 'l' || value == 'c' || value == 'C' || value == 's' || value == 'S' ||
                            value == 'z' || value == 'Z' || value == 'p' || value == 'P' || value == 'e' || value == 'E') {
                        switch (value) {
                            case 'L', 'l' -> {
                                System.out.println("Re-Correct your lastname");
                                person.setLastName(s.next());
                            }
                            case 'c', 'C' -> {
                                System.out.println("Re-Correct your City");
                                person.setCity(s.next());
                            }
                            case 's', 'S' -> {
                                System.out.println("Re-Correct your State");
                                person.setState(s.next());
                            }
                            case 'z', 'Z' -> {
                                System.out.println("Re-Correct your Zip");
                                person.setZipCode(s.next());
                            }
                            case 'p', 'P' -> {
                                System.out.println("Re-Correct your Phone Number");
                                person.setPhoneNumber(s.next());
                            }
                            case 'e', 'E' -> {
                                System.out.println("Re-Correct your Email");
                                person.setEmail(s.next());
                            }
                        }
                    } else {
                        System.out.println("Error("+i+"): invalid input entered for the interstate question");
                        i++;
                    }
                }while (i<=3);{
                    System.out.println("Too many args Edite ended!");
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
            int i = 1;
            System.out.println("**********************************************"+
                    "\nContact:\s"+ list.get(i)+
                    "\nFirst Name:\s"+ person.getFirstName()+
                    "\nLast Name:\s"+person.getLastName()+
                    "\nAddress:\s"+person.getAddress()+
                    "\nCity:\s"+person.getCity()+
                    "\nState:\s"+person.getState()+
                    "\nZip Code:\s"+person.getZipCode()+
                    "\nPhone No:\s"+person.getPhoneNumber()+
                    "\nEmail:\s"+person.getEmail()+
                    "\n**********************************************"+
                    "\nTotal Number of Contacts:\s" +list.size()+
                    "\n**********************************************");
        }
    }
}