// Ian Mwai Gachoki
//3132394

package griffith;

//The Person class implements the Comparable interface, which means it can be compared to other Person objects.
public class Person implements Comparable<Person> {
	
	// Private fields for the surname and first name of the person
	private final String surname;
	private final String firstName;
	
	

    // Constructor that takes first name and surname and throws an error if someone tries to create a person with null names
	public Person (String firstName, String surname) {
		
		// Check if the first name or surname is null, if so throw an exception
		if(firstName == null || surname == null) {
			throw new IllegalArgumentException("The First name and surname should not be null");
		}
		
		// Assign values to the instance variables
		this.firstName = firstName;
		this.surname = surname;
		
	}
	
	// Getter for surname
	public String surname() {
		return surname;
	}
	
	// Getter for firstName 
	public String firstName() {
		return firstName;
	}
	
    public String toString() {
        return firstName + " " + surname;
    }
	
 
 // Override toString method to return a string representation of the Person object
    // It combines the first name and surname
	public int compareTo(Person person) {
		// Compare surnames first
		int surnameComparison = this.surname.compareTo(person.surname);
		
		// Checks if surnames are the same
		return (surnameComparison != 0) ? surnameComparison : this.firstName.compareTo(person.firstName);
	}
	
	// Override the equals method to check if two Person objects are equal.
	public boolean equals(Object otherPerson) {
		if (this == otherPerson) {
			return true;
		}
		//Checks if otherPerson is null or not of the same class
		if (otherPerson == null || getClass() != otherPerson.getClass()) {
			return false;
		}
		
		// Cast the object to a Person and check if both first name and surname are the same
		Person person = (Person) otherPerson;
		
		return firstName.equals(person.firstName)&& surname.equals(person.surname);
	}
	
	 // Override hashCode method to generate a hash code based on the first name and surname
	public int hashCode () {
		return firstName.hashCode() + surname.hashCode();
	}
	

}
