import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {
        int i = 1;
        while (i<=3){
            System.out.println("Enter:[D/d]-Display Contacts" + "\s" +
                    "[B/b]-Add New AddressBook " + "\s" +
                    "[E/e]-Edit Contact" + "\s" +
                    "[A/a]-Add Contact " + "\s" +
                    "[R/r]-Remove Contact");
            Scanner value = new Scanner(System.in);
            char input = value.next().charAt(0);
            if (input == 'D' || input == 'd' || input == 'A' || input == 'a' ||
                    input == 'B' || input == 'b' || input == 'R' || input == 'r' || input == 'E' || input == 'e') {
                switch (input) {
                    case 'A', 'a' -> AddressBook.addContact();
                    case 'D', 'd' -> AddressBook.printContact();
//                    case 'B', 'b' -> AddressBook.addContact();
                    case 'R', 'r' -> AddressBook.removeContact();
                    case 'E', 'e' -> AddressBook.editContact();

                }
            } else {
                System.out.println("Error("+i+"): invalid input entered for the interstate question");
                i++;
            }
        }System.out.println("Too many args Program ended!");
    }
}