// wreite program that creates an object of the Owner class and displays the owner's name and email address.
//THE PROGRAM SHOULD PROMPT THE USER TO ENTER THE OWNER'S NAME AND EMAIL ADDRESS AND THEN DISPLAY THE OWNER'S NAME AND EMAIL ADDRESS.

import java.util.Scanner;

public class CreateOwnerObject {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the owner's name: ");
            String name = input.nextLine();
            System.out.println("Enter the owner's email address: ");
            String email = input.nextLine();
            Owner owner = new Owner(name, email);
            System.out.println("Owner's object: " + owner);
           // System.out.println("Owner's email address: " + owner.getEmail());
        } // Close the Scanner object
    }
}

class Owner {
    private String name;
    private String email;

    public Owner(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Owner [name=" + name + ", email=" + email + "]";
    }
}