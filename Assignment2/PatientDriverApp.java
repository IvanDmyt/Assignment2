package Assigntments;
/*
 * Class: CMSC203 
 * Instructor:Professor Monshi
 * Description: Computer Science class where we study object oriented design using Java programming language
 * Due: 10/04/2024
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Ivan Sergiyovych Dmytriiev
*/
import java.util.Scanner;

public class PatientDriverApp {
    public static void main(String[] args) {
    	
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Patient's First Name: ");
        String firstName = in.nextLine();
        
        System.out.println("Enter Patient's Middle Name: ");
        String middleName = in.nextLine();
        
        System.out.println("Enter Patient's Last Name: ");
        String lastName = in.nextLine();
        
        System.out.println("Enter Address: ");
        String address = in.nextLine();
        
        System.out.println("Enter City: ");
        String city = in.nextLine();
        
        System.out.println("Enter State: ");
        String state = in.nextLine();
        
        System.out.println("Enter ZIP: ");
        String zip = in.nextLine();
        
        System.out.println("Enter Phone Number: ");
        String phone = in.nextLine();
        
        System.out.println("Enter Emergency Contact Name: ");
        String emergencyContact = in.nextLine();
        
        System.out.println("Enter Emergency Contact Phone: ");
        String emergencyPhone = in.nextLine();
        

        Patient patient = new Patient(firstName, middleName, lastName, address, city, state, zip, phone, emergencyContact, emergencyPhone);

        displayPatient(patient);

        Procedure procedure1 = new Procedure("X-Ray", "06/12/2023", "Dr. Smith", 250.00);
        Procedure procedure2 = new Procedure("Blood Test", "06/15/2023");
        procedure2.setPractitionerName("Dr. Johnson");
        procedure2.setProcedureCharges(150.00);
        Procedure procedure3 = new Procedure();
        procedure3.setProcedureName("MRI");
        procedure3.setProcedureDate("06/20/2023");
        procedure3.setPractitionerName("Dr. Lee");
        procedure3.setProcedureCharges(500.00);

        // Display the Procedures
        displayProcedure(procedure1);
        displayProcedure(procedure2);
        displayProcedure(procedure3);

        // Calculate and display total charges
        double totalCharges = calculateTotalCharges(procedure1, procedure2, procedure3);
        System.out.println("Total Charges: $" + totalCharges);

        // Display completion message
        System.out.println("Student Name: Ivan Dmytriiev");
        System.out.println("MC#: #21210287");
        System.out.println("Due date: 10/04/2024");
    }

    // Method to display Patient information
    public static void displayPatient(Patient patient) {
        System.out.println("\n" + patient);
    }

    // Method to display Procedure information
    public static void displayProcedure(Procedure procedure) {
        System.out.println("\n" + procedure);
    }

    // Method to calculate total charges for the procedures
    public static double calculateTotalCharges(Procedure p1, Procedure p2, Procedure p3) {
        return p1.getProcedureCharges() + p2.getProcedureCharges() + p3.getProcedureCharges();
    }
}