import java.util.Scanner;

public class Patient {
    private String fullName;
    private String address;
    private String emergencyContact;

    public Patient(String fullName, String address, String emergencyContact) {
        this.fullName = fullName;
        this.address = address;
        this.emergencyContact = emergencyContact;
    }

    @Override
    public String toString() {
        return "Patient Info:" +
                "\n Name: " + fullName +
                "\n Address: " + address +
                "\n Emergency Contact: " + emergencyContact;
    }

    public static double calculateTotalCharges(Procedure[] procedures, int procedureCount) {
        double totalCharges = 0.0;
        for (int i = 0; i < procedureCount; i++) {
            totalCharges += procedures[i].getProcedureCharges();
        }
        return totalCharges;
    }
}