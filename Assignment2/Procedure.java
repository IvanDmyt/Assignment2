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
public class Procedure {
	
    private String procedureName;
    private String procedureDate;
    private String practitionerName;
    private double procedureCharges;

    // No-arg constructor
    public Procedure() {
    }

    // Constructor to initialize procedure name and date
    public Procedure(String procedureName, String procedureDate) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
    }

    // Constructor to initialize all attributes
    public Procedure(String procedureName, String procedureDate, String practitionerName, double procedureCharges) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
        this.practitionerName = practitionerName;
        this.procedureCharges = procedureCharges;
    }

    // Accessor and Mutator methods for each field
    public String getProcedureName() 
    { 
    	return procedureName; 
    }
    public void setProcedureName(String procedureName) 
    { 
    	this.procedureName = procedureName; 
    }
    public String getProcedureDate() 
    { 
    	return procedureDate; 
    }
    public void setProcedureDate(String procedureDate) 
    { 
    	this.procedureDate = procedureDate; 
    }
    public String getPractitionerName() 
    { 
    	return practitionerName; 
    }
    public void setPractitionerName(String practitionerName) 
    { 
    	this.practitionerName = practitionerName; 
    }
    public double getProcedureCharges() 
    { 
    	return procedureCharges; 
    }
    public void setProcedureCharges(double procedureCharges) 
    { 
    	this.procedureCharges = procedureCharges; 
    }

    // toString method to display procedure information
    public String toString() {
        return "Procedure Information:\n" +
                "Name: " + procedureName + "\n" +
                "Date: " + procedureDate + "\n" +
                "Practitioner: " + practitionerName + "\n" +
                "Charges: $" + procedureCharges;
    }
}