import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Contact {
    private String contactName;
    private String phoneNumber;
    private String contactAddress;

    public Contact(String name, String contactNumber, String address) {
        this.contactName = name;
        this.phoneNumber = contactNumber;
        this.contactAddress = address;
    }

    public String getName() {
        return contactName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    @Override
    public String toString() {
        return "Name: " + " " + contactName + "Contact Number: " + phoneNumber + "Address: " + contactAddress;
    }
}

class AddressBook {
    private List<Contact> connection = new ArrayList<>();

    public void addContact(Contact contact) {
        connection.add(contact);
        System.out.println("Contact has been saved successfully");
    }

    public void removeContact(String name) {
        connection.removeIf(contact -> contact.getName().equalsIgnoreCase(name));
        System.out.println("Contact has been removed successfully.");
    }

    public Contact searchContact(String name){
        for (Contact contact : connection) {
            if (contact.getName().equalsIgnoreCase(name)){
                return contact;
            }
        }
        return null;
    }

    public void displayAllContacts() {
        System.out.println("List of all contacts:");
        for (Contact contact: connection) {
            System.out.println(contact);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();


        while (true) {
            System.out.println("\nAddress Book of Sid");
            System.out.println("1.Add a new contact");
            System.out.println("2.Remove a contact");
            System.out.println("3.Search a contact");
            System.out.println("4.Display all contacts");
            System.out.println("5.Exit Address Book");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter name of the contact:");
                    String name = scanner.nextLine();
                    System.out.println("Enter phone number:");
                    String contactNumber = scanner.nextLine();
                    System.out.println("Enter address of the individual:");
                    String address = scanner.nextLine();

                    Contact newContact = new Contact(name, contactNumber, address);
                    addressBook.addContact(newContact);
                    break;

                case 2:
                    System.out.println("Enter name of the contact to be removed: ");
                    String contactToRemove = scanner.nextLine();
                    addressBook.removeContact(contactToRemove);
                    break;

                case 3:
                    System.out.println("Enter name of the contact to be searched.");
                    String contactToSearch = scanner.nextLine();
                    Contact foundContact = addressBook.searchContact(contactToSearch);
                    if (foundContact!=null){

                        System.out.println("Contact has been found" + foundContact);
                    }
                    else {
                        System.out.println("Sorry ! Contact not found !");
                    }
                    break;

                case 4:
                    addressBook.displayAllContacts();
                    break;

                case 5:
                    System.out.println("Exiting Addressbook");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
