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
public class Patient {

    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String emergencyContactName;
    private String emergencyContactPhone;

    // No-arg constructor
    public Patient() 
    {
    }

    // Constructor to initialize first, middle, and last name
    public Patient(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    // Constructor to initialize all attributes
    public Patient(String firstName, String middleName, String lastName, String address, String city, String state, String zip, String phoneNumber, String emergencyContactName, String emergencyContactPhone) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.emergencyContactName = emergencyContactName;
        this.emergencyContactPhone = emergencyContactPhone;
    }

    // Accessor and Mutator methods for each field
    public String getFirstName() 
    { 
    	return firstName; 
    }
    public void setFirstName(String firstName) 
    { 
    	this.firstName = firstName; 
    }
    public String getMiddleName() 
    { 
    	return middleName; 
    }
    public void setMiddleName(String middleName) 
    { 
    	this.middleName = middleName; 
    }
    public String getLastName() 
    { 
    	return lastName; 
    }
    public void setLastName(String lastName) 
    { 
    	this.lastName = lastName; 
    }
    public String getAddress() 
    { 
    	return address; 
    }
    public void setAddress(String address) 
    { 
    	this.address = address; 
    }
    public String getCity() 
    { 
    	return city; 
    }
    public void setCity(String city) 
    { 
    	this.city = city; 
    }
    public String getState() 
    { 
    	return state; 
    }
    public void setState(String state) 
    { 
    	this.state = state; 
    }
    public String getZip() 
    { 
    	return zip; 
    }
    public void setZip(String zip) 
    { 
    	this.zip = zip; 
    }
    public String getPhoneNumber() 
    { 
    	return phoneNumber; 
    }
    public void setPhoneNumber(String phoneNumber) 
    { 
    	this.phoneNumber = phoneNumber; 
    }
    public String getEmergencyContactName() 
    { 
    	return emergencyContactName; 
    	}
    public void setEmergencyContactName(String emergencyContactName) 
    {
    	this.emergencyContactName = emergencyContactName;
    }
    
    public String getEmergencyContactPhone() 
    { 
    	return emergencyContactPhone; 
    }
    public void setEmergencyContactPhone(String emergencyContactPhone) 
    { 
    	this.emergencyContactPhone = emergencyContactPhone; 
    }

    // Method to build full name
    public String buildFullName() 
    {
        return firstName + " " + middleName + " " + lastName;
    }

    // Method to build address
    public String buildAddress() 
    {
        return address + " " + city + " " + state + " " + zip;
    }

    // Method to build emergency contact info
    public String buildEmergencyContact() 
    {
        return emergencyContactName + " " + emergencyContactPhone;
    }

    // toString method to display all information
        public String toString() {
        return "Patient Information:\n" +
                "Full Name: " + buildFullName() + "\n" +
                "Address: " + buildAddress() + "\n" +
                "Phone: " + phoneNumber + "\n" +
                "Emergency Contact: " + buildEmergencyContact();
    }
}