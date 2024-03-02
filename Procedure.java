public class Procedure {
    private String procedureName;
    private String procedureDate;
    private String practitionerName;
    private double procedureCharges;

    public Procedure(String procedureName, String procedureDate, String practitionerName, double procedureCharges) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
        this.practitionerName = practitionerName;
        this.procedureCharges = procedureCharges;
    }

    @Override
    public String toString() {
        return "Procedure Information:" +
                "\n			Procedure: " + procedureName +
                "\n			Procedure Date: " + procedureDate +
                "\n			Practitioner: " + (practitionerName.isEmpty() ? "Not specified" : practitionerName) +
                "\n			Charges: $" + procedureCharges;
    }

    public double getProcedureCharges() {
        return procedureCharges;
    }
}