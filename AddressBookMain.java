import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {

        do {
            System.out.println("Enter:[D/d]-Display Contacts" + "\s" + "[A/a]-Add Contact " + "\s" +
                    "[E/e]-Edit Contact" + "\s" +
                    "[R/r]-Remove Contact");
            Scanner value = new Scanner(System.in);
            char input = value.next().charAt(0);
            switch (input) {
                case 'D', 'd' -> AddressBook.printContact();
                case 'A', 'a' -> AddressBook.addContact();
                case 'R', 'r' -> AddressBook.removeContact();
                case 'E', 'e' -> AddressBook.editContact();
            }
        } while (true);
    }
}