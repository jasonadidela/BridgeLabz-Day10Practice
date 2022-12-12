import java.util.*;

public class AddressBook {
    static  HashMap<String, String> map = new HashMap<>();
    static Scanner s = new Scanner(System.in);
    static Person contact = new Person();
    public static void addContact() {
        System.out.println("Enter the First name:");
        map.put(contact.setFirstName(), s.nextLine());
        System.out.println("Enter the Last name:");
        map.put(contact.setLastName(),s.nextLine());
        System.out.println("Enter the Address:");
        map.put(contact.setAddress(),s.nextLine());
        System.out.println("Enter the City:");
        map.put(contact.setCity(),s.nextLine());
        System.out.println("Enter the State:");
        map.put(contact.setState(),s.nextLine());
        System.out.println("Enter the Zip:");
        map.put(contact.setZipCode(),s.nextLine());
        System.out.println("Enter the Phone Number:");
        map.put(contact.setPhoneNumber(),s.nextLine());
        System.out.println("Enter the Email:");
        map.put(contact.setEmail(),s.nextLine());

    }
    public static void printContact() {
        System.out.println("**********************************************"+
                "\nFirst Name:\s"+ map.get(contact.getFirstName())+
                "\nLast Name:\s"+map.get(contact.getLastName())+
                "\nAddress:\s"+map.get(contact.getAddress())+
                "\nCity:\s"+map.get(contact.getCity())+
                "\nState:\s"+map.get(contact.getState())+
                "\nZip Code:\s"+map.get(contact.getZipCode())+
                "\nPhone No:\s"+map.get(contact.getPhoneNumber())+
                "\nEmail:\s"+map.get(contact.getEmail())+
                "\n**********************************************"+
                "\nTotal Number of Contacts:\s" + map.size()+
                "\n**********************************************");
        }

    public static void main(String[] args) {
        addContact();
        printContact();
    }
}