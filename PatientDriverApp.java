import java.text.DecimalFormat;
import java.util.Scanner;

public class PatientDriverApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter patient's full name:");
        String fullName = scanner.nextLine();

        System.out.println("Enter patient's address:");
        String address = scanner.nextLine();

        System.out.println("Enter emergency contact name and phone number:");
        String emergencyContact = scanner.nextLine();

        Patient patient = new Patient(fullName, address, emergencyContact);

        Procedure[] procedures = new Procedure[3];
        int procedureCount = 0;
        while (procedureCount < 3) {
            System.out.println("\nEnter details for Procedure " + (procedureCount + 1) + ":");
            System.out.println("Enter procedure name (leave empty to finish entering procedures):");
            String procedureName = scanner.nextLine();
            if (procedureName.isEmpty()) {
                break;
            }

            System.out.println("Enter procedure date:");
            String procedureDate = scanner.nextLine();

            System.out.println("Enter practitioner name (if any):");
            String practitionerName = scanner.nextLine();

            double procedureCharges;
            while (true) {
                System.out.println("Enter procedure charges:");
                String chargesInput = scanner.nextLine();
                try {
                    procedureCharges = Double.parseDouble(chargesInput);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number.");
                }
            }

            procedures[procedureCount++] = new Procedure(procedureName, procedureDate, practitionerName, procedureCharges);
        }

        System.out.println("\n" + patient);
        System.out.println("\nInformation about Procedures:");
        for (Procedure procedure : procedures) {
            if (procedure != null) {
                System.out.println(procedure);
            }
        }

        // Call the calculateTotalCharges method from the Patient class
        double totalCharges = Patient.calculateTotalCharges(procedures, procedureCount);
        DecimalFormat df = new DecimalFormat("#,##0.00");
        System.out.println("\nTotal Charges: $" + df.format(totalCharges));
        System.out.println ("\nStudent Name: Touch Nitan");
        System.out.println ("MC#: M21160429");
        System.out.println ("Due Date: 02/24/2024");

        scanner.close();
    }
}