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

    public static void editContact(){
        System.out.println("Enter your First name:");
        String firstName = s.nextLine();
        if (firstName.equals(map.get(contact.getFirstName()))){
            int i = 1;
            while (i<=3){
                System.out.println("Choose field you want to add:");
                System.out.println("[L/l]Last Name\s[C/c]City\s[S/s]State\s[Z/z]Zip\s[P/p]Phone Number\s[E/e]Email ");
                char value = s.next().charAt(0);
                if (value == 'L' || value == 'l' || value == 'c' || value == 'C' || value == 's' || value == 'S' ||
                        value == 'z' || value == 'Z' || value == 'p' || value == 'P' || value == 'e' || value == 'E') {
                    switch (value) {
                        case 'L', 'l' -> {
                            System.out.println("Re-Correct your lastname");
                            contact.setLastName(s.next());
                        }
                        case 'c', 'C' -> {
                            System.out.println("Re-Correct your City");
                            contact.setCity(s.next());
                        }
                        case 's', 'S' -> {
                            System.out.println("Re-Correct your State");
                            contact.setState(s.next());
                        }
                        case 'z', 'Z' -> {
                            System.out.println("Re-Correct your Zip");
                            contact.setZipCode(s.next());
                        }
                        case 'p', 'P' -> {
                            System.out.println("Re-Correct your Phone Number");
                            contact.setPhoneNumber(s.next());
                        }
                        case 'e', 'E' -> {
                            System.out.println("Re-Correct your Email");
                            contact.setEmail(s.next());
                        }
                    }
                } else {
                    System.out.println("Error("+i+"): invalid input entered for the interstate question");
                    i++;
                }
                System.out.println("Too many args Edite ended!");
            }

        }
    }


    public static void main(String[] args) {
        addContact();
        printContact();
        editContact();
    }
}